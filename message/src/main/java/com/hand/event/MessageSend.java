package com.hand.event;

import com.hand.event.MessageSendEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @ProjectName message
 * @ClassName MessageSend
 * @Description TODO 触发发送邮件事件
 * @Author 赵晓宇
 * @Date 2018/8/15 13:51
 * @Version 1.0
 **/
@Component
public class MessageSend {


    public void sendMessage(ApplicationContext applicationContext,String letter,String address,Object object) {
        System.out.println("开始发送邮件");
        MessageSendEvent mse = new MessageSendEvent(applicationContext,letter,address,object);
        /*发布事件*/
        applicationContext.publishEvent(mse);
    }
}
