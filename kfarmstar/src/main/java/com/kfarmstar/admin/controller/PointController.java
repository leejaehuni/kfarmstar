package com.kfarmstar.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/point")
public class PointController {

	@GetMapping("/pointUseSave")
	public String pointUseSave(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 포인트관리");
		model.addAttribute("titleName", "포인트 관리");
		
		return "point/pointUseSave";
	}
	
	@GetMapping("/pointUseSaveRemove")
	public String pointUseSaveRemove(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 포인트 내역 삭제");
		model.addAttribute("titleName", "포인트 내역 삭제");
		
		return "point/pointUseSaveRemove";
	}
	
	@GetMapping("/pointGiveStandard")
	public String pointGiveStandard(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 포인트 기준");
		model.addAttribute("titleName", "포인트 기준");
		
		return "point/pointGiveStandard";
	}
	
	@GetMapping("/pointGiveStandardModify")
	public String pointGiveStandardModify(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 지급 기준 수정");
		model.addAttribute("titleName", "포인트 지급 기준 수정");
		
		return "point/pointGiveStandardModify";
	}
	
	@GetMapping("/pointGiveStandardRemove")
	public String pointGiveStandardRemove(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 지급 기준 삭제");
		model.addAttribute("titleName", "포인트 지급 기준 삭제");
		
		return "point/pointGiveStandardRemove";
	}
}
