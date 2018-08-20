package com.hand.mapping;

import com.hand.dto.UserDTO;

public interface UserMapping {

    UserDTO selectUserByUserNameAndPassword (UserDTO userDTO);
}
