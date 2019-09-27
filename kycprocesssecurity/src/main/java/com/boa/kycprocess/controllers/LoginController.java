package com.boa.kycprocess.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/error")
	public String error(Model model) {
		model.addAttribute("loginError", true);
		return "error";
	}

}
