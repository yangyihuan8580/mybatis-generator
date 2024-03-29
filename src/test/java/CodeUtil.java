

import java.io.UnsupportedEncodingException;
import java.text.ParseException;


import codeGenerate.def.FtlDef;
import codeGenerate.factory.CodeGenerateFactory;
/**
 * 
 * @author lintu5.com
 *
 */

public class CodeUtil {


	public static void main(String[] args) throws UnsupportedEncodingException, ParseException {
		config();
	}

	private static void config() {
		/** 此处修改成你的 表名 和 中文注释***/
		String tableName="park"; //
		String codeName ="车场表";//中文注释  当然你用英文也是可以的
		String entityPackage ="";//实体包
		String keyType = FtlDef.KEY_TYPE_01;//主键生成方式 01:自增  02:UUID
		CodeGenerateFactory.codeGenerate(tableName, codeName,entityPackage,keyType);
	}
}
