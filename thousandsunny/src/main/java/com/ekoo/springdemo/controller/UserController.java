package com.ekoo.springdemo.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ekoo.springdemo.bean.User;
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

	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		return "login";
	}
	@RequestMapping("/login_validate")
	public String loginValidate(HttpServletRequest request) {
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		if (name==null||password==null) {
			return  "redirect:login";
		}
		User user=userService.findByName(name);
		if (user!=null&&user.getPassword().equals(password)) {
			request.getSession().setAttribute("logined", true);
			request.getSession().setAttribute("user", user);
			logger.info("User:"+user.getName()+" is login successful!" );
			return "redirect:/index";
		} else {
			return  "redirect:login";
		}
	}
	@RequestMapping("/addUser")
	public String addUser(Locale locale, Model model) {

		boolean b;
		try {
			b = userService.addUser(new User(0, "LiuZhebin", 28));
			System.out.println(b);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return "index";
	}
	
}
