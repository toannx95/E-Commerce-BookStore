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

	public static UserPayment convertUserPayment(UserPaymentDTO userPaymentDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userPaymentDTO, UserPayment.class);
	}

	public static UserShipping convertUserShipping(UserShippingDTO userShippingDTO) {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper.map(userShippingDTO, UserShipping.class);
	}

}
