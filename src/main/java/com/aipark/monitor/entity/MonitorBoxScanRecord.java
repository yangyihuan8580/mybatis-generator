package com.aipark.monitor.entity;

import com.zhbc.framework.vo.SuperVO;
/**
 * 
 * <br>
 * <b>功能：</b>MonitorBoxScanRecordEntity<br>
 */
public class MonitorBoxScanRecord extends SuperVO {
	
		private java.lang.Long scanRecordId;//   	private java.lang.String barcode;//   设备唯一标识码	private java.lang.String name;//   通道名称	private java.lang.Long parkId;//   停车场ID	private java.lang.Integer eventType;//   事件类型 1连接断开 2连接恢复	private java.util.Date eventTime;//   发生事件时间	private java.lang.Long parkingareaId;//   具体停车场的ID	private java.lang.Long terminalId;//   航站楼ID	public java.lang.Long getScanRecordId() {	    return this.scanRecordId;	}	public void setScanRecordId(java.lang.Long scanRecordId) {	    this.scanRecordId=scanRecordId;	}	public java.lang.String getBarcode() {	    return this.barcode;	}	public void setBarcode(java.lang.String barcode) {	    this.barcode=barcode;	}	public java.lang.String getName() {	    return this.name;	}	public void setName(java.lang.String name) {	    this.name=name;	}	public java.lang.Long getParkId() {	    return this.parkId;	}	public void setParkId(java.lang.Long parkId) {	    this.parkId=parkId;	}	public java.lang.Integer getEventType() {	    return this.eventType;	}	public void setEventType(java.lang.Integer eventType) {	    this.eventType=eventType;	}	public java.util.Date getEventTime() {	    return this.eventTime;	}	public void setEventTime(java.util.Date eventTime) {	    this.eventTime=eventTime;	}	public java.lang.Long getParkingareaId() {	    return this.parkingareaId;	}	public void setParkingareaId(java.lang.Long parkingareaId) {	    this.parkingareaId=parkingareaId;	}	public java.lang.Long getTerminalId() {	    return this.terminalId;	}	public void setTerminalId(java.lang.Long terminalId) {	    this.terminalId=terminalId;	}
}

