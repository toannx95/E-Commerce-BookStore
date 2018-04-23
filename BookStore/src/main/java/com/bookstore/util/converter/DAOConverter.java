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

public class DAOConverter {

	public static BillingAddress convertBillingAddress(BillingAddressDTO billingAddressDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(billingAddressDTO, BillingAddress.class);
	}

	public static Book convertBook(BookDTO bookDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(bookDTO, Book.class);
	}

	public static BookToCartItem convertBookToCartItem(BookToCartItemDTO bookToCartItemDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(bookToCartItemDTO, BookToCartItem.class);
	}

	public static CartItem convertCartItem(CartItemDTO cartItemDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(cartItemDTO, CartItem.class);
	}

	public static Order convertOrder(OrderDTO orderDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(orderDTO, Order.class);
	}

	public static Payment convertPayment(PaymentDTO paymentDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(paymentDTO, Payment.class);
	}

	public static Role convertRole(RoleDTO roleDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(roleDTO, Role.class);
	}

	public static ShippingAddress convertShippingAddress(ShippingAddressDTO shippingAddressDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(shippingAddressDTO, ShippingAddress.class);
	}

	public static ShoppingCart convertShoppingCart(ShoppingCartDTO shoppingCartDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(shoppingCartDTO, ShoppingCart.class);
	}

	public static User convertUser(UserDTO userDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userDTO, User.class);
	}

	public static UserBilling convertUserBilling(UserBillingDTO userBillingDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userBillingDTO, UserBilling.class);
	}

	public static UserPayment convertUserBilling(UserPaymentDTO userPaymentDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userPaymentDTO, UserPayment.class);
	}

	public static UserShipping convertUserBilling(UserShippingDTO userShippingDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userShippingDTO, UserShipping.class);
	}

}
