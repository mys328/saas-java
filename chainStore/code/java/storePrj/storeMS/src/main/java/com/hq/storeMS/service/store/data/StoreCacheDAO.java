package com.hq.storeMS.service.store.data;

import com.zenmind.common.hotSwap.HotSwap;

public class StoreCacheDAO {

	public static StoreCacheDAO getInstance() {
		return HotSwap.getInstance().getSingleton(StoreCacheDAO.class);
	}

	public void save(Store target) {
		StoreRedisDAO.getInstance().save(target);
	}
	
	public Store get(long id) {
		return StoreRedisDAO.getInstance().get(id);
	}

	public void delete(Store target) {
		StoreRedisDAO.getInstance().delete(target.getId());
	}
}
