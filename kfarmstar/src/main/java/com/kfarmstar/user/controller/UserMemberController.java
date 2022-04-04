package com.kfarmstar.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/userMember")
public class UserMemberController {
	
	@GetMapping("/addMember")
	public String addMember(Model model) {
		
		model.addAttribute("title", "Food Refurb : 회원가입");
		
		return "userMember/addMember";
	}
	
}
