package com.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bookstore.dataquery.service.BookService;

@RestController
public class DeleteListController {

	@Autowired
	private BookService bookService;

	@RequestMapping(value = "/book/deleteList", method = RequestMethod.POST)
	public String deleteList(@RequestBody List<String> bookIdList) {
		for (String id : bookIdList) {
			bookService.delete(Long.parseLong(id.substring(8)));
		}
		return "success";
	}

}
