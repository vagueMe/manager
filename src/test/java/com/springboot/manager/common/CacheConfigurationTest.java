package com.springboot.manager.common;

import com.springboot.manager.model.generator.Province;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 14:13 2018/2/6
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CacheConfigurationTest {

    @Autowired
    private CacheManager cacheManager;

    @Test
    public void contextLoads() {
        Cache cache = cacheManager.getCache("myCache");
        Province province = new Province();
        province.setProvinceId(111111);
        province.setProvinceName("hahahhaha");
        cache.put("code_cache", province);

        Cache cache2 = cacheManager.getCache("myCache");
        Cache.ValueWrapper valueWrapper = cache2.get("code_cache");
        Province map = (Province) valueWrapper.get();
        System.out.println(map.getProvinceId());
        System.out.println(map.getProvinceName());

    }
}