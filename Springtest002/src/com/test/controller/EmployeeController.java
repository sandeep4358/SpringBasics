package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.service.Employee;

@Controller
public class EmployeeController {

	@RequestMapping(method = RequestMethod.GET, value = "/newEmployee")
	public ModelAndView newEmployeeForm() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("");
		Employee emp = new Employee(0000, "", "", "", "");
		mav.setViewName("employeeForm");
		mav.addObject("employeeMA", emp);
		return mav;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/submitEmployee")
	public String saveNewEmployee(@ModelAttribute("employeeMA") Employee emp, BindingResult result) {

		boolean error = false;
		System.out.println(emp);

		if (emp.getFirstName().isEmpty()) {
			result.rejectValue("firstName", "error.firstName");
			error = true;
		}

		if (emp.getFirstName().isEmpty()) {
			result.rejectValue("lastName", "error.lastName");
			error = true;
		}

		if (emp.getFirstName().isEmpty()) {
			result.rejectValue("emailId", "error.emailId");
			error = true;
		}
		
		if(error) {
			return "newEmployee";
		}

		return "redirect:/success";
	}

	@RequestMapping(value = "/success", method = RequestMethod.GET)
	public String success(Model model) {
		return "addSuccess";
	}
}
