package com.bookstore.dataquery.service;

import java.util.List;

import com.bookstore.dataquery.dto.BookDTO;

public interface BookService {

	List<BookDTO> findAll();

	BookDTO findOne(Long id);

	BookDTO create(BookDTO bookDTO);

	BookDTO update(BookDTO bookDTO);

	void delete(Long id);
}
