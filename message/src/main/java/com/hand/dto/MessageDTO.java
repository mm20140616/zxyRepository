package com.hand.dto;

import com.hand.dao.MessageDAO;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.apache.commons.dbcp.BasicDataSource;

/**
 * @ProjectName message
 * @ClassName MessageDTO
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/15 14:46
 * @Version 1.0
 **/
public class MessageDTO {
    private String letter;
    private String address;
    private BasicDataSource dataSource;

    public MessageDTO(String letter, String address,BasicDataSource dataSource) {
        this.letter = letter;
        this.address = address;
        this.dataSource = dataSource;
    }
    public void MessageDAO () {}

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public BasicDataSource getDataSource() {
        return dataSource;
    }

    public void setDataSource(BasicDataSource dataSource) {
        this.dataSource = dataSource;
    }
}
