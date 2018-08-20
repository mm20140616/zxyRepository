package com.hand.controller;

import com.hand.dto.BaseDTO;
import com.hand.dto.UserDTO;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName ssmDemo
 * @ClassName UserController
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/12 13:46
 * @Version 1.0
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/checkLogin")
    public UserDTO selectUserByUserNameAndPassword (@RequestBody UserDTO userDTO,HttpSession httpSession) {
        UserDTO user = userService.selectUserByUserNameAndPassword(userDTO,httpSession);
        return user;
    }



}
