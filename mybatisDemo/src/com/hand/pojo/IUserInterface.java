package com.hand.pojo;

import com.hand.pojo.User;

import java.util.List;

public interface IUserInterface {
    //该方法名称必须与User.xml中的select语句的id相同
     User selectUserById(int id);
     List<User> selectUsers(String userName);
     void addUser(User user);
     void updateUser(User user);
     void deleteUserById(int id);
     List<Article> getUserArticles(int id);
}
