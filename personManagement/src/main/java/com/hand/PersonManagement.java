package com.hand;

import javafx.application.Application;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * 启动类
 */

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("resources.mapping")
public class PersonManagement {
    public static void main (String[] args) throws Exception {
        SpringApplication.run(PersonManagement.class,args);
    }
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application){
        return application.sources(Application.class);
    }
}
