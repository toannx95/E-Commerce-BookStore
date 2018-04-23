package com.bookstore.util.converter;

import org.modelmapper.ModelMapper;

import com.bookstore.dto.RoleDTO;
import com.bookstore.dto.UserDTO;
import com.bookstore.entity.Role;
import com.bookstore.entity.User;

public class DAOConverter {

	public static User convertUser(UserDTO userDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userDTO, User.class);
	}

	public static Role convertRole(RoleDTO roleDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(roleDTO, Role.class);
	}

}
