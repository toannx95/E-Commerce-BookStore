package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.dataquery.dto.BookDTO;
import com.bookstore.dataquery.service.BookService;

@Controller
public class BookShelfController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "bookShelf", method = RequestMethod.GET)
	public ModelAndView bookShelf() {
		ModelAndView mav = new ModelAndView();

		mav.addObject("bookList", bookService.findByActiveTrue());
		mav.addObject("activeAll", true);
		mav.setViewName("bookShelf");
		return mav;
	}

	@RequestMapping(value = "searchByCategory", method = RequestMethod.GET)
	public ModelAndView searchByCategory(@RequestParam("category") String category) {
		ModelAndView mav = new ModelAndView();

		String classActiveCategory = "active" + category;
		classActiveCategory.replaceAll("\\s+", "");
		classActiveCategory.replaceAll("&", "");
		mav.addObject(classActiveCategory, true);

		List<BookDTO> bookList = bookService.findByCategoryAndActiveTrue(category);
		if (bookList.isEmpty()) {
			mav.addObject("emptyList", true);
			mav.setViewName("bookShelf");
			return mav;
		}

		mav.addObject("bookList", bookList);
		mav.setViewName("bookShelf");
		return mav;
	}

}
