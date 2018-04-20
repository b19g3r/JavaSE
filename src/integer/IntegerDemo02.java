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

public class IntegerDemo02 {
	public static void main(String[] args) {
//		Integer i1 = new Integer(127); 
//		Integer i0 = new Integer(127); 
		Integer i11 = new Integer("a"); 
//		Integer i2 = new Integer(1);
		Integer i21 = Integer.valueOf(1); 
		Integer i22 = Integer.valueOf(1); 
		
		System.out.println(i21 == i22);
//		System.out.println(i1.equals(i0));
		
		
//		int d = i1.intValue();
//		System.out.println(d);
//		double d1 = i1.doubleValue();
//		System.out.println(d1);
//		
//		double d11 = i1.byteValue();
//		System.out.println(d11);
		double d12 = i11.byteValue();
		System.out.println(d12);			// 溢出
		System.out.println();

		
		
	}
	
	
	
}
