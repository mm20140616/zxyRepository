package com.hand.dao.impl;

import com.hand.dao.MessageDAO;

import com.hand.dto.MessageDTO;

import org.springframework.jdbc.core.JdbcTemplate;


/**
 * @ProjectName message
 * @ClassName MessageDAOImpl
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/15 14:42
 * @Version 1.0
 **/

public class MessageDAOImpl implements MessageDAO {

    @Override
    public int messageSave(MessageDTO md) {
        String sql = "insert into t_message(letter,address) values(?,?)";
        JdbcTemplate jdbcTemplate = new JdbcTemplate(md.getDataSource());
        int flag = jdbcTemplate.update(sql, md.getLetter(), md.getAddress());
        return flag;
    }
}
