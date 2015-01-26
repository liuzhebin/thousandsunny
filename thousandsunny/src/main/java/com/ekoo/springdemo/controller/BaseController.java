package com.ekoo.springdemo.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class BaseController {
	

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping("index")
	public String first(Locale locale, Model model) {
		return "index";
	}
	@RequestMapping("error")
	public String error(Locale locale, Model model) {
		return "index";
	}
}
