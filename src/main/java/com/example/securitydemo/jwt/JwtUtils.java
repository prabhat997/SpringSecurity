package com.example.securitydemo.jwt;

import com.sun.net.httpserver.HttpServer;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

public class JwtUtils {

    //getting JWT from header
    public String getJwtFromHeader(HttpServletRequest request){
        
        String bearerToken= request.getHeader("Authorization");
        if(bearerToken!=null&&bearerToken.startsWith("Bearer ")){
            return bearerToken.substring(7);
        }
    }

    //generating token from username
    //getting username from JWT token
    //generate signing key
    //validate JWT token
}
