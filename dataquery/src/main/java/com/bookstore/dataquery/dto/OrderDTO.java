package com.bookstore.dataquery.dto;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class OrderDTO {

	private Long id;
	private Date orderDate;
	private Date shippingDate;
	private String shippingMethod;
	private String orderStatus;
	private BigDecimal orderTotal;
	private List<CartItemDTO> cartItemList;
	private ShippingAddressDTO shippingAddress;
	private BillingAddressDTO billingAddress;
	private PaymentDTO payment;
	private UserDTO user;

	public OrderDTO() {
		super();
	}

	public OrderDTO(Long id, Date orderDate, Date shippingDate, String shippingMethod, String orderStatus,
			BigDecimal orderTotal, List<CartItemDTO> cartItemList, ShippingAddressDTO shippingAddress,
			BillingAddressDTO billingAddress, PaymentDTO payment, UserDTO user) {
		super();
		this.id = id;
		this.orderDate = orderDate;
		this.shippingDate = shippingDate;
		this.shippingMethod = shippingMethod;
		this.orderStatus = orderStatus;
		this.orderTotal = orderTotal;
		this.cartItemList = cartItemList;
		this.shippingAddress = shippingAddress;
		this.billingAddress = billingAddress;
		this.payment = payment;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Date getShippingDate() {
		return shippingDate;
	}

	public void setShippingDate(Date shippingDate) {
		this.shippingDate = shippingDate;
	}

	public String getShippingMethod() {
		return shippingMethod;
	}

	public void setShippingMethod(String shippingMethod) {
		this.shippingMethod = shippingMethod;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public BigDecimal getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(BigDecimal orderTotal) {
		this.orderTotal = orderTotal;
	}

	public List<CartItemDTO> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<CartItemDTO> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public ShippingAddressDTO getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddressDTO shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public BillingAddressDTO getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddressDTO billingAddress) {
		this.billingAddress = billingAddress;
	}

	public PaymentDTO getPayment() {
		return payment;
	}

	public void setPayment(PaymentDTO payment) {
		this.payment = payment;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "OrderDTO [id=" + id + ", orderDate=" + orderDate + ", shippingDate=" + shippingDate
				+ ", shippingMethod=" + shippingMethod + ", orderStatus=" + orderStatus + ", orderTotal=" + orderTotal
				+ ", cartItemList=" + cartItemList + ", shippingAddress=" + shippingAddress + ", billingAddress="
				+ billingAddress + ", payment=" + payment + ", user=" + user + "]";
	}

}
