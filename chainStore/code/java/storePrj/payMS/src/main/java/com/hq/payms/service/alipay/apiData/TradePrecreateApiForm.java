package com.hq.payms.service.alipay.apiData;

import com.hq.payms.service.alipay.data.TradePrecreateReq;
import com.hq.payms.service.common.BaseApiForm;
import com.zenmind.common.beanCopy.FastBeanCopyer;

public class TradePrecreateApiForm extends BaseApiForm implements IntfAlipayApiForm {
	
	//订单号
	private long orderId;
	
	//订单号来源类型，用来区分如何回调；OrderOriginTypeEnum
	private int orderOriginType;

	//商户交易号，64个字符以内，只能包含字母、数字、下划线，需保证商户系统端不能重复，建议通过数据库sequence生成，
	private String outTradeNo;

	//订单总金额，单位为元，不能超过1亿元；如果同时传入了【打折金额】,【不可打折金额】,【订单总金额】三者,则必须满足如下条件:【订单总金额】=【打折金额】+【不可打折金额】
	private String totalAmount;

	public static TradePrecreateApiForm newInstance() {
		return new TradePrecreateApiForm();
	}
	
	public TradePrecreateReq toTradePrecreateReq() {
		TradePrecreateReq target = TradePrecreateReq.newInstance();
		FastBeanCopyer.getInstance().copy(this, target);
		return target;
	}

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(String totalAmount) {
		this.totalAmount = totalAmount;
	}

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public int getOrderOriginType() {
		return orderOriginType;
	}

	public void setOrderOriginType(int orderOriginType) {
		this.orderOriginType = orderOriginType;
	}

}
