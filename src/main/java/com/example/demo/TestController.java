package com.example.demo;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@Autowired
	HttpSession session;

	@GetMapping("/test")
	public ModelAndView test(ModelAndView mv) {
		mv.setViewName("test");

		var sessionForm = session.getAttribute("sessionTest");

		return mv;
	}

}
