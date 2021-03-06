package com.hq.chainStore.service.areaCode.apiData;

public class AreaCodeAddForm {
	// 国家代码
	private String areaCode;
	// 国家名称 中文
	private String countryCh;
	// 国家名称 英文
	private String countryEn;

	public static AreaCodeAddForm newInstance() {
		return new AreaCodeAddForm();
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getCountryCh() {
		return countryCh;
	}

	public void setCountryCh(String countryCh) {
		this.countryCh = countryCh;
	}

	public String getCountryEn() {
		return countryEn;
	}

	public void setCountryEn(String countryEn) {
		this.countryEn = countryEn;
	}
}
