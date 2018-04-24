package com.bookstore.dataquery.dto;

public class BillingAddressDTO {

	private Long id;
	private String billingAddressName;
	private String billingAddressStreet1;
	private String billingAddressStreet2;
	private String billingAddressCity;
	private String billingAddressState;
	private String billingAddressCountry;
	private String billingAddressZipcode;
	private OrderDTO order;

	public BillingAddressDTO() {
		super();
	}

	public BillingAddressDTO(Long id, String billingAddressName, String billingAddressStreet1,
			String billingAddressStreet2, String billingAddressCity, String billingAddressState,
			String billingAddressCountry, String billingAddressZipcode, OrderDTO order) {
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

	public OrderDTO getOrder() {
		return order;
	}

	public void setOrder(OrderDTO order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "BillingAddressDTO [id=" + id + ", billingAddressName=" + billingAddressName + ", billingAddressStreet1="
				+ billingAddressStreet1 + ", billingAddressStreet2=" + billingAddressStreet2 + ", billingAddressCity="
				+ billingAddressCity + ", billingAddressState=" + billingAddressState + ", billingAddressCountry="
				+ billingAddressCountry + ", billingAddressZipcode=" + billingAddressZipcode + ", order=" + order + "]";
	}

}
