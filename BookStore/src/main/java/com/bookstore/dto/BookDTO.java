package com.bookstore.dto;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

public class BookDTO {

	private Long id;
	private String title;
	private String author;
	private String publisher;
	private String publicationDate;
	private String language;
	private String category;
	private int numberOfPages;
	private String format;
	private int isbn;
	private double shippingWeight;
	private double listPrice;
	private double ourPrice;
	private boolean active = true;
	private String description;
	private int inStockNumber;
	private MultipartFile bookImage;
	private List<BookToCartItemDTO> bookToCartItem;

	public BookDTO() {
		super();
	}

	public BookDTO(Long id, String title, String author, String publisher, String publicationDate, String language,
			String category, int numberOfPages, String format, int isbn, double shippingWeight, double listPrice,
			double ourPrice, boolean active, String description, int inStockNumber, MultipartFile bookImage,
			List<BookToCartItemDTO> bookToCartItem) {
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

	public List<BookToCartItemDTO> getBookToCartItem() {
		return bookToCartItem;
	}

	public void setBookToCartItem(List<BookToCartItemDTO> bookToCartItem) {
		this.bookToCartItem = bookToCartItem;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", title=" + title + ", author=" + author + ", publisher=" + publisher
				+ ", publicationDate=" + publicationDate + ", language=" + language + ", category=" + category
				+ ", numberOfPages=" + numberOfPages + ", format=" + format + ", isbn=" + isbn + ", shippingWeight="
				+ shippingWeight + ", listPrice=" + listPrice + ", ourPrice=" + ourPrice + ", active=" + active
				+ ", description=" + description + ", inStockNumber=" + inStockNumber + ", bookImage=" + bookImage
				+ ", bookToCartItem=" + bookToCartItem + "]";
	}

}
