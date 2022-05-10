package com.wipro.velocity.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/myHome", method = RequestMethod.GET)
	public String showHome(ModelMap model) {
		
		model.addAttribute("user", "Mike");
        model.addAttribute("d", new java.util.Date());
		
		return "home";  // returns View home.jsp with Model
	}

	@RequestMapping("/spring")
    public String showSecond()
    {
        return "second"; //returns view
    }
}
