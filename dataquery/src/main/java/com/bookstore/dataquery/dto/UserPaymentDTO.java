package com.bookstore.dataquery.dto;

public class UserPaymentDTO {

	private Long id;
	private String type;
	private String cardName;
	private String cardNumber;
	private int expiryMonth;
	private int expiryYear;
	private int cvc;
	private String holderName;
	private boolean defaultPayment;
	private UserDTO user;
	private UserBillingDTO userBilling;

	public UserPaymentDTO() {
		super();
	}

	public UserPaymentDTO(Long id, String type, String cardName, String cardNumber, int expiryMonth, int expiryYear,
			int cvc, String holderName, boolean defaultPayment, UserDTO user, UserBillingDTO userBilling) {
		super();
		this.id = id;
		this.type = type;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cvc = cvc;
		this.holderName = holderName;
		this.defaultPayment = defaultPayment;
		this.user = user;
		this.userBilling = userBilling;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public int getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(int expiryMonth) {
		this.expiryMonth = expiryMonth;
	}

	public int getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(int expiryYear) {
		this.expiryYear = expiryYear;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public String getHolderName() {
		return holderName;
	}

	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}

	public boolean isDefaultPayment() {
		return defaultPayment;
	}

	public void setDefaultPayment(boolean defaultPayment) {
		this.defaultPayment = defaultPayment;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public UserBillingDTO getUserBilling() {
		return userBilling;
	}

	public void setUserBilling(UserBillingDTO userBilling) {
		this.userBilling = userBilling;
	}

	@Override
	public String toString() {
		return "UserPaymentDTO [id=" + id + ", type=" + type + ", cardName=" + cardName + ", cardNumber=" + cardNumber
				+ ", expiryMonth=" + expiryMonth + ", expiryYear=" + expiryYear + ", cvc=" + cvc + ", holderName="
				+ holderName + ", defaultPayment=" + defaultPayment + ", user=" + user + ", userBilling=" + userBilling
				+ "]";
	}

}
