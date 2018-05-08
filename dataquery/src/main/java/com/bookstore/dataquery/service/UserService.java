package com.bookstore.dataquery.service;

import com.bookstore.dataquery.dto.UserDTO;

public interface UserService {

	UserDTO findOne(Long id);

	UserDTO save(UserDTO userDTO);

	UserDTO create(UserDTO userDTO);

	UserDTO findByUserNameAndEnabledTrue(String userName);

	UserDTO findByUserName(String userName);

}
