package com.hand.controller;

import com.hand.dto.User;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class LoginController {

    @Autowired
    UserService userService;
    @RequestMapping("/checkLogin")
    @ResponseBody
    public User getUser (@RequestBody User user) {
        User user1 = userService.checkLogin(user.getUserName(),user.getPassword());
        return user1;
    }
}














