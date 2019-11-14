package com.zhbc.base.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhbc.framework.dao.IBaseDao;
import com.zhbc.framework.service.ABaseServiceImpl;
import com.zhbc.base.entity.Construction;
import com.zhbc.base.dao.ConstructionDao;
import com.zhbc.base.service.ConstructionService;

/**
 * 
 * <br>
 * <b>功能：</b>ConstructionService<br>
 */
@Service("constructionService")
public class  ConstructionServiceImpl  extends ABaseServiceImpl<Construction> implements ConstructionService {
  private final static Logger log= Logger.getLogger(ConstructionServiceImpl.class);
	

	@Autowired
    private ConstructionDao constructionDao;
	

	@Override
	protected IBaseDao<Construction> getBaseDao() {
		return constructionDao;
	}

}
