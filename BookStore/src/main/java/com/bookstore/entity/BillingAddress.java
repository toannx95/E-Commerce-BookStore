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
@Table(name = "billing_address")
public class BillingAddress implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "billing_address_name")
	private String billingAddressName;

	@Column(name = "billing_address_street1")
	private String billingAddressStreet1;

	@Column(name = "billing_address_street2")
	private String billingAddressStreet2;

	@Column(name = "billing_address_city")
	private String billingAddressCity;

	@Column(name = "billing_address_state")
	private String billingAddressState;

	@Column(name = "billing_address_country")
	private String billingAddressCountry;

	@Column(name = "billing_address_zipcode")
	private String billingAddressZipcode;

	@OneToOne
	private Order order;

	public BillingAddress() {
		super();
	}

	public BillingAddress(Long id, String billingAddressName, String billingAddressStreet1,
			String billingAddressStreet2, String billingAddressCity, String billingAddressState,
			String billingAddressCountry, String billingAddressZipcode, Order order) {
		super();
		this.id = id;
		this.billingAddressName = billingAddressName;
		this.billingAddressStreet1 = billingAddressStreet1;
		this.billingAddressStreet2 = billingAddressStreet2;
		this.billingAddressCity = billingAddressCity;
		this.billingAddressState = billingAddressState;
		this.billingAddressCountry = billingAddressCountry;
		this.billingAddressZipcode = billingAddressZipcode;
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBillingAddressName() {
		return billingAddressName;
	}

	public void setBillingAddressName(String billingAddressName) {
		this.billingAddressName = billingAddressName;
	}

	public String getBillingAddressStreet1() {
		return billingAddressStreet1;
	}

	public void setBillingAddressStreet1(String billingAddressStreet1) {
		this.billingAddressStreet1 = billingAddressStreet1;
	}

	public String getBillingAddressStreet2() {
		return billingAddressStreet2;
	}

	public void setBillingAddressStreet2(String billingAddressStreet2) {
		this.billingAddressStreet2 = billingAddressStreet2;
	}

	public String getBillingAddressCity() {
		return billingAddressCity;
	}

	public void setBillingAddressCity(String billingAddressCity) {
		this.billingAddressCity = billingAddressCity;
	}

	public String getBillingAddressState() {
		return billingAddressState;
	}

	public void setBillingAddressState(String billingAddressState) {
		this.billingAddressState = billingAddressState;
	}

	public String getBillingAddressCountry() {
		return billingAddressCountry;
	}

	public void setBillingAddressCountry(String billingAddressCountry) {
		this.billingAddressCountry = billingAddressCountry;
	}

	public String getBillingAddressZipcode() {
		return billingAddressZipcode;
	}

	public void setBillingAddressZipcode(String billingAddressZipcode) {
		this.billingAddressZipcode = billingAddressZipcode;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
