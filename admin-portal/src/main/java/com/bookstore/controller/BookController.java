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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.bookstore.dataquery.dto.BookDTO;
import com.bookstore.dataquery.service.BookService;

@Controller
@RequestMapping("/book")
public class BookController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/addBook")
	public ModelAndView addBook() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("book", new BookDTO());
		mav.setViewName("addBook");
		return mav;
	}

	@RequestMapping(value = "/addBook", method = RequestMethod.POST)
	public String addBook(@ModelAttribute("book") BookDTO bookDTO) {
		bookDTO = bookService.create(bookDTO);

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
		return "redirect:/book/bookList";
	}

	@RequestMapping(value = "/bookList")
	public ModelAndView bookList() {
		ModelAndView mav = new ModelAndView();
		List<BookDTO> books = bookService.findByActiveTrue();
		mav.addObject("bookList", books);
		mav.setViewName("bookList");
		return mav;
	}

	@RequestMapping(value = "/bookInfo")
	public ModelAndView bookInfo(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("book", bookService.findOne(id));
		mav.setViewName("bookInfo");
		return mav;
	}

	@RequestMapping(value = "/deleteBook", method = RequestMethod.POST)
	public String deleteBook(@ModelAttribute("id") String id) {
		// ModelAndView mav = new ModelAndView();
		bookService.delete(Long.parseLong(id.substring(8)));
		// mav.addObject("bookList", bookService.findByActiveTrue());
		// mav.setViewName("redirect:/book/bookList");
		return "redirect:/book/bookList";
	}

	@RequestMapping(value = "/updateBook")
	public ModelAndView updateBook(@RequestParam("id") Long id) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("book", bookService.findOne(id));
		mav.setViewName("updateBook");
		return mav;
	}

	@RequestMapping(value = "/updateBook", method = RequestMethod.POST)
	public String updateBook(@ModelAttribute("book") BookDTO bookDTO) throws Exception {
		bookService.create(bookDTO);
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
		return "redirect:/book/bookInfo?id=" + bookDTO.getId();
	}

}
