package com.hand.event;

import org.springframework.context.ApplicationContext;
import org.springframework.context.event.ApplicationContextEvent;

/**
 * @ProjectName message
 * @ClassName MessageSendEvent
 * @Description TODO 邮件发送Event
 * @Author 赵晓宇
 * @Date 2018/8/15 13:51
 * @Version 1.0
 **/
public class MessageSendEvent extends ApplicationContextEvent {

    private String letter; //发送内容
    private String address;     //发送的目的地
    private Object object ; //传送datasource

    public MessageSendEvent(ApplicationContext source,String letter,String address,Object object) {
        super(source);
        this.letter = letter;
        this.address = address;
        this.object = object;
    }
    public String getLetter() {
        return this.letter;
    }
    public String getAddress() {
        return this.address;
    }
    public Object getObject() {
        return this.object;
    }
}
