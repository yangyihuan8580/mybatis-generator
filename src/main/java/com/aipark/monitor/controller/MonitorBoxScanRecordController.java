package com.aipark.monitor.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zhbc.framework.controller.ABaseController;
import com.zhbc.framework.service.IBaseService;
import com.aipark.monitor.entity.MonitorBoxScanRecord;
 import com.aipark.monitor.service.MonitorBoxScanRecordService;
/**
 * 
 * <br>
 * <b>功能：</b>MonitorBoxScanRecordController<br>
 *   <br>
 */ 
@Controller
@RequestMapping("/monitorBoxScanRecord")
public class MonitorBoxScanRecordController extends ABaseController<MonitorBoxScanRecord>{
	
	private final static Logger log= Logger.getLogger(MonitorBoxScanRecordController.class);
	@Autowired
	private MonitorBoxScanRecordService monitorBoxScanRecordService; 
	
	@Override
	protected IBaseService<MonitorBoxScanRecord> getBaseService() {
		// TODO Auto-generated method stub
		return monitorBoxScanRecordService;
	}
	
	

}
