package com.hand.service;

import com.hand.dto.User;

public interface LoginService {
    User checkLogin(String username,String password);
}
