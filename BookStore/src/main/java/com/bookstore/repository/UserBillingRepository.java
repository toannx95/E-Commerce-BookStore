package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.entity.UserBilling;

@Repository
public interface UserBillingRepository extends CrudRepository<UserBilling, Long> {

}
