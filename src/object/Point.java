/**   
 * @Package: object 
 * @author: Shane  	Usage: 用Point 测试重写Object 相关方法的规则
 * @date: 2018年4月2日 下午2:25:49 
 */
package object;

public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
//	toString() 
//	原则上应该包含当前对象的属性信息
	@Override
    public String toString() {
		return "("+x+"."+y+")";
	}
	
//	equals()	
//	java 内部是用==实现的. equals 一般需要重写
	
	public boolean equals(Point other) {
		if (other == null) {
			return false;
		}
		if (other == this) {
			return true;
		}
		return this.x == other.x && this.y == other.y;
	}
	
	
	@Override
    public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		if (o instanceof Point) {
			Point p = (Point)o;
			return this.x == p.x && this.y == p.y;
		}
		return false;
			
	}
	
	
	
	

}
