package com.hq.storeMS.service.storeBeauticianInfo.data;

import com.zenmind.common.hotSwap.HotSwap;
import com.zenmind.dao.redis.RedisDao;

public class StoreBeauticianInfoRedisDAO extends RedisDao<StoreBeauticianInfo> {

	public static StoreBeauticianInfoRedisDAO getInstance(){
		return HotSwap.getInstance().getSingleton(StoreBeauticianInfoRedisDAO.class);
	}
	
}
