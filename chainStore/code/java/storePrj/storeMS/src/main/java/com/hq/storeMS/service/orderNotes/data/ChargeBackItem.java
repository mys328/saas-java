package com.hq.storeMS.service.orderNotes.data;

import com.zenmind.dataSyn.annotation.SynClass;

/**
 * 退款明细
 * 
 * @author kevin
 *
 */
@SynClass
public class ChargeBackItem {
	// 退款项 为空则表明是退款项
	private String itemId;// buyItemId donationItemId delimitCardItemId
	// BuyTypeEnum 购买类型  对于划卡的类型  ProductCardItemEnum 需要转换
	private int buyType;
	// 项目、商品、次卡、套餐ID
	private String pgId;
	// 项目、商品、次卡、套餐名称
	private String pgName;
	// 退单金额
	private float cost;
	// 退单数量
	private int count;

	public static ChargeBackItem newInstance() {
		return new ChargeBackItem();
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getPgId() {
		return pgId;
	}

	public void setPgId(String pgId) {
		this.pgId = pgId;
	}

	public String getPgName() {
		return pgName;
	}

	public void setPgName(String pgName) {
		this.pgName = pgName;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getBuyType() {
		return buyType;
	}

	public void setBuyType(int buyType) {
		this.buyType = buyType;
	}
}
