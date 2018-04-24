package com.bookstore.dataquery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.dataquery.entity.BillingAddress;

@Repository
public interface BillingAddressRepository extends CrudRepository<BillingAddress, Long> {

}
