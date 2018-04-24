package com.bookstore.dataquery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.dataquery.entity.Payment;

@Repository
public interface PaymentRepository extends CrudRepository<Payment, Long> {

}
