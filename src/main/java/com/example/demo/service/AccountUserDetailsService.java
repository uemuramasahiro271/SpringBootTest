package com.example.demo.service;

import org.springframework.security.core.userdetails.UserDetails;

public interface AccountUserDetailsService {

	UserDetails loadUserByUsername(String username);
}
