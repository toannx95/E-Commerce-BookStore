package com.bookstore.dto;

import java.util.Set;

public class RoleDTO {

	private Integer id;
	private String name;
	private Set<UserDTO> users;

	public RoleDTO() {
		super();
	}

	public RoleDTO(Integer id, String name, Set<UserDTO> users) {
		super();
		this.id = id;
		this.name = name;
		this.users = users;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<UserDTO> getUsers() {
		return users;
	}

	public void setUsers(Set<UserDTO> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "RoleDTO [id=" + id + ", name=" + name + ", users=" + users + "]";
	}

}
