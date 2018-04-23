package com.bookstore.dto;

import java.util.List;
import java.util.Set;

public class UserDTO {

	private Long id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private boolean enabled;
	private Set<RoleDTO> roles;
	private ShoppingCartDTO shoppingCart;
	private List<UserShippingDTO> userShippingList;
	private List<UserPaymentDTO> userPaymentList;
	private List<OrderDTO> orderList;

	public UserDTO() {
		super();
	}

	public UserDTO(Long id, String userName, String password, String firstName, String lastName, String email,
			String phone, boolean enabled, Set<RoleDTO> roles, ShoppingCartDTO shoppingCart,
			List<UserShippingDTO> userShippingList, List<UserPaymentDTO> userPaymentList, List<OrderDTO> orderList) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.enabled = enabled;
		this.roles = roles;
		this.shoppingCart = shoppingCart;
		this.userShippingList = userShippingList;
		this.userPaymentList = userPaymentList;
		this.orderList = orderList;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Set<RoleDTO> getRoles() {
		return roles;
	}

	public void setRoles(Set<RoleDTO> roles) {
		this.roles = roles;
	}

	public ShoppingCartDTO getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCartDTO shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public List<UserShippingDTO> getUserShippingList() {
		return userShippingList;
	}

	public void setUserShippingList(List<UserShippingDTO> userShippingList) {
		this.userShippingList = userShippingList;
	}

	public List<UserPaymentDTO> getUserPaymentList() {
		return userPaymentList;
	}

	public void setUserPaymentList(List<UserPaymentDTO> userPaymentList) {
		this.userPaymentList = userPaymentList;
	}

	public List<OrderDTO> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<OrderDTO> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", userName=" + userName + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", email=" + email + ", phone=" + phone + ", enabled=" + enabled
				+ ", roles=" + roles + ", shoppingCart=" + shoppingCart + ", userShippingList=" + userShippingList
				+ ", userPaymentList=" + userPaymentList + ", orderList=" + orderList + "]";
	}

}
