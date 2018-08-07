package com.hand.mappers;

import com.hand.dto.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Mapper
public interface UserMapper {

    //查找用户是否存在
    List<User> findUserByNameAndPwd(String username, String password);

    User findUserById(Integer userId);

}
