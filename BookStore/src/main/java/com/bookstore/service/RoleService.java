package com.bookstore.service;

import com.bookstore.dto.RoleDTO;

public interface RoleService {

	RoleDTO create(RoleDTO roleDTO);

	RoleDTO findByName(String name);

}