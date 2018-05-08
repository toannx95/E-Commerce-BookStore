package com.bookstore.controller;

import java.security.Principal;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.dataquery.dto.UserDTO;
import com.bookstore.dataquery.dto.UserShippingDTO;
import com.bookstore.dataquery.service.UserService;
import com.bookstore.dataquery.service.UserShippingService;
import com.bookstore.utility.ProvinceConstant;

@Controller
public class UserShippingController {

	@Autowired
	private UserService userService;

	@Autowired
	private UserShippingService userShippingService;

	@RequestMapping(value = "listShippingAddress")
	public ModelAndView listShippingAddress(Principal principal) {
		ModelAndView mav = new ModelAndView();
		UserDTO user = userService.findByUserName(principal.getName());

		mav.addObject("userShippingList", user.getUserShippingList());
		mav.addObject("listShippingAddress", true);
		mav.setViewName("shippingAddress");
		return mav;
	}

	@RequestMapping(value = "addShippingAddress")
	public ModelAndView addShippingAddress(Principal principal) {
		ModelAndView mav = new ModelAndView();
		UserShippingDTO userShippingDTO = new UserShippingDTO();
		mav.addObject("userShipping", userShippingDTO);

		List<String> provinceList = ProvinceConstant.listOfCanadaProvinceCodes;
		Collections.sort(provinceList);
		mav.addObject("provinceList", provinceList);

		mav.addObject("addShippingAddress", true);
		mav.setViewName("shippingAddress");
		return mav;
	}

	@RequestMapping(value = "addShippingAddress", method = RequestMethod.POST)
	public String addShippingAddress(@ModelAttribute("userShipping") UserShippingDTO userShippingDTO,
			Principal principal) {
		UserDTO user = userService.findByUserName(principal.getName());
		userShippingService.updateUserShipping(userShippingDTO, user);
		return "redirect:/listShippingAddress";
	}

	@RequestMapping(value = "setDefaultShippingAddress", method = RequestMethod.POST)
	public String setDefaultShippingAddress(@ModelAttribute("defaultShippingAddressId") Long defaultShippingId) {
		userShippingService.setUserDefaultShipping(defaultShippingId);
		return "redirect:/listShippingAddress";
	}

	@RequestMapping(value = "updateShippingAddress")
	public ModelAndView updateShippingAddress(@ModelAttribute("id") Long shippingAddressId) {
		ModelAndView mav = new ModelAndView();
		UserShippingDTO userShippingDTO = userShippingService.findById(shippingAddressId);
		mav.addObject("userShipping", userShippingDTO);

		List<String> provinceList = ProvinceConstant.listOfCanadaProvinceCodes;
		Collections.sort(provinceList);
		mav.addObject("provinceList", provinceList);

		mav.addObject("addShippingAddress", true);
		mav.setViewName("shippingAddress");
		return mav;
	}

	@RequestMapping(value = "removeUserShipping")
	public String removeUserShipping(@ModelAttribute("id") Long shippingAddressId) {
		userShippingService.removeUserShipping(shippingAddressId);
		return "redirect:/listShippingAddress";
	}

}
