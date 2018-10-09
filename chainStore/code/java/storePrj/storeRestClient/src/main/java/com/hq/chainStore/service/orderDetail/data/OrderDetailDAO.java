package com.hq.chainStore.service.orderDetail.data;

import com.hq.chainStore.service.common.RestClientCfg;
import com.zenmind.common.hotSwap.HotSwap;
import com.zenmind.dao.rest.RestDao;

public class OrderDetailDAO extends RestDao<OrderDetail> {

	public static OrderDetailDAO getInstance(){
		return HotSwap.getInstance().getSingleton(OrderDetailDAO.class);
	}
	
	@Override
	public String getService() {
		return RestClientCfg.getStoreService();
	}
}
