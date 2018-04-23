package com.bookstore.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shipping_address")
public class ShippingAddress implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "shipping_address_name")
	private String shippingAddressName;

	@Column(name = "shipping_address_street1")
	private String shippingAddressStreet1;

	@Column(name = "shipping_address_street2")
	private String shippingAddressStreet2;

	@Column(name = "shipping_address_city")
	private String shippingAddressCity;

	@Column(name = "shipping_address_state")
	private String shippingAddressState;

	@Column(name = "shipping_address_country")
	private String shippingAddressCountry;

	@Column(name = "shipping_address_zipcode")
	private String shippingAddressZipcode;

	@OneToOne
	private Order order;

	public ShippingAddress() {
		super();
	}

	public ShippingAddress(Long id, String shippingAddressName, String shippingAddressStreet1,
			String shippingAddressStreet2, String shippingAddressCity, String shippingAddressState,
			String shippingAddressCountry, String shippingAddressZipcode, Order order) {
		super();
		this.id = id;
		this.shippingAddressName = shippingAddressName;
		this.shippingAddressStreet1 = shippingAddressStreet1;
		this.shippingAddressStreet2 = shippingAddressStreet2;
		this.shippingAddressCity = shippingAddressCity;
		this.shippingAddressState = shippingAddressState;
		this.shippingAddressCountry = shippingAddressCountry;
		this.shippingAddressZipcode = shippingAddressZipcode;
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getShippingAddressName() {
		return shippingAddressName;
	}

	public void setShippingAddressName(String shippingAddressName) {
		this.shippingAddressName = shippingAddressName;
	}

	public String getShippingAddressStreet1() {
		return shippingAddressStreet1;
	}

	public void setShippingAddressStreet1(String shippingAddressStreet1) {
		this.shippingAddressStreet1 = shippingAddressStreet1;
	}

	public String getShippingAddressStreet2() {
		return shippingAddressStreet2;
	}

	public void setShippingAddressStreet2(String shippingAddressStreet2) {
		this.shippingAddressStreet2 = shippingAddressStreet2;
	}

	public String getShippingAddressCity() {
		return shippingAddressCity;
	}

	public void setShippingAddressCity(String shippingAddressCity) {
		this.shippingAddressCity = shippingAddressCity;
	}

	public String getShippingAddressState() {
		return shippingAddressState;
	}

	public void setShippingAddressState(String shippingAddressState) {
		this.shippingAddressState = shippingAddressState;
	}

	public String getShippingAddressCountry() {
		return shippingAddressCountry;
	}

	public void setShippingAddressCountry(String shippingAddressCountry) {
		this.shippingAddressCountry = shippingAddressCountry;
	}

	public String getShippingAddressZipcode() {
		return shippingAddressZipcode;
	}

	public void setShippingAddressZipcode(String shippingAddressZipcode) {
		this.shippingAddressZipcode = shippingAddressZipcode;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
