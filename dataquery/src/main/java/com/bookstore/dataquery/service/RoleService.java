package com.bookstore.dataquery.service;

import com.bookstore.dataquery.dto.RoleDTO;

public interface RoleService {

	RoleDTO create(RoleDTO roleDTO);

	RoleDTO findByName(String name);

}