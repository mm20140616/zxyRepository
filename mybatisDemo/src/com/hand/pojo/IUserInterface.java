package com.hand.pojo;

import com.hand.pojo.User;

import java.util.List;

public interface IUserInterface {
    //该方法名称必须与User.xml中的select语句的id相同
    public User selectUserById(int id);
    public List<User> selectUsers(String userName);
    public void addUser(User user);
    public void updateUser(User user);
    public void deleteUserById(int id);
    public List<Article> getUserArticles(int id);
}
