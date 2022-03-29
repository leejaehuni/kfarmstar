package com.kfarmstar.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/noticeboard")
public class NoticeBoardController {

	@GetMapping("/getNoticeList")
	public String getNoticeList(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 공지게시판 조회");
		model.addAttribute("titleName", "공지게시판 조회");
		
		return "noticeboard/getNoticeList";
	}
	
	@GetMapping("/addNotice")
	public String addNotice(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 공지게시판 입력");
		model.addAttribute("titleName", "공지게시판 입력");
		
		return "noticeboard/addNotice";
	}
	@GetMapping("/modifyNotice")
	public String modifyNotice(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 공지게시판 수정");
		model.addAttribute("titleName", "공지게시판 수정");
		
		return "noticeboard/modifyNotice";
	}
	
	@GetMapping("/removeNotice")
	public String removeNotice(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 공지게시판 삭제");
		model.addAttribute("titleName", "공지게시판 삭제");
		
		return "noticeboard/removeNotice";
	}
	
	
}