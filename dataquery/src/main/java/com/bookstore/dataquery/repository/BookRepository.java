package com.bookstore.dataquery.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.dataquery.entity.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	
	List<Book> findByActiveTrue();

	List<Book> findByCategoryAndActiveTrue(String category);

}
