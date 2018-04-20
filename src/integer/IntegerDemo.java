/**   
 * @Package: interger 
 * @author: Shane  	
 * Usage: 包装类
 * 为了让基本类型具有面向对象的特性,java 提供了8个基本类型的包装类
 * 继承自 java.lang.Number Number 是一个抽象类,定义了不同类型之间互相转化的方达
 * 所以6个数字类型的包装类都可以
 * @date: 2018年4月2日 下午4:01:26 
 */
package integer;

public class IntegerDemo {
	public static void main(String[] args) {
		Integer i1 = new Integer(127); 
		Integer i2 = new Integer(127); 
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		
		Integer i3 = new Integer("456"); 
		System.out.println(i3);
		
		double d1 = i3.doubleValue();
		System.out.println(d1);
		
		String s1 = i3.toString();
		System.out.println(s1);
		
		String s2 = "123456";
		Integer ii1 = Integer.parseInt(s2);
		System.out.println(ii1);		
		
		
	}
	
	
	
}
