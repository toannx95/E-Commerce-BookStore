package com.bookstore.dataquery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.dataquery.entity.ShippingAddress;

@Repository
public interface ShippingAddressRepository extends CrudRepository<ShippingAddress, Long> {

}
