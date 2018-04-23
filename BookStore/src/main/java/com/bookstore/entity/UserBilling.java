package com.bookstore.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_billing")
public class UserBilling implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "user_billing_name")
	private String userBillingName;

	@Column(name = "user_billing_street1")
	private String userBillingStreet1;

	@Column(name = "user_billing_street2")
	private String userBillingStreet2;

	@Column(name = "user_billing_city")
	private String userBillingCity;

	@Column(name = "user_billing_state")
	private String userBillingState;

	@Column(name = "user_billing_country")
	private String userBillingCountry;

	@Column(name = "user_billing_zipcode")
	private String userBillingZipcode;

	@OneToOne(cascade = CascadeType.ALL)
	private UserPayment userPayment;

	public UserBilling() {
		super();
	}

	public UserBilling(Long id, String userBillingName, String userBillingStreet1, String userBillingStreet2,
			String userBillingCity, String userBillingState, String userBillingCountry, String userBillingZipcode,
			UserPayment userPayment) {
		super();
		this.id = id;
		this.userBillingName = userBillingName;
		this.userBillingStreet1 = userBillingStreet1;
		this.userBillingStreet2 = userBillingStreet2;
		this.userBillingCity = userBillingCity;
		this.userBillingState = userBillingState;
		this.userBillingCountry = userBillingCountry;
		this.userBillingZipcode = userBillingZipcode;
		this.userPayment = userPayment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserBillingName() {
		return userBillingName;
	}

	public void setUserBillingName(String userBillingName) {
		this.userBillingName = userBillingName;
	}

	public String getUserBillingStreet1() {
		return userBillingStreet1;
	}

	public void setUserBillingStreet1(String userBillingStreet1) {
		this.userBillingStreet1 = userBillingStreet1;
	}

	public String getUserBillingStreet2() {
		return userBillingStreet2;
	}

	public void setUserBillingStreet2(String userBillingStreet2) {
		this.userBillingStreet2 = userBillingStreet2;
	}

	public String getUserBillingCity() {
		return userBillingCity;
	}

	public void setUserBillingCity(String userBillingCity) {
		this.userBillingCity = userBillingCity;
	}

	public String getUserBillingState() {
		return userBillingState;
	}

	public void setUserBillingState(String userBillingState) {
		this.userBillingState = userBillingState;
	}

	public String getUserBillingCountry() {
		return userBillingCountry;
	}

	public void setUserBillingCountry(String userBillingCountry) {
		this.userBillingCountry = userBillingCountry;
	}

	public String getUserBillingZipcode() {
		return userBillingZipcode;
	}

	public void setUserBillingZipcode(String userBillingZipcode) {
		this.userBillingZipcode = userBillingZipcode;
	}

	public UserPayment getUserPayment() {
		return userPayment;
	}

	public void setUserPayment(UserPayment userPayment) {
		this.userPayment = userPayment;
	}

}
