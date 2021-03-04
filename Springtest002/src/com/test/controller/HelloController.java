package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.service.AlienService;

@Controller
public class HelloController {

	@Autowired
	AlienService service;
	
	@RequestMapping("/")
	public String add() {
		System.out.println("login successfully.");
		return "index";
	}

	@RequestMapping("/login")
	public ModelAndView doLogin(@RequestParam("txt_username") String userName ,@RequestParam("txt_password") String password) {
		//String userName = request.getParameter("txt_username");
		//String password = request.getParameter("txt_password");		
		ModelAndView modelView = new ModelAndView();
		if (userName.equals("admin") && password.equals("admin@123")) {
			modelView.setViewName("successful");
		} else {
			modelView.setViewName("error");
		}
		modelView.addObject("loginName", userName);
		
		return modelView;
	}
}
