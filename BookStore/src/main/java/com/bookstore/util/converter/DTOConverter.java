package com.bookstore.util.converter;

import org.modelmapper.ModelMapper;

import com.bookstore.dto.BillingAddressDTO;
import com.bookstore.dto.BookDTO;
import com.bookstore.dto.BookToCartItemDTO;
import com.bookstore.dto.CartItemDTO;
import com.bookstore.dto.OrderDTO;
import com.bookstore.dto.PaymentDTO;
import com.bookstore.dto.RoleDTO;
import com.bookstore.dto.ShippingAddressDTO;
import com.bookstore.dto.ShoppingCartDTO;
import com.bookstore.dto.UserBillingDTO;
import com.bookstore.dto.UserDTO;
import com.bookstore.dto.UserPaymentDTO;
import com.bookstore.dto.UserShippingDTO;
import com.bookstore.entity.BillingAddress;
import com.bookstore.entity.Book;
import com.bookstore.entity.BookToCartItem;
import com.bookstore.entity.CartItem;
import com.bookstore.entity.Order;
import com.bookstore.entity.Payment;
import com.bookstore.entity.Role;
import com.bookstore.entity.ShippingAddress;
import com.bookstore.entity.ShoppingCart;
import com.bookstore.entity.User;
import com.bookstore.entity.UserBilling;
import com.bookstore.entity.UserPayment;
import com.bookstore.entity.UserShipping;

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

	public static UserPaymentDTO convertUserBilling(UserPayment userPayment) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userPayment, UserPaymentDTO.class);
	}

	public static UserShippingDTO convertUserBilling(UserShipping userShipping) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userShipping, UserShippingDTO.class);
	}

}
