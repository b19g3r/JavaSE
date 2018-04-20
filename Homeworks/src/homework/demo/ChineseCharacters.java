/**   
 * @Package: homework @author: Shane  	@date: 2018年4月2日 下午6:50:14 
 * Usage: 
 * 		:
 */
package homework.demo;

public class ChineseCharacters {

	/**
	 * Usage:
	 */
	public static void main(String[] args) {
		// 汉字的编码范围: 4E00-9FA5
		
		StringBuilder sb = new StringBuilder();
		char a = '\u4E00';char b = '\u9FA5'; 
		for(int i=1;a<b;a++,i++) {
			//System.out.print(a+" ");
			sb.append(a);
			 if (i % 50 == 0) {
	                sb.append("\n");
			 }

		}
		for(int i=1;i<sb.length();i++) {
			System.out.print(sb.charAt(i));
//			if(i%50 == 0){
//				System.out.println();
//			}
		}
	}

}
