package com.springboot.manager.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 10:16 2018/2/28
 */

@Configuration
@ConfigurationProperties(prefix = "awesome.jwt")
@EnableConfigurationProperties(JwtProperties.class)
public class JwtProperties {
    private String base64EncodedSecretKey;
    private String issuer;

    public String getBase64EncodedSecretKey() { return base64EncodedSecretKey; }

    public void setBase64EncodedSecretKey(String base64EncodedSecretKey) { this.base64EncodedSecretKey = base64EncodedSecretKey; }

    public String getIssuer() { return issuer; }

    public void setIssuer(String issuer) { this.issuer = issuer; }
}
