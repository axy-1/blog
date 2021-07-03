package com.self.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * @author axy
 * @create 2021-07-01-11:29
 */
public class JwtToken implements AuthenticationToken {

    private String token;
    public JwtToken(String jwt){
        this.token = jwt;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
