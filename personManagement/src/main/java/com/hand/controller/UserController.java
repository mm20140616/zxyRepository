package com.hand.controller;

import com.hand.dto.User;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping("/userListShow")
    @ResponseBody
    public User findUserById (@RequestBody User user) {
        int userId = user.getUserId();
        User user1 = userService.findUserById(userId);
        return user1;
    }
}
