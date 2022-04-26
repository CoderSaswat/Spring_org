package com.saswat.spring.springmvcorm.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.saswat.spring.springmvcorm.user.entity.User;
import com.saswat.spring.springmvcorm.user.services.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService service;

	@RequestMapping("showRegistration")
	public String showRegistrationPage() {
		return "userReg";
	}

	@RequestMapping(value = "showRegistered", method = RequestMethod.POST)
	public String showRegistered(@ModelAttribute("user") User user, ModelMap modelMap) {
		int result = service.save(user);
		modelMap.addAttribute("result", "user created with id : " + result);
		return "userReg";
	}

	@RequestMapping("displayUsres")
	public String displayUsers(ModelMap model) {
		List<User> users = service.getUsers();
		model.addAttribute("users", users);
		return "displayUsers";
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

}
