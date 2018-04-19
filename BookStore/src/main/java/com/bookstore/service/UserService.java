package com.bookstore.service;

import com.bookstore.dto.UserDTO;

public interface UserService {

	UserDTO create(UserDTO userDTO);

	UserDTO findByUserNameAndEnabledTrue(String userName);

	UserDTO findByUserName(String userName);

}
