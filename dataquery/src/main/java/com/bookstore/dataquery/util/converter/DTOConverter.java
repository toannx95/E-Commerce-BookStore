package com.bookstore.dataquery.util.converter;

import org.modelmapper.ModelMapper;

import com.bookstore.dataquery.dto.BillingAddressDTO;
import com.bookstore.dataquery.dto.BookDTO;
import com.bookstore.dataquery.dto.BookToCartItemDTO;
import com.bookstore.dataquery.dto.CartItemDTO;
import com.bookstore.dataquery.dto.OrderDTO;
import com.bookstore.dataquery.dto.PaymentDTO;
import com.bookstore.dataquery.dto.RoleDTO;
import com.bookstore.dataquery.dto.ShippingAddressDTO;
import com.bookstore.dataquery.dto.ShoppingCartDTO;
import com.bookstore.dataquery.dto.UserBillingDTO;
import com.bookstore.dataquery.dto.UserDTO;
import com.bookstore.dataquery.dto.UserPaymentDTO;
import com.bookstore.dataquery.dto.UserShippingDTO;
import com.bookstore.dataquery.entity.BillingAddress;
import com.bookstore.dataquery.entity.Book;
import com.bookstore.dataquery.entity.BookToCartItem;
import com.bookstore.dataquery.entity.CartItem;
import com.bookstore.dataquery.entity.Order;
import com.bookstore.dataquery.entity.Payment;
import com.bookstore.dataquery.entity.Role;
import com.bookstore.dataquery.entity.ShippingAddress;
import com.bookstore.dataquery.entity.ShoppingCart;
import com.bookstore.dataquery.entity.User;
import com.bookstore.dataquery.entity.UserBilling;
import com.bookstore.dataquery.entity.UserPayment;
import com.bookstore.dataquery.entity.UserShipping;

public class DTOConverter {

	public static BillingAddressDTO convertBillingAddress(BillingAddress billingAddress) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(billingAddress, BillingAddressDTO.class);
	}

	public static BookDTO convertBook(Book book) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(book, BookDTO.class);
	}

	public static BookToCartItemDTO convertBookToCartItem(BookToCartItem bookToCartItem) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(bookToCartItem, BookToCartItemDTO.class);
	}

	public static CartItemDTO convertCartItem(CartItem cartItem) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(cartItem, CartItemDTO.class);
	}

	public static OrderDTO convertOrder(Order order) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(order, OrderDTO.class);
	}

	public static PaymentDTO convertPayment(Payment payment) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(payment, PaymentDTO.class);
	}

	public static RoleDTO convertRole(Role role) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(role, RoleDTO.class);
	}

	public static ShippingAddressDTO convertShippingAddress(ShippingAddress shippingAddress) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(shippingAddress, ShippingAddressDTO.class);
	}

	public static ShoppingCartDTO convertShoppingCart(ShoppingCart shoppingCart) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(shoppingCart, ShoppingCartDTO.class);
	}

	public static UserDTO convertUser(User user) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(user, UserDTO.class);
	}

	public static UserBillingDTO convertUserBilling(UserBilling userBilling) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userBilling, UserBillingDTO.class);
	}

	public static UserPaymentDTO convertUserPayment(UserPayment userPayment) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userPayment, UserPaymentDTO.class);
	}

	public static UserShippingDTO convertUserShipping(UserShipping userShipping) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userShipping, UserShippingDTO.class);
	}

}
