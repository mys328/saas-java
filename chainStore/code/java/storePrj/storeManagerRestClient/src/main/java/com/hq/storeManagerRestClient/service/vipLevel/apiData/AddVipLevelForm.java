package com.hq.storeManagerRestClient.service.vipLevel.apiData;

import java.util.ArrayList;
import java.util.List;

import com.hq.storeManagerRestClient.service.vipLevel.data.VipContent;

public class AddVipLevelForm {
	// 等级编号
	private String number;
	// 等级名称
	private String name;
	// 等级分类VipLevelEnum
	private int type;
	// 等级时长 12月
	private int validPeriod;
	// 单位 对应 ValidPeriodUnitEnum
	private int validPeriodUnit;
	// 开通收费
	private long openCharge;
	// 续费收费
	private long renewCharge;
	// 等级状态 VipLevelStateEnum
	private int state;

	private VipContent vipContent = new VipContent();

	// 等级图片列表
	private List<String> imgPaths = new ArrayList<String>();
	// 等级默认图片
	private String defualtImg;

	public static AddVipLevelForm newInstance() {
		return new AddVipLevelForm();
	}

	public VipContent getVipContent() {
		return vipContent;
	}

	public void setVipContent(VipContent vipContent) {
		this.vipContent = vipContent;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public int getValidPeriod() {
		return validPeriod;
	}

	public void setValidPeriod(int validPeriod) {
		this.validPeriod = validPeriod;
	}

	public int getValidPeriodUnit() {
		return validPeriodUnit;
	}

	public void setValidPeriodUnit(int validPeriodUnit) {
		this.validPeriodUnit = validPeriodUnit;
	}

	public long getOpenCharge() {
		return openCharge;
	}

	public void setOpenCharge(long openCharge) {
		this.openCharge = openCharge;
	}

	public long getRenewCharge() {
		return renewCharge;
	}

	public void setRenewCharge(long renewCharge) {
		this.renewCharge = renewCharge;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public List<String> getImgPaths() {
		return imgPaths;
	}

	public void setImgPaths(List<String> imgPaths) {
		this.imgPaths = imgPaths;
	}

	public String getDefualtImg() {
		return defualtImg;
	}

	public void setDefualtImg(String defualtImg) {
		this.defualtImg = defualtImg;
	}

}
