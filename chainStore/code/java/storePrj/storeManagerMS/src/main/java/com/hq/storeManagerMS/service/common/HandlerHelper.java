package com.hq.storeManagerMS.service.common;

import org.apache.shiro.authz.AuthorizationException;

import com.hq.storeManagerMS.common.log.LogModule;
import com.hq.storeManagerMS.common.log.MainLog;
import com.zenmind.common.hotSwap.HotSwap;
import com.zenmind.dao.rest.RestProxyException;

public class HandlerHelper {

	public static HandlerHelper getInstance() {
		return HotSwap.getInstance().getSingleton(HandlerHelper.class);
	}
	
	public <T> void handleException(ExceptionInfo exceptionInfo, Exception e) {
		
		ReqResult<?> result = exceptionInfo.getResult();
		LogModule logModule = exceptionInfo.getLogModule();
		String logId = exceptionInfo.getLogId();
		String reason = exceptionInfo.getReason();
		MainLog.error(logModule, logId, reason, e);
		
		if (e instanceof AuthorizationException) { 
			result.setStatus(RespStatus.UN_AUTHORIZED);
			result.setTips("用户请求未授权");
		} else if(e instanceof RestProxyException) {
			RestProxyException errorTmp = (RestProxyException) e;
			String tips = errorTmp.getTips();
			RespStatus respStatus = RespStatus.getRespStatusEnumByCode(errorTmp.getStatusCode());
			result.setStatus(respStatus);
			result.setTips(tips);
		} else {
			result.setStatus(RespStatus.INTERNAL_SERVER_ERROR);
			result.setTips("服务暂不可用，请稍后尝试");
		}
	}
	
	// 根据operateTips 生成ReqResult
	public void handleReqResult(ReqResult<?> result, OperateTips operateTips) {
		result.setSuccess(operateTips.isSuccess());
		result.setStatus(RespStatus.INVALID_REQUEST);
		result.setTips(operateTips.getTips());
	}
	
}
