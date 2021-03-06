package com.hq.storeClient.service.orderTrack.data;

import com.hq.storeClient.common.restClientResp.RestClientCfg;
import com.zenmind.common.hotSwap.HotSwap;
import com.zenmind.dao.rest.RestDao;

public class OrderTrackDAO extends RestDao<OrderTrack> {

	public static OrderTrackDAO getInstance(){
		return HotSwap.getInstance().getSingleton(OrderTrackDAO.class);
	}
	
	@Override
	public String getService() {
		return RestClientCfg.getService();
	}
}
