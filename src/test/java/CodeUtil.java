

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.apache.commons.collections.CollectionUtils;

import codeGenerate.def.FtlDef;
import codeGenerate.factory.CodeGenerateFactory;
/**
 * 
 * @author lintu5.com
 *
 */

public class CodeUtil {

/*	public static void main(String[] args) {
		 *//** 此处修改成你的 表名 和 中文注释
		 * @throws UnsupportedEncodingException 
		 * @throws ParseException ***//*
		 String tableName="comic"; //
		 String codeName ="漫画";//中文注释  当然你用英文也是可以的 
		 String entityPackage ="admin";//实体包
		 String keyType = FtlDef.KEY_TYPE_02;//主键生成方式 01:UUID  02:自增
		CodeGenerateFactory.codeGenerate(tableName, codeName,entityPackage,keyType);
	}
	*/
	public static void main(String[] args) throws UnsupportedEncodingException, ParseException {
		config();
	}

	private static void config() {
		/** 此处修改成你的 表名 和 中文注释***/
		String tableName="tob_monitor_box_scan_record"; //
		String codeName ="内场票箱扫码枪设备状态记录表";//中文注释  当然你用英文也是可以的
		String entityPackage ="";//实体包
		String keyType = FtlDef.KEY_TYPE_01;//主键生成方式 01:自增  02:UUID
		CodeGenerateFactory.codeGenerate(tableName, codeName,entityPackage,keyType);
	}
}
