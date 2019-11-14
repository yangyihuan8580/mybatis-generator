package ${bussPackage}.entity#if($!entityPackage).${entityPackage}#end;

import com.zhbc.framework.vo.SuperVO;
import lombok.Data;

/**
 * 
 * <br>
 * <b>功能：</b>${className}Entity<br>
 */
@Data
public class ${className} extends SuperVO {
	
	${feilds}
}

