package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.constant.RoleConstant;
import com.example.demo.form.AccountRegistrationForm;
import com.example.demo.service.AccountService;

@Controller
public class AccountRegistrationController {

	@Autowired
	private AccountService accountService;

	@GetMapping("accountRegister")
	public String initView(Model model) {

		model.addAttribute("accountRegistrationForm", new AccountRegistrationForm());

		return "auth/accountRegistrationForm";
	}

	@PostMapping("/register")
	public String register(@ModelAttribute AccountRegistrationForm form, Model model) {

		var account = accountService.getAccount(form.getUserName());
		if(account != null) {
			var errorForm = new AccountRegistrationForm();
			errorForm.setError(true);
			errorForm.setErrorMsg("IDは既に登録されています。");
			model.addAttribute("accountRegistrationForm", errorForm);

			return "auth/accountRegistrationForm";
		}

		accountService.createAccount(form.getUserName(), form.getPassword(), RoleConstant.ROLE_USER);

		return "auth/accountRegistrationCompleteForm";
	}
}
