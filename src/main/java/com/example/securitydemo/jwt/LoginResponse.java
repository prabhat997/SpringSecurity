package com.example.securitydemo.jwt;

import java.util.List;

public class LoginResponse {

    private String jwtToken;
    private String username;

    private List<String> roles;

    public LoginResponse(String jwt, String username, List<String> roles) {
        this.jwtToken = jwt;
        this.username = username;
        this.roles = roles;
    }

    public String getJwt() {
        return jwtToken;
    }

    public void setJwt(String jwt) {
        this.jwtToken = jwt;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
