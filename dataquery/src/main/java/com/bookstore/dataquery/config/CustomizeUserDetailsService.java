package com.bookstore.dataquery.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bookstore.dataquery.entity.Role;
import com.bookstore.dataquery.entity.User;
import com.bookstore.dataquery.repository.UserRepository;

@Service
public class CustomizeUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		User activeUser = userRepository.findByUserNameAndEnabledTrue(userName);
		if (activeUser == null) {
			throw new UsernameNotFoundException("User not found!");
		}

		Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
		Set<Role> roles = activeUser.getRoles();
		for (Role role : roles) {
			grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
		}

		return new org.springframework.security.core.userdetails.User(activeUser.getUserName(),
				activeUser.getPassword(), grantedAuthorities);
	}
}
