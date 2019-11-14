package ${bussPackage}.dao#if($!entityPackage).${entityPackage}#end;


import org.springframework.stereotype.Repository;

import ${bussPackage}.entity#if($!entityPackage).${entityPackage}#end.${className};
import com.zhbc.framework.dao.IBaseDao;
/**
 * 
 * <br>
 * <b>功能：</b>${className}Dao<br>
 */
 @Repository
public interface ${className}Dao extends IBaseDao<${className}> {
	
	
}
