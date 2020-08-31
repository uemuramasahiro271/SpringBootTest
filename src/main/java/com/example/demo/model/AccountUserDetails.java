package com.example.demo.model;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import com.example.demo.entity.UserAccount;

public class AccountUserDetails extends User {

	private final UserAccount account;

	public AccountUserDetails(UserAccount account, Collection<GrantedAuthority> authorities) {
		super(account.getName(), account.getPassword(),
			   true, true, true, true, authorities);

		this.account = account;
	}

	public UserAccount getAccount() {
		return account;
	}
}
