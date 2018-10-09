package com.hq.chainStore.service.arrearage.data;

import java.util.ArrayList;
import java.util.List;

import com.hq.chainStore.service.order.data.PayItem;

public class PaymentHistory {
	// 创建者ID
	private long creatorId;
	// 创建者名称
	private String creatorName;
	// 还款时间
	private long createdTime;
	// 还款明细
	private List<PayItem> payItems = new ArrayList<PayItem>();

	public static PaymentHistory newInstance() {
		PaymentHistory arrearage = new PaymentHistory();
		arrearage.createdTime = System.currentTimeMillis();
		return arrearage;
	}

	public long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(long creatorId) {
		this.creatorId = creatorId;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(long createdTime) {
		this.createdTime = createdTime;
	}

	public List<PayItem> getPayItems() {
		return payItems;
	}

	public void setPayItems(List<PayItem> payItems) {
		this.payItems = payItems;
	}

}
