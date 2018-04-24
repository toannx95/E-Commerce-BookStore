package com.bookstore.dataquery.dto;

public class PaymentDTO {

	private Long id;
	private String type;
	private String cardName;
	private String cardNumber;
	private int expiryMonth;
	private int expiryYear;
	private int cvc;
	private String holderName;
	private OrderDTO order;
	private UserBillingDTO userBilling;

	public PaymentDTO() {
		super();
	}

	public PaymentDTO(Long id, String type, String cardName, String cardNumber, int expiryMonth, int expiryYear,
			int cvc, String holderName, OrderDTO order, UserBillingDTO userBilling) {
		super();
		this.id = id;
		this.type = type;
		this.cardName = cardName;
		this.cardNumber = cardNumber;
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.cvc = cvc;
		this.holderName = holderName;
		this.order = order;
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

	public OrderDTO getOrder() {
		return order;
	}

	public void setOrder(OrderDTO order) {
		this.order = order;
	}

	public UserBillingDTO getUserBilling() {
		return userBilling;
	}

	public void setUserBilling(UserBillingDTO userBilling) {
		this.userBilling = userBilling;
	}

	@Override
	public String toString() {
		return "PaymentDTO [id=" + id + ", type=" + type + ", cardName=" + cardName + ", cardNumber=" + cardNumber
				+ ", expiryMonth=" + expiryMonth + ", expiryYear=" + expiryYear + ", cvc=" + cvc + ", holderName="
				+ holderName + ", order=" + order + ", userBilling=" + userBilling + "]";
	}

}
