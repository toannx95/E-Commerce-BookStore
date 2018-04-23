package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.UserPayment;

@Repository
public interface UserPaymentRepository extends CrudRepository<UserPayment, Long> {

}
