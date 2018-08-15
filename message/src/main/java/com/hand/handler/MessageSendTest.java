package com.hand.handler;

import com.hand.event.MessageSend;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

/**
 * @ProjectName message
 * @ClassName MessageSendTest
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/15 14:05
 * @Version 1.0
 **/
public class MessageSendTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("请输入信件内容：");
        Scanner scanner = new Scanner(System.in);
        String letter = scanner.next();
        System.out.println("请输入邮寄地址：");
        Scanner scanner1 = new Scanner(System.in);
        String address = scanner1.next();
        MessageSend ms = (MessageSend) context.getBean("MessageSend");
        BasicDataSource dataSource = (BasicDataSource) context.getBean("dataSource");
        ms.sendMessage(context,letter,address,dataSource);

    }
}

