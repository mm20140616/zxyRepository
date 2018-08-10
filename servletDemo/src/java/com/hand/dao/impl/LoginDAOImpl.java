package com.hand.dao.impl;

import com.hand.dao.LoginDAO;
import com.hand.dto.User;

import java.sql.*;

/**
 * @ProjectName servletDemo
 * @ClassName LoginDAOImpl
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/10 15:44
 * @Version 1.0
 **/
public class LoginDAOImpl implements LoginDAO {

    @Override
    public User checkLogin(String username, String password) {
        String sql = "select * from t_user where username=? and password=?";
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        User user = null;
        try{
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test",
                    "root",
                    "admin");
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if (rs.next()) {
                user = new User(rs.getString(1),rs.getString(2));
            }

        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                try{
                    conn.close();
                }catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return user;
    }
}
