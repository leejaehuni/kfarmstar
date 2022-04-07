package com.kfarmstar.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kfarmstar.dto.AfterPayment;
import com.kfarmstar.dto.GoodsExchange;
import com.kfarmstar.dto.GoodsRefund;
import com.kfarmstar.dto.OrderCancel;

@Mapper
public interface PaymentMapper {
	
	//환불코드별 상품 환불 상세 정보 내역
	public GoodsRefund goodsRefundInfoByCode(String refundCode);
	
	//구매자 결제 환불 내역 조회
	public List<GoodsRefund> goodsRefundInfo(String searchKey, String searchValue);
	
	//상품교환코드별 상품 교환 상세 정보 내역
	public GoodsExchange goodsExchangeInfoByCode(String goodsExchangeCode);
	
	//조건별 결제 내역 조회
	public List<AfterPayment> conditionAfterPaymentList(String searchKey, String searchValue);
	
	//구매자 주문 취소 정보 내역
	public List<GoodsExchange> goodsExchangeInfo(String searchKey, String searchValue);
	
	//주문취소코드별 주문 취소 상세 정보 내역
	public OrderCancel orderCancelInfoByCode(String orderCancelCode);
	
	//구매자 구매 정보 내역
	public List<AfterPayment> afterPaymentInfo(String searchKey, String searchValue);
	
	//결제완료코드별 구매 상세 정보 내역
	public AfterPayment afterPaymentInfoByCode(String paymentCompleteCode);
	
	//구매자 주문 취소 내역
	public List<OrderCancel> orderCancelInfo(String searchKey, String searchValue);
}
