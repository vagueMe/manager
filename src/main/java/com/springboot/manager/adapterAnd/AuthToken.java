package com.springboot.manager.adapterAnd;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.springboot.manager.common.CommonUtils;
import com.springboot.manager.common.RedisUtils;
import com.springboot.manager.conf.Constant;
import com.springboot.manager.model.protocols.AnyException;
import com.springboot.manager.model.protocols.ApiCodeEnum;
import com.springboot.manager.model.protocols.AuthUser;
import com.springboot.manager.properties.JwtProperties;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 9:58 2018/2/28
 */
@Component
public class AuthToken {

    public final static ThreadLocal<AuthUser> theadUser =  new ThreadLocal<AuthUser>();


    public static JwtProperties jwtProperties ;


    @Autowired
    private  void setJwtProperties(JwtProperties jwtProperties) {
        this.jwtProperties = jwtProperties;
    }

    public AuthUser getCurrentUser() { return theadUser.get(); }

    public void setCurrentUser(AuthUser user) { theadUser.set(user); }

    /**
     * 生成token
     * @param authuser
     * @param time
     * @return
     */
    public static  String CreateJWTToken(AuthUser authuser ,Long time){
        String key = jwtProperties.getBase64EncodedSecretKey();
        JwtBuilder jwtBuilder = Jwts.builder();
            jwtBuilder.setClaims(JSONObject.parseObject(JSON.toJSONString(authuser), Map.class))
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256, jwtProperties.getBase64EncodedSecretKey());
        if(time > 0){
            jwtBuilder.setExpiration(new Date(System.currentTimeMillis()+time));
        }
        return jwtBuilder.compact();
    }

    /**
     * 解析token
     * @param token
     * @return
     */
    public static AuthUser  praseJWTToken(String token){
        AuthUser authUser = null;
        try {
            Claims claims = Jwts.parser()
                    .setSigningKey(jwtProperties.getBase64EncodedSecretKey())
                    //.setSigningKey(DatatypeConverter.parseBase64Binary(jwtProperties.getBase64EncodedSecretKey()))
                    .parseClaimsJws(token)
                    .getBody();
            authUser = JSONObject.parseObject(JSON.toJSONString(claims),AuthUser.class);
        }catch (Exception e){
            e.printStackTrace();
            throw new AnyException(ApiCodeEnum.TOKEN_INVALID);
        }
       return authUser;
    }

    public static AuthUser createRedisToken(AuthUser authuser){
        RedisUtils redisUtils = new RedisUtils();
        Set<String> keyset = redisUtils.keys(authuser.getUserName());
        keyset.stream().forEach(key ->redisUtils.del(key));
        String token = authuser.getUserName()+"_"+CommonUtils.uuid();
        authuser.setToken(token);
        redisUtils.hset(authuser.getToken(), Constant.USER_INFO, JSON.toJSONString(authuser));
        redisUtils.expire(authuser.getToken(),Constant.TOKEN_TTLMILLIS, TimeUnit.HOURS);
        return authuser;
    }

    public static AuthUser praseRedisToken(String token){
        RedisUtils redisUtils = new RedisUtils();
        String authuserJsonString = ObjectUtils.nullSafeToString(redisUtils.hget(token, Constant.USER_INFO));
        AuthUser authuser = JSON.parseObject(authuserJsonString,AuthUser.class);
        if(authuser != null){
            redisUtils.expire(token, Constant.TOKEN_TTLMILLIS, TimeUnit.HOURS);
        }else{
            throw new AnyException(ApiCodeEnum.TOKEN_INVALID);
        }
        return authuser;
    }







}
