package com.moga.app_security.security;

import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.moga.app_security.repositories.CustomerRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;


@Service
@Transactional
@AllArgsConstructor
public class CustomerUserDetail implements UserDetailsService{

	private final CustomerRepository customerRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return this.customerRepository.findByEmail(username)
				.map(customer->{
					var authorities=List.of(new SimpleGrantedAuthority(customer.getRole()));
					return new User(customer.getEmail(), customer.getPassword(), authorities);
		})
		.orElseThrow(()->new UsernameNotFoundException("User not found"));
	
	}
	
}
