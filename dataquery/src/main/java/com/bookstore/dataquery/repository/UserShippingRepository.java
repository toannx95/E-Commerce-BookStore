package com.bookstore.dataquery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.dataquery.entity.UserShipping;

@Repository
public interface UserShippingRepository extends CrudRepository<UserShipping, Long> {

}
