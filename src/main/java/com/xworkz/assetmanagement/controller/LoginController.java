package com.xworkz.assetmanagement.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@Autowired
	private static final Logger logger = Logger.getLogger(LoginController.class);

	@PostMapping("/login")
	public ModelAndView validateUser(@RequestParam String emailId) {
		logger.info("inside  validate user() of controller");

		ModelAndView modelAndView = new ModelAndView("user");
		modelAndView.addObject("userEmailId", emailId);

		return modelAndView;

	}
}
