package com.bookstore.dataquery.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dataquery.dto.UserDTO;
import com.bookstore.dataquery.dto.UserShippingDTO;
import com.bookstore.dataquery.entity.UserShipping;
import com.bookstore.dataquery.repository.UserShippingRepository;
import com.bookstore.dataquery.service.UserService;
import com.bookstore.dataquery.service.UserShippingService;
import com.bookstore.dataquery.util.converter.DAOConverter;
import com.bookstore.dataquery.util.converter.DTOConverter;

@Service
public class UserShippingServiceImpl implements UserShippingService {

	@Autowired
	private UserService userService;

	@Autowired
	private UserShippingRepository userShippingRepository;

	@Override
	public List<UserShippingDTO> findAll() {
		Iterable<UserShipping> userShippings = userShippingRepository.findAll();
		Stream<UserShipping> userShippingStream = StreamSupport.stream(userShippings.spliterator(), false);
		return userShippingStream.map(DTOConverter::convertUserShipping).collect(Collectors.toList());

	}

	@Override
	public UserShippingDTO findById(Long id) {
		return DTOConverter.convertUserShipping(userShippingRepository.findOne(id));
	}

	@Override
	public void updateUserShipping(UserShippingDTO userShippingDTO, UserDTO userDTO) {
		userShippingDTO.setUser(userDTO);

		if (userShippingDTO.getId() == null) {
			userDTO.getUserShippingList().add(userShippingDTO);
			userService.save(userDTO);
		} else {
			if (userShippingDTO.isUserShippingDefault()) {
				userShippingDTO.setUserShippingDefault(true);
			} else {
				userShippingDTO.setUserShippingDefault(false);
			}
			userShippingRepository.save(DAOConverter.convertUserShipping(userShippingDTO));
		}
	}

	@Override
	public void setUserDefaultShipping(Long userShippingId) {
		List<UserShippingDTO> userShippingList = findAll();
		for (UserShippingDTO userShipping : userShippingList) {
			if (userShipping.getId() == userShippingId) {
				userShipping.setUserShippingDefault(true);
				userShippingRepository.save(DAOConverter.convertUserShipping(userShipping));
			} else {
				userShipping.setUserShippingDefault(false);
				userShippingRepository.save(DAOConverter.convertUserShipping(userShipping));
			}
		}
	}

	@Override
	public void removeUserShipping(Long id) {
		userShippingRepository.delete(id);
	}

}
