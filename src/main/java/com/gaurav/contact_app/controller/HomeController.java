package com.gaurav.contact_app.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {

    @RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("title","home-smart contact manager");
		return "home";
	}
	
	@RequestMapping("/about")
	public String about(Model model)
	{
		model.addAttribute("title","home-smart contacyt manager");
		return "about";
	}
    
}
