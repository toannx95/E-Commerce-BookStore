package com.bookstore.util.converter;

import org.modelmapper.ModelMapper;

import com.bookstore.dto.RoleDTO;
import com.bookstore.dto.UserDTO;
import com.bookstore.entity.Role;
import com.bookstore.entity.User;

public class DTOConverter {

	public static UserDTO convertUser(User user) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(user, UserDTO.class);
	}

	public static RoleDTO convertRole(Role role) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(role, RoleDTO.class);
	}

}
