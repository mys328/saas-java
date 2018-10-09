package com.hq.chainStore.service.workFlowData.apiData;


public class WorkFlowDataAddForm {
	// 店铺ID
	private long storeId;
	// 创建者ID
	private long buserId;
	// 工作流ID
	private long workFlowTypeId;
	
	public static WorkFlowDataAddForm newInstance() {
		return new WorkFlowDataAddForm();
	}

	public long getStoreId() {
		return storeId;
	}

	public void setStoreId(long storeId) {
		this.storeId = storeId;
	}

	public long getBuserId() {
		return buserId;
	}

	public void setBuserId(long buserId) {
		this.buserId = buserId;
	}

	public long getWorkFlowTypeId() {
		return workFlowTypeId;
	}

	public void setWorkFlowTypeId(long workFlowTypeId) {
		this.workFlowTypeId = workFlowTypeId;
	}
}
