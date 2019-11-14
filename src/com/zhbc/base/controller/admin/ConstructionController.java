package com.zhbc.base.controller.admin;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.zhbc.framework.controller.ABaseController;
import com.zhbc.framework.service.IBaseService;
import com.zhbc.base.entity.Construction;
 import com.zhbc.base.service.ConstructionService;
/**
 * 
 * <br>
 * <b>功能：</b>ConstructionController<br>
 *   <br>
 */ 
@Controller
public class ConstructionController extends ABaseController<Construction>{
	
	private final static Logger log= Logger.getLogger(ConstructionController.class);
	@Autowired(required=false) 
	private ConstructionService constructionService; 
	
	@Override
	protected IBaseService<Construction> getBaseService() {
		// TODO Auto-generated method stub
		return constructionService;
	}
	
	

}
