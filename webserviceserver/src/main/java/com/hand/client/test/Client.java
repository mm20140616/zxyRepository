package com.hand.client.test;


import com.hand.client.HelloWorldServerService;

/**
 * @ProjectName webserviceserver
 * @ClassName Client
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/8 11:43
 * @Version 1.0
 **/
public class Client {
    public static void main(String[] args) {
        HelloWorldServerService hwss = new HelloWorldServerService();
        String hello = hwss.getHelloWorldServerPort().getHelloWorld();
        System.out.println(hello);

    }
}
