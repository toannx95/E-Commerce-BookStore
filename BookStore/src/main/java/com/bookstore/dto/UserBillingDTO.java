package com.bookstore.dto;

public class UserBillingDTO {

	private Long id;
	private String userBillingName;
	private String userBillingStreet1;
	private String userBillingStreet2;
	private String userBillingCity;
	private String userBillingState;
	private String userBillingCountry;
	private String userBillingZipcode;
	private UserPaymentDTO userPayment;

	public UserBillingDTO() {
		super();
	}

	public UserBillingDTO(Long id, String userBillingName, String userBillingStreet1, String userBillingStreet2,
			String userBillingCity, String userBillingState, String userBillingCountry, String userBillingZipcode,
			UserPaymentDTO userPayment) {
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

	public UserPaymentDTO getUserPayment() {
		return userPayment;
	}

	public void setUserPayment(UserPaymentDTO userPayment) {
		this.userPayment = userPayment;
	}

	@Override
	public String toString() {
		return "UserBillingDTO [id=" + id + ", userBillingName=" + userBillingName + ", userBillingStreet1="
				+ userBillingStreet1 + ", userBillingStreet2=" + userBillingStreet2 + ", userBillingCity="
				+ userBillingCity + ", userBillingState=" + userBillingState + ", userBillingCountry="
				+ userBillingCountry + ", userBillingZipcode=" + userBillingZipcode + ", userPayment=" + userPayment
				+ "]";
	}

}
