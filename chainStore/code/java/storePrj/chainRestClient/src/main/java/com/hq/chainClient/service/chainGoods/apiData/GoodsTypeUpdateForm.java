package com.hq.chainClient.service.chainGoods.apiData;

public class GoodsTypeUpdateForm {
	private String id;
	private String name;

	public static GoodsTypeUpdateForm newInstance() {
		return new GoodsTypeUpdateForm();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}