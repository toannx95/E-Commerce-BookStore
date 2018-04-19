package com.bookstore.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dto.RoleDTO;
import com.bookstore.entity.Role;
import com.bookstore.repository.RoleRepository;
import com.bookstore.service.RoleService;
import com.bookstore.util.converter.DAOConverter;
import com.bookstore.util.converter.DTOConverter;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public RoleDTO create(RoleDTO roleDTO) {
		return DTOConverter.convertRole(roleRepository.save(DAOConverter.convertRole(roleDTO)));
	}

	@Override
	public RoleDTO findByName(String name) {
		Role role = roleRepository.findByName(name);
		if (Objects.isNull(role)) {
			return null;
		}
		return DTOConverter.convertRole(role);
	}

}
