package com.hq.chainMS.service.areaCode.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hq.chainMS.service.areaCode.apiData.AreaCodeAddForm;
import com.hq.chainMS.service.areaCode.apiData.AreaCodeQueryForm;
import com.hq.chainMS.service.areaCode.bs.AreaCodeHandler;
import com.hq.chainMS.service.areaCode.data.AreaCode;
import com.hq.chainMS.service.common.ReqResult;
import com.hq.chainMS.service.common.RestResp;

@RestController
@RequestMapping(value = "/areaCode")
public class AreaCodeAPI {
	
	@RequestMapping(value = "/findByCond" ,method = RequestMethod.GET,  produces="application/json")
    public ResponseEntity<RestResp<AreaCode>> findByCond(
    		@RequestParam(value="pageItemCount", required=true)Integer pageItemCount,
    		@RequestParam(value="pageNo", required=true)Integer pageNo){
		AreaCodeQueryForm queryForm = AreaCodeQueryForm.newInstance();
		queryForm.setPageItemCount(pageItemCount).setPageNo(pageNo);
		ReqResult<AreaCode> result = AreaCodeHandler.getInstance().findByCond(queryForm);
		ResponseEntity<RestResp<AreaCode>> respEntity = result.buildRespEntity();
		return respEntity;
    }  
	
	
	@RequestMapping(value = "/{areaCodeId}", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<RestResp<AreaCode>> get(
			@PathVariable("areaCodeId") long areaCodeId) {
		ReqResult<AreaCode> result = AreaCodeHandler.getInstance().getAreaCode(areaCodeId);
		ResponseEntity<RestResp<AreaCode>> respEntity = result.buildRespEntity();
		return respEntity;
	}


	@RequestMapping(value = "", method = RequestMethod.POST, produces = "application/json")
	public ResponseEntity<RestResp<AreaCode>> add(
			@RequestBody AreaCodeAddForm inputForm) {
		ReqResult<AreaCode> result = AreaCodeHandler.getInstance().addAreaCode(inputForm);
		ResponseEntity<RestResp<AreaCode>> respEntity = result.buildRespEntity();
		return respEntity;
	}
}
