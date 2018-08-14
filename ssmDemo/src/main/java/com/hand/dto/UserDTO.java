package com.hand.dto;

import org.springframework.stereotype.Component;

import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigInteger;

/**
 * @ProjectName ssmDemo
 * @ClassName UserDTO
 * @Description TODO
 * @Author 赵晓宇
 * @Date 2018/8/12 13:21
 * @Version 1.0
 **/
public class UserDTO implements Serializable {
    private static final long serialVersionUID=1L;

    private BigInteger id; //自增主键ID
    private String username; //用户名
    private String password; //密码
    private String truename; //真实姓名
    private int flag; //标记，为1时表示用户启用，0为禁用，默认为禁用

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public UserDTO(BigInteger id, String username, String password, String truename, int flag) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.truename = truename;
        this.flag = flag;
    }

    public UserDTO () {

    }
}
