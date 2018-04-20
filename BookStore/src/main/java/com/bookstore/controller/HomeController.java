package com.bookstore.controller;

import java.util.Objects;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.dto.UserDTO;
import com.bookstore.repository.UserRepository;
import com.bookstore.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = { "login" }, method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

	@RequestMapping(value = "403", method = RequestMethod.GET)
	public String error() {
		return "403";
	}

	@RequestMapping(value = "register", method = RequestMethod.GET)
	public ModelAndView register() {
		ModelAndView mav = new ModelAndView();
		UserDTO userDTO = new UserDTO();

		mav.addObject("user", userDTO);
		mav.setViewName("register");
		return mav;
	}

	@RequestMapping(value = "register", method = RequestMethod.POST)
	public ModelAndView register(@ModelAttribute("user") @Valid UserDTO userDTO, BindingResult bindingResult) {
		ModelAndView mav = new ModelAndView();

		UserDTO userExists = userService.findByUserName(userDTO.getUserName());
		if (!Objects.isNull(userExists)) {
			mav.addObject("existsUserMsg", true);
			mav.setViewName("register");
			bindingResult.reject("userName");
		}

		if (bindingResult.hasErrors()) {
			mav.setViewName("register");
		} else {
			userService.create(userDTO);
			mav.addObject("successMsg", true);
			mav.addObject("user", new UserDTO());
			mav.setViewName("register");
		}
		return mav;
	}

	@RequestMapping(value = "updateUserInfo", method = RequestMethod.POST)
	public ModelAndView updateUserInfo(@ModelAttribute("user") @Valid UserDTO userDTO, @ModelAttribute("newPassword") String newPassword, BindingResult bindingResult) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		UserDTO currentUser = userService.findOne(userDTO.getId());
		if(Objects.isNull(currentUser)) {
			throw new Exception("User not found!");
		}
		
		if (!Objects.isNull(userService.findByUserName(userDTO.getUserName()))) {
			mav.addObject("existsUserMsg", true);
			mav.setViewName("updateUserInfo");
			bindingResult.reject("userName");
		}

		if (bindingResult.hasErrors()) {
			mav.setViewName("register");
		} else {
			userService.create(userDTO);
			mav.addObject("successMsg", true);
			mav.addObject("user", new UserDTO());
			mav.setViewName("updateUserInfo");
		}
		
		return mav;
	}
}
