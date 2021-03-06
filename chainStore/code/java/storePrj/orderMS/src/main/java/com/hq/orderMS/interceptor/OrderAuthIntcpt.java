package com.hq.orderMS.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hq.orderMS.common.log.LogModule;
import com.hq.orderMS.common.log.MainLog;
import com.hq.orderMS.common.validate.info.ValidateInfo;
import com.hq.orderMS.service.auth.AuthConstants;
import com.zenmind.common.json.JsonUtil;

public class OrderAuthIntcpt extends HandlerInterceptorAdapter {
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		MainLog.info(LogModule.Tmp, "OrderAuthIntcpt[preHandle]", "test info");
		if(isFromOtherMS(request)) {
			return super.preHandle(request, response, handler);
		}
		return false;
	}
	
	// 是否是第三方MS的调用
	private boolean isFromOtherMS(HttpServletRequest request) {
		String validateInfo = request.getHeader(AuthConstants.HEADER_ACCESS_VALIDATE_INFO);
		if (StringUtils.isNotBlank(validateInfo)) {
			ValidateInfo info = JsonUtil.getInstance().fromJson(validateInfo, ValidateInfo.class);
			int appId = info.getAppId();
			// 校验appId的合法性 这里暂时只==1
			return appId == 1;
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		MainLog.info(LogModule.Tmp, "OrderAuthIntcpt[postHandle]", "test info");
		super.postHandle(request, response, handler, modelAndView);
	}

}
