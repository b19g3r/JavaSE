/**   
 * @Package: object 
 * @author: Shane  	Usage: 测试 point 重写object 类
 * @date: 2018年4月2日 下午2:53:41 
 */
package object;

public class PointTest {

	/**
	 * Usage:
	 */
	public static void main(String[] args) {

		Point p1 = new Point(1, 2);
		Point p2 = new Point(2, 2);
		Point p3 = new Point(2, 2);
//		String toString()
//		将当前对象转换为一个字符串
//		返回当前对象的句柄(引用),格式为 类名@地址
//		通常需要重写
		
		String s = p1.toString();
		System.out.println(s);
		System.out.println(p1);
		
		System.out.println(p1.equals(p2));		// false
		System.out.println(p2.equals(p3));		// true   判断内容是否一样
		System.out.println(p2==p3);				// false  判断是否指向同一个对象
		
		
	}

}
