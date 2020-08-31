package com.example.demo.form;

import lombok.Data;

@Data
public class AccountRegistrationForm {
	private String userName;
	private String password;

	private boolean isError;
	private String errorMsg;
}
