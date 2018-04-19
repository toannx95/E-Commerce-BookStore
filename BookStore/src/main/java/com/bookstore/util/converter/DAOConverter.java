package com.bookstore.util.converter;

import com.bookstore.dto.RoleDTO;
import com.bookstore.dto.UserDTO;
import com.bookstore.entity.Role;
import com.bookstore.entity.User;
import com.bookstore.util.NumberUtils;

public class DAOConverter {

	public static User convertUser(UserDTO userDTO) {
		User user = new User();
		user.setId(NumberUtils.isEmpty(userDTO.getId()) ? null : userDTO.getId());
		user.setUserName(userDTO.getUserName());
		user.setPassword(userDTO.getPassword());
		user.setFirstName(userDTO.getFirstName());
		user.setLastName(userDTO.getLastName());
		user.setEmail(userDTO.getEmail());
		user.setPhone(userDTO.getPhone());
		user.setEnabled(userDTO.isEnabled());
		return user;
	}

	public static Role convertRole(RoleDTO roleDTO) {
		Role role = new Role();
		role.setId(NumberUtils.isEmpty(roleDTO.getId()) ? null : roleDTO.getId());
		role.setName(roleDTO.getName());
		return role;
	}

}
