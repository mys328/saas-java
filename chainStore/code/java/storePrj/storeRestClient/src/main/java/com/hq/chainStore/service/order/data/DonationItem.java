package com.hq.chainStore.service.order.data;

/**
 * 赠送消费清单
 */
public class DonationItem {
	// 赠送项ID _donate_{buyType}_{pgId} 方便退单时使用
	private String donationItemId;
	// 购买类型 BuyTypeEnum
	private int buyType;
	// 项目/商品/次卡/套餐的ID
	private String pgId;
	// 售价
	private float price;
	// 数量
	private int count;
	// 总价
	private float cost;

	public static DonationItem newInstance() {
		return new DonationItem();
	}

	public int getBuyType() {
		return buyType;
	}

	public void setBuyType(int buyType) {
		this.buyType = buyType;
	}

	public String getPgId() {
		return pgId;
	}

	public void setPgId(String pgId) {
		this.pgId = pgId;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public String getDonationItemId() {
		return donationItemId;
	}

	public void setDonationItemId(String donationItemId) {
		this.donationItemId = donationItemId;
	}
}
