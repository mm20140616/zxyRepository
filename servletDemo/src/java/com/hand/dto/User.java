package com.hand.dto;

/**
 * @ProjectName servletDemo
 * @ClassName User
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/10 15:38
 * @Version 1.0
 **/
public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public User () {

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
