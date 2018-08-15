package com.hand.event;

import com.hand.Service.MessageService;
import com.hand.Service.impl.MessageServiceImpl;
import com.hand.dao.MessageDAO;
import com.hand.dao.impl.MessageDAOImpl;
import com.hand.dto.MessageDTO;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName message
 * @ClassName MessageSendListentr
 * @Description TODO 添加发送邮件事件的监听器
 * @Author 赵晓宇
 * @Date 2018/8/15 13:55
 * @Version 1.0
 **/
@Component
public class MessageSendListener implements ApplicationListener<MessageSendEvent> {

    MessageService service = new MessageServiceImpl();
    //MessageDAO dao = new MessageDAOImpl();
    @Override
    public void onApplicationEvent(MessageSendEvent msgEvent) {
        String letter = msgEvent.getLetter();
        String address = msgEvent.getAddress();
        BasicDataSource dataSource = (BasicDataSource) msgEvent.getObject();
        System.out.println("zxy向"+address+"发送了内容为"+letter+"的邮件");

        MessageDTO md = new MessageDTO(letter,address,dataSource);
        int flag = service.messageSave(md);
        if (flag == 1) {
            System.out.println("保存信件成功");
        }else{
            System.out.println("失败");
        }
        //dao.messageSave(md);
    }
}
