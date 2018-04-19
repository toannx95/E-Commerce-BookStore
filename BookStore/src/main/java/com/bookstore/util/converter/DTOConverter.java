package com.bookstore.util.converter;

import com.bookstore.dto.RoleDTO;
import com.bookstore.dto.UserDTO;
import com.bookstore.entity.Role;
import com.bookstore.entity.User;

public class DTOConverter {

	public static UserDTO convertUser(User user) {
		return new UserDTO(user.getId(), user.getUserName(), user.getPassword(), user.getFirstName(),
				user.getLastName(), user.getEmail(), user.getPhone(), user.isEnabled());
	}

	public static RoleDTO convertRole(Role role) {
		return new RoleDTO(role.getId(), role.getName());
	}

}
