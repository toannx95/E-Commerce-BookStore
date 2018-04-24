package com.bookstore.dataquery.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.dataquery.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	User findByUserNameAndEnabledTrue(String userName);

	User findByUserName(String userName);

}
