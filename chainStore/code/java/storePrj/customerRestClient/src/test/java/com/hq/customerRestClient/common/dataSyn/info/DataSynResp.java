package com.hq.customerRestClient.common.dataSyn.info;

import java.util.List;

public class DataSynResp {

	private String ownerId;

	private List<DataSynItem> itemList;

	public static DataSynResp newInstance(String ownerIdP,
			List<DataSynItem> itemListP) {

		DataSynResp synResp = new DataSynResp();
		synResp.itemList = itemListP;
		synResp.ownerId = ownerIdP;

		return synResp;
	}

	public List<DataSynItem> getItemList() {
		return itemList;
	}

	public void setItemList(List<DataSynItem> itemList) {
		this.itemList = itemList;
	}

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

}