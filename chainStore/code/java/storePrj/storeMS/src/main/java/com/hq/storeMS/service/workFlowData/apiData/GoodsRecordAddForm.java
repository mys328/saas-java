package com.hq.storeMS.service.workFlowData.apiData;

import com.hq.storeMS.common.constants.ServerConstants;
import com.hq.storeMS.common.util.AppUtils;
import com.hq.storeMS.service.workFlowData.data.GoodsRecord;
import com.hq.storeMS.service.workFlowData.data.RecordTypeEnum;
import com.zenmind.common.BigDecimalUtil;
import com.zenmind.common.beanCopy.FastBeanCopyer;

public class GoodsRecordAddForm {
	// 商品ID
	private String goodsId;
	// 商品数量
	private int count;
	// 原价
	private float oldPrice;
	// 折扣
	private float discount;
	// 记录类型 RecordTypeEnum
	private int recordType;
	
	//预存数量
	private int restCount;

	public static GoodsRecordAddForm newInstance() {
		return new GoodsRecordAddForm();
	}
	
	public GoodsRecord toGoodsRecord() {
		GoodsRecord data = GoodsRecord.newInstance();
		FastBeanCopyer.getInstance().copy(this, data);
		if(recordType == RecordTypeEnum.Buy.ordinal()) {
			data.setPrice(BigDecimalUtil.round(oldPrice * discount / ServerConstants.DISCOUNT_NUM, 2));
		}else {
			data.setPrice(oldPrice);
		}
		data.setCost(BigDecimalUtil.round(oldPrice * count, 2));
		data.setPay(BigDecimalUtil.round(oldPrice * count * discount / ServerConstants.DISCOUNT_NUM, 2));
		data.setId(AppUtils.joinByUnderline(goodsId, recordType));
		return data;
	}

	public String getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public float getDiscount() {
		return discount;
	}

	public void setDiscount(float discount) {
		this.discount = discount;
	}

	public int getRecordType() {
		return recordType;
	}

	public void setRecordType(int recordType) {
		this.recordType = recordType;
	}

	public float getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(float oldPrice) {
		this.oldPrice = oldPrice;
	}

	public int getRestCount() {
		return restCount;
	}

	public void setRestCount(int restCount) {
		this.restCount = restCount;
	}
}
