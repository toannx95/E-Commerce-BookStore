package com.bookstore.dto;

import java.math.BigDecimal;
import java.util.List;

public class CartItemDTO {

	private Long id;
	private int qty;
	private BigDecimal subtotal;
	private BookDTO book;
	private List<BookToCartItemDTO> bookToCartItem;
	private ShoppingCartDTO shoppingCart;
	private OrderDTO order;

	public CartItemDTO() {
		super();
	}

	public CartItemDTO(Long id, int qty, BigDecimal subtotal, BookDTO book, List<BookToCartItemDTO> bookToCartItem,
			ShoppingCartDTO shoppingCart, OrderDTO order) {
		super();
		this.id = id;
		this.qty = qty;
		this.subtotal = subtotal;
		this.book = book;
		this.bookToCartItem = bookToCartItem;
		this.shoppingCart = shoppingCart;
		this.order = order;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public BigDecimal getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(BigDecimal subtotal) {
		this.subtotal = subtotal;
	}

	public BookDTO getBook() {
		return book;
	}

	public void setBook(BookDTO book) {
		this.book = book;
	}

	public List<BookToCartItemDTO> getBookToCartItem() {
		return bookToCartItem;
	}

	public void setBookToCartItem(List<BookToCartItemDTO> bookToCartItem) {
		this.bookToCartItem = bookToCartItem;
	}

	public ShoppingCartDTO getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCartDTO shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public OrderDTO getOrder() {
		return order;
	}

	public void setOrder(OrderDTO order) {
		this.order = order;
	}

	@Override
	public String toString() {
		return "CartItemDTO [id=" + id + ", qty=" + qty + ", subtotal=" + subtotal + ", book=" + book
				+ ", bookToCartItem=" + bookToCartItem + ", shoppingCart=" + shoppingCart + ", order=" + order + "]";
	}

}
