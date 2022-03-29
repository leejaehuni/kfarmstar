package com.kfarmstar.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ReviewController {
	
	@GetMapping("/starRatingReview")
	public String starRatingReview(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 별점 등록");
		model.addAttribute("titleName", "별점 등록");
		
		return "donations/starRatingReview";
	}
	
	@GetMapping("/removeReview")
	public String removeReview(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 상품평 삭제");
		model.addAttribute("titleName", "상품평 삭제");
		
		return "donations/removeReview";
	}
	
	@GetMapping("/modifyReview")
	public String modifyReview(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 상품평 수정");
		model.addAttribute("titleName", "상품평 수정");
		
		return "donations/modifyReview";
	}
	
	@GetMapping("/addReview")
	public String addReview(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 상품평 등록");
		model.addAttribute("titleName", "상품평 등록");
		
		return "donations/addReview";
	}
	
	
	@GetMapping("/reviewList")
	public String getreviewList(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 상품평 목록");
		model.addAttribute("titleName", "상품평 목록");
		
		return "donations/reviewList";
	}
}
