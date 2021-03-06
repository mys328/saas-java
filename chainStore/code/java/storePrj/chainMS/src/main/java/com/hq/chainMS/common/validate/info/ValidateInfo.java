package com.hq.chainMS.common.validate.info;

public class ValidateInfo {
	private long bossId;
	private long storeId;
	private int appId;

	public static ValidateInfo newInstance() {
		ValidateInfo data = new ValidateInfo();
		return data;
	}

	public static ValidateInfo newInstance(long bossIdP) {
		ValidateInfo data = new ValidateInfo();
		data.bossId = bossIdP;
		return data;
	}

	public long getBossId() {
		return bossId;
	}

	public void setBossId(long bossId) {
		this.bossId = bossId;
	}

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}
}
