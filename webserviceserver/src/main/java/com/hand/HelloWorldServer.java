package com.hand;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/**
 * @ProjectName webserviceserver
 * @ClassName com.hand.HelloWorldServer
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/8 11:11
 * @Version 1.0
 **/
@WebService
public class HelloWorldServer {

    public String getHelloWorld () {
        return "hello world!";
    }

    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/service/serviceHello",new HelloWorldServer());
        System.out.println("发布成功");
    }
}
