package com.bookstore.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private CustomizeUserDetailsService customizeUserDetailsService;

	private static final String[] PUBLIC_MATCHERS = {
		"/css/**",
		"/fonts/**",
		"/images/**",
		"/js/**",
		"/",
		"/register",
		"/forgotPassword",
		"/login",
	};
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.authorizeRequests()
			.antMatchers(PUBLIC_MATCHERS).permitAll()
			.antMatchers("/admin/**").hasRole("ADMIN")
			.anyRequest().authenticated()
	
		//login configuration
		.and().formLogin()
			.loginPage("/login")
			.defaultSuccessUrl("/")
			.failureUrl("/login?error")
			.usernameParameter("username")
			.passwordParameter("password")
			
	
		//logout configuration
		.and().logout()
			.logoutUrl("/logout")
			.logoutSuccessUrl("/login")
		
		//exception handling configuration
		.and().exceptionHandling()
			.accessDeniedPage("/403");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
		auth.userDetailsService(customizeUserDetailsService).passwordEncoder(passwordEncoder);
	}
	
}
