package com.bookstore.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.dataquery.dto.BookDTO;
import com.bookstore.dataquery.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookSerice;

	@RequestMapping(value = "/addBook", method = RequestMethod.GET)
	public ModelAndView addBook() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("book", new BookDTO());
		mav.setViewName("addBook");
		return mav;
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public ModelAndView addBook(@ModelAttribute("book") BookDTO bookDTO) {
		ModelAndView mav = new ModelAndView();
		bookDTO = bookSerice.create(bookDTO);

		MultipartFile bookImage = bookDTO.getBookImage();
		try {
			byte[] bytes = bookImage.getBytes();
			String name = bookDTO.getId() + ".png";
			BufferedOutputStream stream = new BufferedOutputStream(
					new FileOutputStream(new File("src/main/resources/static/images/book/" + name)));
			stream.write(bytes);
			stream.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		mav.setViewName("redirect:bookList");
		return mav;
	}

	@RequestMapping(value = "/bookList", method = RequestMethod.GET)
	public ModelAndView bookList() {
		ModelAndView mav = new ModelAndView();
		List<BookDTO> books = bookSerice.findAll();
		mav.addObject("bookList", books);
		mav.setViewName("bookList");
		return mav;
	}
}
