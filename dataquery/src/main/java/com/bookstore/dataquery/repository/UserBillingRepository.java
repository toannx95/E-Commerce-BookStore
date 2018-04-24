package com.bookstore.dataquery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.dataquery.entity.UserBilling;

@Repository
public interface UserBillingRepository extends CrudRepository<UserBilling, Long> {

}
