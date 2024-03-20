package com.cbc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception {
		http.authorizeHttpRequests(
				(req)->req
						.requestMatchers("/").permitAll()
						.requestMatchers("/index").authenticated()
						.anyRequest().authenticated()				
				).formLogin()
        .defaultSuccessUrl("/index") // Redirect to index page after successful login
        .permitAll();
		http.logout().logoutSuccessUrl("/");
			
		return http.build();
	}
	
	
	@Bean
	public InMemoryUserDetailsManager userDetailsManager() {
		
		User.UserBuilder users=User.withDefaultPasswordEncoder();
		
		UserDetails userOne=users
				.username("admin")
				.password("admin123")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(userOne);
	}
	
	

}
