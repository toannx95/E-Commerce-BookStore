package com.bookstore.dataquery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.dataquery.entity.CartItem;

@Repository
public interface CartItemRepository extends CrudRepository<CartItem, Long> {

}
