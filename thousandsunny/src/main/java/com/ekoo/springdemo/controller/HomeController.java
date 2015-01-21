package com.ekoo.springdemo.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ekoo.springdemo.bean.User;
import com.ekoo.springdemo.service.UserService;

/**
 * Handles requests for the application home page.
 */
@RequestMapping("home")
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	@Autowired
	private UserService userService;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("/first")
	public String first(Locale locale, Model model) {
		/*logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		User user= userService.findById(2);
		System.out.println(user.getName())*/;
		
		System.out.println("first");
		return "index";
	}
	
	@RequestMapping("/second")
	public String second() {
		System.out.println("second");
		return "index";
	}
	
	@RequestMapping("/third")
	public String third() {
		System.out.println("third");
		return "index";
	}
	
	@RequestMapping("/error")
	public String error() {
		return "index";
	}
}
