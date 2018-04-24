package com.bookstore.dataquery.service.impl;

import java.util.HashSet;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dataquery.dto.RoleDTO;
import com.bookstore.dataquery.dto.UserDTO;
import com.bookstore.dataquery.entity.User;
import com.bookstore.dataquery.enumeration.RoleEnum;
import com.bookstore.dataquery.repository.UserRepository;
import com.bookstore.dataquery.service.RoleService;
import com.bookstore.dataquery.service.UserService;
import com.bookstore.dataquery.util.SecurityUtility;
import com.bookstore.dataquery.util.converter.DAOConverter;
import com.bookstore.dataquery.util.converter.DTOConverter;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleService roleService;

	@Override
	public UserDTO findOne(Long id) {
		return DTOConverter.convertUser(userRepository.findOne(id));
	}

	@Override
	public UserDTO save(UserDTO userDTO) {
		return DTOConverter.convertUser(userRepository.save(DAOConverter.convertUser(userDTO)));
	}

	@Override
	public UserDTO create(UserDTO userDTO) {
		User user = new User();
		user.setUserName(userDTO.getUserName());
		user.setPassword(SecurityUtility.passwordEncoder().encode(userDTO.getPassword()));
		user.setFirstName(userDTO.getFirstName());
		user.setLastName(userDTO.getLastName());
		user.setEmail(userDTO.getEmail());
		user.setPhone(userDTO.getPhone());
		user.setEnabled(true);

		HashSet<RoleDTO> roles = new HashSet<>();
		roles.add(roleService.findByName(RoleEnum.MEMBER.getRole()));
		user.setRoles(roles.stream().map(DAOConverter::convertRole).collect(Collectors.toSet()));

		return DTOConverter.convertUser(userRepository.save(user));
	}

	@Override
	public UserDTO findByUserNameAndEnabledTrue(String userName) {
		return DTOConverter.convertUser(userRepository.findByUserNameAndEnabledTrue(userName));
	}

	@Override
	public UserDTO findByUserName(String userName) {
		User user = userRepository.findByUserName(userName);
		if (Objects.isNull(user)) {
			return null;
		}
		return DTOConverter.convertUser(user);
	}

}
