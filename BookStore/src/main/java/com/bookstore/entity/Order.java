package com.bookstore.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "order")
public class Order implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "order_date")
	private Date orderDate;

	@Column(name = "shipping_date")
	private Date shippingDate;

	@Column(name = "shipping_method")
	private String shippingMethod;

	@Column(name = "order_status")
	private String orderStatus;

	@Column(name = "order_total")
	private BigDecimal orderTotal;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private List<CartItem> cartItemList;

	@OneToOne(cascade = CascadeType.ALL)
	private ShippingAddress shippingAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private BillingAddress billingAddress;

	@OneToOne(cascade = CascadeType.ALL)
	private Payment payment;

	@ManyToOne
	private User user;

	public Order() {
		super();
	}

	public Order(Long id, Date orderDate, Date shippingDate, String shippingMethod, String orderStatus,
			BigDecimal orderTotal, List<CartItem> cartItemList, ShippingAddress shippingAddress,
			BillingAddress billingAddress, Payment payment, User user) {
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

	public List<CartItem> getCartItemList() {
		return cartItemList;
	}

	public void setCartItemList(List<CartItem> cartItemList) {
		this.cartItemList = cartItemList;
	}

	public ShippingAddress getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(ShippingAddress shippingAddress) {
		this.shippingAddress = shippingAddress;
	}

	public BillingAddress getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(BillingAddress billingAddress) {
		this.billingAddress = billingAddress;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
