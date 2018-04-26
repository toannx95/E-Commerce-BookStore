package com.bookstore.dataquery.service.impl;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dataquery.dto.BookDTO;
import com.bookstore.dataquery.entity.Book;
import com.bookstore.dataquery.repository.BookRepository;
import com.bookstore.dataquery.service.BookService;
import com.bookstore.dataquery.util.converter.DAOConverter;
import com.bookstore.dataquery.util.converter.DTOConverter;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BookRepository bookRepository;

	@Override
	public BookDTO create(BookDTO bookDTO) {
		return DTOConverter.convertBook(bookRepository.save(DAOConverter.convertBook(bookDTO)));
	}

	@Override
	public List<BookDTO> findAll() {
		Iterable<Book> books = bookRepository.findAll();

		if (books == null) {
			return null;
		}

		Stream<Book> bookStream = StreamSupport.stream(books.spliterator(), false);
		return bookStream.map(DTOConverter::convertBook).collect(Collectors.toList());
	}

}
