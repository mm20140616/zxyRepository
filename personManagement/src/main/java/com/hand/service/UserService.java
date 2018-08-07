package com.hand.service;


import com.hand.dto.User;

public interface UserService {
    User checkLogin(String username,String password);
    User findUserById(Integer userId);
}
