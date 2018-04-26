package com.bookstore.dataquery.service;

import java.util.List;

import com.bookstore.dataquery.dto.BookDTO;

public interface BookService {

	BookDTO create(BookDTO bookDTO);

	List<BookDTO> findAll();

}
