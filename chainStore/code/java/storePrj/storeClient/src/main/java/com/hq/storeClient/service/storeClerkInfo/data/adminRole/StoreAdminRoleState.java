package com.hq.storeClient.service.storeClerkInfo.data.adminRole;

public enum StoreAdminRoleState {
	
	Available,  //有效
	Invalide,	//失效
	Delete,		//删除
	;
	
	public static StoreAdminRoleState valueOf(int ordinal) {
        if (ordinal < 0 || ordinal >= values().length) {
            throw new IndexOutOfBoundsException("Invalid ordinal");
        }
        return values()[ordinal];
    }
	
}
