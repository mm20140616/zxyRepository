package com.hand.service.impl;

import com.hand.dto.BaseDTO;
import com.hand.dto.UserDTO;
import com.hand.mapping.UserMapping;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;

/**
 * @ProjectName ssmDemo
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/12 14:20
 * @Version 1.0
 **/
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapping userMapping;

    public UserDTO selectUserByUserNameAndPassword(UserDTO userDTO ,HttpSession httpSession) {
        UserDTO user = userMapping.selectUserByUserNameAndPassword(userDTO);

        /**
         * 功能描述：判断是否符合登录条件，UserDTO继承了BaseDTO类
         * 在BaseDTO类中装载着前台发送ajax时返回的success中的参数。
         * @Author zhaoxiaoyu
         * @Date 2018/8/20 9:16
         * @Param [userDTO, httpSession]
         * @return com.hand.dto.UserDTO
         **/
        boolean f = user != null && user.getFlag() == 1;
        if (f) {
            httpSession.setAttribute("username",user.getUsername());
            user.set__status("success");
            user.setMessage("登录验证成功");
            return user;
        } else {
            user.set__status("error");
            user.setMessage("登录验证失败");
            return user;
        }

    }
}
