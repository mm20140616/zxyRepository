package com.hand.controller;

import com.hand.dto.User;
import com.hand.service.LoginService;
import com.hand.service.impl.LoginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ProjectName servletDemo
 * @ClassName CheckLogin
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/10 14:58
 * @Version 1.0
 **/
public class CheckLogin extends HttpServlet {

    LoginService loginService = new LoginServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        resp.setContentType("text/html;charset=UTF-8");
        User user = loginService.checkLogin(username,password);
        if (user == null) {
            resp.sendRedirect("/error.html");
        } else {
            req.getRequestDispatcher("/main.html").forward(req,resp);
        }


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
