package com.hand.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @ProjectName servletDemo
 * @ClassName com.hand.controller.HelloWorld
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/10 12:15
 * @Version 1.0
 **/
public class HelloWorld extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter pw = resp.getWriter();
        pw.println("Hello World!!!");
        pw.close();
    }
}
