package ${bussPackage}.service#if($!entityPackage).${entityPackage}#end;
import com.zhbc.framework.service.IBaseService;
import ${bussPackage}.entity#if($!entityPackage).${entityPackage}#end.${className};

/**
 * 
 * <br>
 * <b>功能：</b>${className}Service<br>
 */
public interface ${className}Service extends IBaseService<${className}> {

}
