package com.hand.service.impl;

import com.hand.dto.User;
import com.hand.mappers.UserMapper;
import com.hand.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User checkLogin(String username, String password) {
        List<User> userList = userMapper.findUserByNameAndPwd(username,password);
        if (userList.isEmpty()) {
            User user=new User();
            user.set__status("error");
            user.setMessage("没有查到用户");
            return user;
        }
        /*按照用户默认不重复的情况进行处理*/
        User user = userList.get(0);
        String upass = user.getPassword();
        if (!password.equals(upass)) {
            user.set__status("error");
            user.setMessage("密码错误");
            return user;
        }
        user.set__status("success");
        user.setMessage("用户信息确认成功！！！");
        return user;
    }

    @Override
    public User findUserById(Integer userId) {
        User user = userMapper.findUserById(userId);
        System.out.println(user.getUserId()+"|"+user.getPhoneNumber());
        user.set__status("success");
        user.setMessage("查找成功");
        return user;
    }

}
