import java.util.Map;

  
    /**    
 * @Title: Test.java  
 * @Package   
 * @Description: TODO(用一句话描述该文件做什么)  
 * @author zhht  
 * @date 2019年8月2日  
 * @version V1.0    
 */

/**  
 * @ClassName: Test  
 * @Description: TODO(这里用一句话描述这个类的作用)  
 * @author zhht  
 * @date 2019年8月2日  
 *    
 */

public class Test {

	public static void main(String[] args) {
		Map<Integer,String> t = new TreeMap<>();
		t.put(1, "111");
		t.put(2, "222");
		System.err.println(t.size());
		String string = t.get(3);
		System.out.println(string);
		Integer integer1 = new Integer(1);
		Integer integer2 = new Integer(1);
		
		Integer a = 1;
		Integer b = 1;
		
		Integer c = Integer.valueOf(1);
		Integer d = Integer.valueOf(1);
		System.err.println(integer1 == integer2);
		System.err.println(a == b);
		System.err.println(c == d);
		System.err.println(1 == new Integer(1));
	}
}
