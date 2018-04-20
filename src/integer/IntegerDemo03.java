/**   
 * @Package: integer @author: Shane  	@date: 2018年4月2日 下午5:09:44 
 * Usage: 
 */
package integer;

public class IntegerDemo03 {

	/**
	 * 包装类都提供了一个静态方法: parseInt(String str)  parseDouble(String str) ... 
	 * 可将字符串解析为对应的基本数据类型,前提是,该字符串描述的数据能被基本类型正确表示
	 */
	public static void main(String[] args) {
//		Integer i = Integer.valueOf(127);
		String s = "123";
		int i = Integer.parseInt(s);
		double d = Double.parseDouble(s);
		System.out.println(d);
		
		
//		String s1 = "123.123";			// 会报错.123.123 无法被基本类型(int)存储
//		double d1 = Double.parseDouble(s1);
		
		
	}

}
