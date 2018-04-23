package com.bookstore.dto;

import java.math.BigDecimal;
import java.util.List;

public class ShoppingCartDTO {

	private Long id;
	private BigDecimal grandTotal;
	private List<CartItemDTO> cartItemList;
	private UserDTO user;

	public ShoppingCartDTO() {
		super();
	}

	public ShoppingCartDTO(Long id, BigDecimal grandTotal, List<CartItemDTO> cartItemList, UserDTO user) {
		super();
		this.id = id;
		this.grandTotal = grandTotal;
		this.cartItemList = cartItemList;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(BigDecimal grandTotal) {
		this.grandTotal = grandTotal;
	}

	public List<CartItemDTO> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<CartItemDTO> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ShoppingCartDTO [id=" + id + ", grandTotal=" + grandTotal + ", cartItemList=" + cartItemList + ", user="
				+ user + "]";
	}

}
