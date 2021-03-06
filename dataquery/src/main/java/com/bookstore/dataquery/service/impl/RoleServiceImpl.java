package com.bookstore.dataquery.service.impl;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dataquery.dto.RoleDTO;
import com.bookstore.dataquery.entity.Role;
import com.bookstore.dataquery.repository.RoleRepository;
import com.bookstore.dataquery.service.RoleService;
import com.bookstore.dataquery.util.converter.DAOConverter;
import com.bookstore.dataquery.util.converter.DTOConverter;

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
