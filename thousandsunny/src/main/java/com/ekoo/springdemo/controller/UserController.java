package com.ekoo.springdemo.controller;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ekoo.springdemo.bean.User;
import com.ekoo.springdemo.exception.MyException;
import com.ekoo.springdemo.service.UserService;

/**
 * Handles requests for the application home page.
 */
@RequestMapping("user")
@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/addUser")
	public String addUser(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);

		boolean b;
		try {
			b = userService.addUser(new User(0, "LiuZhebin", 28));
			System.out.println(b);
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("first");
		return "index";
	}
}
