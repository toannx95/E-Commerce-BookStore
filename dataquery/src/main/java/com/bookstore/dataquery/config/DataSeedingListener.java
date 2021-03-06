package com.bookstore.dataquery.config;

import java.util.HashSet;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import com.bookstore.dataquery.entity.Role;
import com.bookstore.dataquery.entity.User;
import com.bookstore.dataquery.enumeration.RoleEnum;
import com.bookstore.dataquery.repository.RoleRepository;
import com.bookstore.dataquery.repository.UserRepository;
import com.bookstore.dataquery.util.SecurityUtility;

@Component
public class DataSeedingListener implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RoleRepository roleRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// init ROLE_ADMIN and ROLE_MEMBER into DB
		if (Objects.isNull(roleRepository.findByName(RoleEnum.ADMIN.getRole()))) {
			roleRepository.save(new Role(RoleEnum.ADMIN.getRole()));
		}

		if (Objects.isNull(roleRepository.findByName(RoleEnum.MEMBER.getRole()))) {
			roleRepository.save(new Role(RoleEnum.MEMBER.getRole()));
		}

		// init two user: admin and member into DB
		if (Objects.isNull(userRepository.findByUserName("admin"))) {
			User user = new User();
			user.setUserName("admin");
			user.setPassword(SecurityUtility.passwordEncoder().encode("admin"));
			user.setFirstName("Toan");
			user.setLastName("Nguyen");
			user.setEmail("toannx@gmail.com");
			user.setPhone("");
			user.setEnabled(true);

			HashSet<Role> roles = new HashSet<>();
			roles.add(roleRepository.findByName(RoleEnum.ADMIN.getRole()));
			roles.add(roleRepository.findByName(RoleEnum.MEMBER.getRole()));
			user.setRoles(roles);

			userRepository.save(user);
		}

		if (Objects.isNull(userRepository.findByUserName("member"))) {
			User user = new User();
			user.setUserName("member");
			user.setPassword(SecurityUtility.passwordEncoder().encode("member"));
			user.setFirstName("Tony");
			user.setLastName("Nguyen");
			user.setEmail("tony@gmail.com");
			user.setPhone("");
			user.setEnabled(true);

			HashSet<Role> roles = new HashSet<>();
			roles.add(roleRepository.findByName(RoleEnum.MEMBER.getRole()));
			user.setRoles(roles);

			userRepository.save(user);
		}
	}

}
