package com.hand.dao;

import com.hand.dto.User;

public interface LoginDAO {

    User checkLogin(String username,String password);
}
