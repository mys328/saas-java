package com.hq.storeClient.service.storeCardInfo.apiData;

public class MemberCardCancelForm {
	private long chainId;
	private String id;

	public static MemberCardCancelForm newInstance() {
		return new MemberCardCancelForm();
	}

	public long getChainId() {
		return chainId;
	}

	public void setChainId(long chainId) {
		this.chainId = chainId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
