package com.hand.service.impl;

import com.hand.dao.LoginDAO;
import com.hand.dao.impl.LoginDAOImpl;
import com.hand.dto.User;
import com.hand.service.LoginService;

/**
 * @ProjectName servletDemo
 * @ClassName LoginServiceImpl
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/10 15:40
 * @Version 1.0
 **/
public class LoginServiceImpl implements LoginService {

    LoginDAO loginDAO = new LoginDAOImpl();

    @Override
    public User checkLogin(String username, String password) {
        User user = loginDAO.checkLogin(username,password);
        return user;
    }
}
