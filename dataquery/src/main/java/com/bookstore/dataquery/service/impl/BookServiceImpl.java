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
	public List<BookDTO> findByActiveTrue() {
		Iterable<Book> books = bookRepository.findByActiveTrue();

		if (books == null) {
			return null;
		}

		Stream<Book> bookStream = StreamSupport.stream(books.spliterator(), false);
		return bookStream.map(DTOConverter::convertBook).collect(Collectors.toList());
	}

	@Override
	public BookDTO findOne(Long id) {
		return DTOConverter.convertBook(bookRepository.findOne(id));
	}

	@Override
	public BookDTO create(BookDTO bookDTO) {
		return DTOConverter.convertBook(bookRepository.save(DAOConverter.convertBook(bookDTO)));
	}

	@Override
	public BookDTO update(BookDTO bookDTO) {
		return DTOConverter.convertBook(bookRepository.save(DAOConverter.convertBook(bookDTO)));
	}

	@Override
	public void delete(Long id) {
		bookRepository.delete(id);
	}

	@Override
	public List<BookDTO> findByCategoryAndActiveTrue(String category) {
		Iterable<Book> books = bookRepository.findByCategoryAndActiveTrue(category);
		if (books == null) {
			return null;
		}

		Stream<Book> bookStream = StreamSupport.stream(books.spliterator(), false);
		return bookStream.map(DTOConverter::convertBook).collect(Collectors.toList());
	}

}
