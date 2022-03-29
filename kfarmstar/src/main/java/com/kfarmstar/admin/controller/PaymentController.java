package com.kfarmstar.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/payment")
public class PaymentController {
	
	@GetMapping("/basketPurchaseList")
	public String basketPurchaseList(Model model) {
		return "payment/basketPurchaseList";
	}
	
	@GetMapping("/beforePurchaserInfo")
	public String beforePurchaserInfo(Model model) {
		return "payment/beforePurchaserInfo";
	}
	
	@GetMapping("/afterPaymentInfo")
	public String afterPaymentInfo(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 결제관리");
		model.addAttribute("titleName", "결제 내역 관리");
		
		return "payment/afterPaymentInfo";
	}
	
	@GetMapping("/afterPaymentDetail")
	public String afterPaymentDetail(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 결제 정보");
		model.addAttribute("titleName", "결제 상세 정보");
		
		return "payment/afterPaymentDetail";
	}
	
	@GetMapping("/afterPaymentModify")
	public String afterPaymentModify(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 결제수정");
		model.addAttribute("titleName", "결제 내역 수정");
		
		return "payment/afterPaymentModify";
	}
	
	@GetMapping("/afterPaymentRemove")
	public String afterPaymentRemove(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 결제삭제");
		model.addAttribute("titleName", "결제 내역 삭제");
		
		return "payment/afterPaymentRemove";
	}
	
	@GetMapping("/afterPaymentStatistics")
	public String afterPaymentStatistics(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 결제통계");
		model.addAttribute("titleName", "결제 내역 통계");
		
		return "payment/afterPaymentStatistics";
	}
	
	@GetMapping("/goodsOrderCancel")
	public String goodsOrderCancel(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 주문취소관리");
		model.addAttribute("titleName", "주문 취소 내역 관리");
		
		return "payment/goodsOrderCancel";
	}
	
	@GetMapping("/goodsOrderCancelDetail")
	public String goodsOrderCancelDetail(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 주문 취소 정보");
		model.addAttribute("titleName", "주문 취소 정보");
		
		return "payment/goodsOrderCancelDetail";
	}
	
	@GetMapping("/goodsOrderCancelModify")
	public String goodsOrderCancelModify(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 주문취소수정");
		model.addAttribute("titleName", "주문 취소 내역 수정");
		
		return "payment/goodsOrderCancelModify";
	}
	
	@GetMapping("/goodsOrderCancelRemove")
	public String goodsOrderCancelRemove(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 주문취소삭제");
		model.addAttribute("titleName", "주문 취소 내역 삭제");
		
		return "payment/goodsOrderCancelRemove";
	}
	
	@GetMapping("/goodsOrderStatistics")
	public String goodsOrderStatistics(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 주문취소통계");
		model.addAttribute("titleName", "주문 취소 내역 통계");
		
		return "payment/goodsOrderStatistics";
	}
	
	@GetMapping("/goodsExchange")
	public String goodsExchange(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 상품교환관리");
		model.addAttribute("titleName", "상품 교환 내역 관리");
		
		return "payment/goodsExchange";
	}
	
	@GetMapping("/goodsExchangeModify")
	public String goodsExchangeModify(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 상품교환수정");
		model.addAttribute("titleName", "상품 교환 내역 수정");
		
		return "payment/goodsExchangeModify";
	}
	
	@GetMapping("/goodsExchangeRemove")
	public String goodsExchangeRemove(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 상품교환삭제");
		model.addAttribute("titleName", "상품 교환 내역 삭제");
		
		return "payment/goodsExchangeRemove";
	}
	
	@GetMapping("/goodsExchangeDetail")
	public String goodsExchangeDetail(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 상품 교환 정보");
		model.addAttribute("titleName", "상품 교환 정보");
		
		return "payment/goodsExchangeDetail";
	}
	
	@GetMapping("/goodsRefund")
	public String goodsRefund(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 환불관리");
		model.addAttribute("titleName", "상품 환불 내역 관리");
		
		return "payment/goodsRefund";
	}
	
	@GetMapping("/goodsRefundModify")
	public String goodsRefundModify(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 환불수정");
		model.addAttribute("titleName", "환불 내역 수정");
		
		return "payment/goodsRefundModify";
	}
	
	@GetMapping("/goodsRefundRemove")
	public String goodsRefundRemove(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 환불삭제");
		model.addAttribute("titleName", "환불 내역 삭제");
		
		return "payment/goodsRefundRemove";
	}
	
	@GetMapping("/goodsRefundDetail")
	public String goodsRefundDetail(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 상품 환불 정보");
		model.addAttribute("titleName", "상품 환불 정보");
		
		return "payment/goodsRefundDetail";
	}
	
	@GetMapping("/goodsRefundStatistics")
	public String goodsRefundStatistics(Model model) {
		
		model.addAttribute("title", "FoodRefurb : 환불통계");
		model.addAttribute("titleName", "상품 환불 내역 통계");
		
		return "payment/goodsRefundStatistics";
	}
}
