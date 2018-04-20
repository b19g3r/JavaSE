/**   
 * @Package: integer @author: Shane  	@date: 2018年4月2日 下午5:21:35 
 * Usage: 
 */
package integer;

public class IntegerDemo04 {

	/**
	 * JDK 1.5 之后推出的一个新特性,自动拆装箱
	 * 该特性是编译器认可,而不是JVM
	 * 编译器在编译代码时若遇到基本类型与包装类型互用时会自动补全他们之间抓换的代码.
	 * 这样做可以让我们在源代码编写时,不再考虑互转.
	 * 范传奇: fancq@tedu.cn
	 */
	public static void main(String[] args) {

		/**
		 * 触发了自动拆箱,编译器会将代码改变为: int i = new Integer(1).intValue();
		 */
		int i = new Integer(1);

		/**
		 * 触发了自动装箱特性,编译器会将代码改变为: Integer in = Integer.valueOf(i);
		 */

		Integer in = i; // 等价于Integer.valueOf(10)

	}

	public static void doSome(Object o) {
		System.out.println(o);
	}

}
