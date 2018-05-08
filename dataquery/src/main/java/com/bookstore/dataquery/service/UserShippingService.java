package com.bookstore.dataquery.service;

import java.util.List;

import com.bookstore.dataquery.dto.UserDTO;
import com.bookstore.dataquery.dto.UserShippingDTO;

public interface UserShippingService {

	List<UserShippingDTO> findAll();

	UserShippingDTO findById(Long id);

	void updateUserShipping(UserShippingDTO userShippingDTO, UserDTO userDTO);

	void setUserDefaultShipping(Long defaultShippingId);
	
	void removeUserShipping(Long id);

}
