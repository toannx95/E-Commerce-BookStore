package com.bookstore.dataquery.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "cart_item")
public class CartItem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "qty")
	private int qty;

	@Column(name = "sub_total")
	private BigDecimal subtotal;

	@OneToOne
	private Book book;

	@OneToMany(mappedBy = "cartItem")
	@JsonIgnore
	private List<BookToCartItem> bookToCartItem;

	@ManyToOne
	@JoinColumn(name = "shopping_cart_id")
	private ShoppingCart shoppingCart;

	@ManyToOne
	@JoinColumn(name = "order_id")
	private Order order;

	public CartItem() {
		super();
	}

	public CartItem(Long id, int qty, BigDecimal subtotal, Book book, List<BookToCartItem> bookToCartItem,
			ShoppingCart shoppingCart, Order order) {
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

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public List<BookToCartItem> getBookToCartItem() {
		return bookToCartItem;
	}

	public void setBookToCartItem(List<BookToCartItem> bookToCartItem) {
		this.bookToCartItem = bookToCartItem;
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
