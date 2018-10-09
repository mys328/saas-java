package com.hq.storeClient.service.buser.apiData;

import com.zenmind.dao.rest.ReqMap;

public class BUserChainQueryForm {
	// 连锁店ID
	private long chainId;
	// 手机号或名称
	private String phoneOrName;

	private int pageItemCount;
	private int pageNo;

	public static BUserChainQueryForm newInstance() {
		return new BUserChainQueryForm();
	}
	
	public String getListId() {
		return String.valueOf(chainId);
	}

	public ReqMap toReqMap() {
		ReqMap reqMap = ReqMap.newInstance();
		reqMap.add("chainId", chainId).add("phoneOrName", phoneOrName);
		return reqMap;
	}

	public long getChainId() {
		return chainId;
	}

	public BUserChainQueryForm setChainId(long chainId) {
		this.chainId = chainId;
		return this;
	}

	public int getPageItemCount() {
		return pageItemCount;
	}

	public BUserChainQueryForm setPageItemCount(int pageItemCount) {
		this.pageItemCount = pageItemCount;
		return this;
	}

	public int getPageNo() {
		return pageNo;
	}

	public BUserChainQueryForm setPageNo(int pageNo) {
		this.pageNo = pageNo;
		return this;
	}

	public String getPhoneOrName() {
		return phoneOrName;
	}

	public BUserChainQueryForm setPhoneOrName(String phoneOrName) {
		this.phoneOrName = phoneOrName;
		return this;
	}

}
