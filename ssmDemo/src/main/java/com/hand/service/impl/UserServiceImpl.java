package com.hand.service.impl;

import com.hand.dto.UserDTO;
import com.hand.mapping.UserMapping;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ProjectName ssmDemo
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/12 14:20
 * @Version 1.0
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapping userMapping;

    public UserDTO selectUserById(int id) {
        UserDTO user = userMapping.selectUserById(id);
        return user;
    }
}
