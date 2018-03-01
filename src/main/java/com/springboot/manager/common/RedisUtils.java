package com.springboot.manager.common;

import lombok.extern.log4j.Log4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 9:26 2018/3/1
 */
@Component
@Log4j
public class RedisUtils {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    public void set(String key , String value){
        stringRedisTemplate.opsForValue().set(key,value);
    }

    public String get(String key){
        return stringRedisTemplate.opsForValue().get(key);
    }

    public void hset(String h, Object hk , Object hv){
        stringRedisTemplate.opsForHash().put(h, hk, hv);
    }

    public void hmset(String h , Map map){
        stringRedisTemplate.opsForHash().putAll(h,map);
    }

    public Object hget(String h ,Object hk){
        return stringRedisTemplate.opsForHash().get(h, hk);
    }

    public Set keys(String key){
       return stringRedisTemplate.keys(key);
    }


    public void expire(String key , Long timeout , TimeUnit timeUnit){
        stringRedisTemplate.expire(key ,timeout ,timeUnit);
    }

    public void del(String key){
        stringRedisTemplate.delete(key);
    }


    /**
     * Redis分布式加锁
     * @param key
     * @param time
     * @return
     */
    public boolean lock(String key ,String time){
        if(stringRedisTemplate.opsForValue().setIfAbsent(key,time)){
            String currentTimeStr = stringRedisTemplate.opsForValue().get(key);
            if( !StringUtils.isEmpty(currentTimeStr) && Long.valueOf(currentTimeStr) < System.currentTimeMillis()){
                String oldtime = stringRedisTemplate.opsForValue().getAndSet(key,time);
                if(!StringUtils.isEmpty(oldtime) && oldtime.equals(currentTimeStr)){
                    return true;
                }
            }
        }
        return false;
    }

    public void unlock(String key ,String time){
        try{
            String  currenttime = stringRedisTemplate.opsForValue().get(key);
            if(!StringUtils.isEmpty(currenttime) &&  currenttime.equals(time)){
                stringRedisTemplate.opsForValue().getOperations().delete(key);
            }
        }catch(Exception e){
            log.error("解锁出错,{}",e);
        }

    }

}
