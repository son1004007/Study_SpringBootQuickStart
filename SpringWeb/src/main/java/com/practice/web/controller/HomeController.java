package com.practice.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	

	
	
	//	Controller는 URL을 매핑하는 역할
	@RequestMapping("/index")
	public String index() {
		return "home.index";
	}

	
	@RequestMapping("/help")
	public String aaa() {
		return "home.help";
	}
}
