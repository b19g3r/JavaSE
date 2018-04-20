/**   
 * @Package: integer @author: Shane  	@date: 2018年4月3日 下午7:10:14 
 * Usage: 
 */
package integer;


public class Test {

	/**
	 * Usage:
	 */
	public static void main(String[] args) {
		// 使用静态方法将基本类型转换为包装类
		Integer i1 = Integer.valueOf(1);  
		Integer i2 = Integer.valueOf(1);  
		System.out.println(i1==i2);         // true

		i1=1;
		i2=1;
		System.out.println(i1==i2);         // true

		i1 = new Integer(1);  
		i2 = new Integer(1);  
		System.out.println(i1==i2);         // false

		
		// 溢出
		Integer i3=Integer.valueOf(128);	// 等价于 new integer(128)  动态的创建
		Integer i4=Integer.valueOf(128);	// 等价于 new integer(128)  动态的创建
		System.out.println(i3+" "+i4);
		System.out.println(i3==i4);         // true  X =====>  false

		i3=128;
		i4=128;
		System.out.println(i3==i4);			// false 

		i1 = new Integer(1);  
		i2 = Integer.valueOf(1);  
		System.out.println(i1==i2); 		// false

	}
}
