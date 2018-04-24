package com.bookstore.dataquery.dto;

public class BookToCartItemDTO {

	private Long id;
	private BookDTO book;
	private CartItemDTO cartItem;

	public BookToCartItemDTO() {
		super();
	}

	public BookToCartItemDTO(Long id, BookDTO book, CartItemDTO cartItem) {
		super();
		this.id = id;
		this.book = book;
		this.cartItem = cartItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BookDTO getBook() {
		return book;
	}

	public void setBook(BookDTO book) {
		this.book = book;
	}

	public CartItemDTO getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItemDTO cartItem) {
		this.cartItem = cartItem;
	}

	@Override
	public String toString() {
		return "BookToCartItemDTO [id=" + id + ", book=" + book + ", cartItem=" + cartItem + "]";
	}

}
