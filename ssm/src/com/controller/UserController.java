package com.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.User;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Resource
	private UserService userService;

	@RequestMapping("/list")
	public String list(Model model) {
		List<User> users = userService.selList();
		model.addAttribute("users",users);
		return "/index.jsp";
	}
}
