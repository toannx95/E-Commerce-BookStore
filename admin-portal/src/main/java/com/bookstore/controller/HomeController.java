package com.bookstore.controller;

import java.security.Principal;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.dataquery.config.CustomizeUserDetailsService;
import com.bookstore.dataquery.dto.UserDTO;
import com.bookstore.dataquery.service.UserService;
import com.bookstore.dataquery.util.SecurityUtility;

@Controller
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private CustomizeUserDetailsService customizeUserDetailsService;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home() {
		return "home";
	}

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		return "login";
	}
	
	@RequestMapping(value = "403", method = RequestMethod.GET)
	public String error() {
		return "403";
	}
	
	@RequestMapping(value = "updateUserInfo", method = RequestMethod.GET)
	public ModelAndView updateUserInfo(Principal principal) {
		ModelAndView mav = new ModelAndView();
		UserDTO userDTO = userService.findByUserName(principal.getName());
		mav.addObject("user", userDTO);
		mav.setViewName("updateUserInfo");
		return mav;
	}

	@RequestMapping(value = "updateUserInfo", method = RequestMethod.POST)
	public ModelAndView updateUserInfo(@ModelAttribute("user") UserDTO userDTO,
			@ModelAttribute("newPassword") String newPassword) throws Exception {
		ModelAndView mav = new ModelAndView();

		UserDTO currentUser = userService.findOne(userDTO.getId());
		if (Objects.isNull(currentUser)) {
			throw new Exception("User not found!");
		}

		if (!Objects.isNull(userService.findByUserName(userDTO.getUserName()))) {
			if (userService.findByUserName(userDTO.getUserName()).getId() != currentUser.getId()) {
				mav.addObject("existsUserMsg", true);
				mav.setViewName("updateUserInfo");
				return mav;
			}
		}

		if (newPassword != null && !newPassword.isEmpty() && !newPassword.equals("")) {
			BCryptPasswordEncoder bCryptPasswordEncoder = SecurityUtility.passwordEncoder();
			String dbPassword = currentUser.getPassword();
			if (bCryptPasswordEncoder.matches(userDTO.getPassword(), dbPassword)) {
				currentUser.setPassword(bCryptPasswordEncoder.encode(newPassword));
			} else {
				mav.addObject("incorrectPasswordMsg", true);
				mav.setViewName("updateUserInfo");
				return mav;
			}
		}

		currentUser.setFirstName(userDTO.getFirstName());
		currentUser.setLastName(userDTO.getLastName());
		currentUser.setEmail(userDTO.getEmail());
		currentUser.setPhone(userDTO.getPhone());

		userService.save(currentUser);
		mav.addObject("successMsg", true);
		mav.addObject("user", currentUser);
		mav.setViewName("updateUserInfo");

		UserDetails userDetails = customizeUserDetailsService.loadUserByUsername(currentUser.getUserName());
		Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword(),
				userDetails.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(authentication);
		return mav;
	}

}
