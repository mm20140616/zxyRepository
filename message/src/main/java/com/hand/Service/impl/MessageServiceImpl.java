package com.hand.Service.impl;

import com.hand.Service.MessageService;
import com.hand.dao.MessageDAO;
import com.hand.dao.impl.MessageDAOImpl;
import com.hand.dto.MessageDTO;

/**
 * @ProjectName message
 * @ClassName MessageServiceImpl
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/15 14:39
 * @Version 1.0
 **/
public class MessageServiceImpl implements MessageService {

    MessageDAO dao = new MessageDAOImpl();

    @Override
    public int messageSave(MessageDTO md) {
        int flag = dao.messageSave(md);
        return flag;
    }
}
