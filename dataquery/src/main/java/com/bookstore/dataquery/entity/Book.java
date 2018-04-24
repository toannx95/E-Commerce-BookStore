package com.bookstore.dataquery.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "book")
public class Book implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "title")
	private String title;

	@Column(name = "author")
	private String author;

	@Column(name = "publisher")
	private String publisher;

	@Column(name = "publication_date")
	private String publicationDate;

	@Column(name = "language")
	private String language;

	@Column(name = "category")
	private String category;

	@Column(name = "number_of_pages")
	private int numberOfPages;

	@Column(name = "format")
	private String format;

	@Column(name = "isbn")
	private int isbn;

	@Column(name = "shipping_weight")
	private double shippingWeight;

	@Column(name = "list_price")
	private double listPrice;

	@Column(name = "our_price")
	private double ourPrice;

	@Column(name = "active")
	private boolean active = true;

	@Column(name = "description", columnDefinition = "text")
	private String description;

	@Column(name = "in_stock_number")
	private int inStockNumber;

	@Transient
	private MultipartFile bookImage;

	@OneToMany(mappedBy = "book")
	@JsonIgnore
	private List<BookToCartItem> bookToCartItem;

	public Book() {
		super();
	}

	public Book(Long id, String title, String author, String publisher, String publicationDate, String language,
			String category, int numberOfPages, String format, int isbn, double shippingWeight, double listPrice,
			double ourPrice, boolean active, String description, int inStockNumber, MultipartFile bookImage,
			List<BookToCartItem> bookToCartItem) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.publicationDate = publicationDate;
		this.language = language;
		this.category = category;
		this.numberOfPages = numberOfPages;
		this.format = format;
		this.isbn = isbn;
		this.shippingWeight = shippingWeight;
		this.listPrice = listPrice;
		this.ourPrice = ourPrice;
		this.active = active;
		this.description = description;
		this.inStockNumber = inStockNumber;
		this.bookImage = bookImage;
		this.bookToCartItem = bookToCartItem;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public double getShippingWeight() {
		return shippingWeight;
	}

	public void setShippingWeight(double shippingWeight) {
		this.shippingWeight = shippingWeight;
	}

	public double getListPrice() {
		return listPrice;
	}

	public void setListPrice(double listPrice) {
		this.listPrice = listPrice;
	}

	public double getOurPrice() {
		return ourPrice;
	}

	public void setOurPrice(double ourPrice) {
		this.ourPrice = ourPrice;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getInStockNumber() {
		return inStockNumber;
	}

	public void setInStockNumber(int inStockNumber) {
		this.inStockNumber = inStockNumber;
	}

	public MultipartFile getBookImage() {
		return bookImage;
	}

	public void setBookImage(MultipartFile bookImage) {
		this.bookImage = bookImage;
	}

	public List<BookToCartItem> getBookToCartItem() {
		return bookToCartItem;
	}

	public void setBookToCartItem(List<BookToCartItem> bookToCartItem) {
		this.bookToCartItem = bookToCartItem;
	}

}
