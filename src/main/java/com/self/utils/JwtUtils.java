package com.self.utils;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * JWT工具类
 * @author axy
 * @create 2021-07-01-14:14
 */
@Slf4j
@Data
@Component
@ConfigurationProperties(prefix = "jwt")
public class JwtUtils {
    private String secret;
    private Long expire;
    private String header;

    /**
     * 生成jwt token
     * @param userId
     * @return
     */
    public String generateToken(Long userId){
        Date nowDate = new Date();
        Date expireDate = new Date(nowDate.getTime() + expire * 1000);

        return Jwts.builder()
                .setHeaderParam("typ","JWT")
                .setSubject(userId + "")
                .setIssuedAt(nowDate)
                .setExpiration(expireDate)
                .signWith(SignatureAlgorithm.HS512,secret)
                .compact();
    }

    public Claims getClaimByToken(String token){

        try {
            return Jwts.parser()
                    .setSigningKey(secret)
                    .parseClaimsJws(token)
                    .getBody();
        } catch (Exception e) {
            log.debug("validate is token error",e);
            return null;
        }

    }

    /**
     * token是否过期
     * @param expiration
     * @return true 过期
     */
    public boolean isTokenExpired(Date expiration){
        return expiration.before(new Date());
    }

}
