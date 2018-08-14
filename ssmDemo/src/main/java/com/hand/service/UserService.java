package com.hand.service;

import com.hand.dto.UserDTO;

public interface UserService {
    UserDTO selectUserById (int id);
}
