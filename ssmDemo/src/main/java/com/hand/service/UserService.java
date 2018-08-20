package com.hand.service;

import com.hand.dto.UserDTO;

import javax.servlet.http.HttpSession;

public interface UserService {
    UserDTO selectUserByUserNameAndPassword (UserDTO userDTO, HttpSession httpSession);
}
