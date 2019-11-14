package com.aipark.monitor.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhbc.framework.dao.IBaseDao;
import com.zhbc.framework.service.ABaseServiceImpl;
import com.aipark.monitor.entity.MonitorBoxScanRecord;
import com.aipark.monitor.dao.MonitorBoxScanRecordDao;
import com.aipark.monitor.service.MonitorBoxScanRecordService;

/**
 * 
 * <br>
 * <b>功能：</b>MonitorBoxScanRecordService<br>
 */
@Service("monitorBoxScanRecordService")
public class  MonitorBoxScanRecordServiceImpl  extends ABaseServiceImpl<MonitorBoxScanRecord> implements MonitorBoxScanRecordService {
  private final static Logger log= Logger.getLogger(MonitorBoxScanRecordServiceImpl.class);
	

	@Autowired
    private MonitorBoxScanRecordDao monitorBoxScanRecordDao;
	

	@Override
	protected IBaseDao<MonitorBoxScanRecord> getBaseDao() {
		return monitorBoxScanRecordDao;
	}

}
