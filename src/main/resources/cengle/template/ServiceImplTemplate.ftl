package ${bussPackage}.service.impl#if($!entityPackage).${entityPackage}#end;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhbc.framework.dao.IBaseDao;
import com.zhbc.framework.service.ABaseServiceImpl;
import ${bussPackage}.entity#if($!entityPackage).${entityPackage}#end.${className};
import ${bussPackage}.dao#if($!entityPackage).${entityPackage}#end.${className}Dao;
import ${bussPackage}.service#if($!entityPackage).${entityPackage}#end.${className}Service;

/**
 * 
 * <br>
 * <b>功能：</b>${className}Service<br>
 */
@Service("${lowerName}Service")
public class  ${className}ServiceImpl  extends ABaseServiceImpl<${className}> implements ${className}Service {
  private final static Logger log= Logger.getLogger(${className}ServiceImpl.class);
	

	@Autowired
    private ${className}Dao ${lowerName}Dao;
	

	@Override
	protected IBaseDao<${className}> getBaseDao() {
		return ${lowerName}Dao;
	}

}
