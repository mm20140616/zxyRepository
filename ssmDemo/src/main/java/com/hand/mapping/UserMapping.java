package com.hand.mapping;

import com.hand.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapping {

    UserDTO selectUserById(int id);
}
