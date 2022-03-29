package com.kfarmstar.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/salespoststatistics")
public class SalesPostController {

	@GetMapping("/getSalesPost")
	public String getSalesPost(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 판매게시글 통계 조회");
		model.addAttribute("titleName", "판매게시글 통계 조회");
		
		return "salespoststatistics/getSalesPost";
	}
	
	@GetMapping("/addSalesPost")
	public String addSalesPost(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 판매게시글 통계 입력");
		model.addAttribute("titleName", "판매게시글 통계 입력");
		
		return "salespoststatistics/addSalesPost";
	}
	@GetMapping("/modifySalesPost")
	public String modifySalesPost(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 판매게시글 통계 수정");
		model.addAttribute("titleName", "판매게시글 통계 수정");
		
		return "salespoststatistics/modifySalesPost";
	}
	
	@GetMapping("/removeSalesPost")
	public String removeSalesPost(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 판매게시글 통계 삭제");
		model.addAttribute("titleName", "판매게시글 통계 삭제");
		
		return "salespoststatistics/removeSalesPost";
	}
	
	
}
