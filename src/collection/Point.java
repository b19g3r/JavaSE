package collection;

/**
 * @PackageName: collection
 * @ClassName: Point
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/16 16:25
 **/

public class Point implements Comparable<Point> {
    private int x;
    private int y;

    public Point(int x, int y) {
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

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        /*if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x &&
                y == point.y;*/
        if (o == null) {
            return false;
        }
        if (o == this) {
            return true;
        }
        if (o instanceof Point) {
            Point p = (Point) o;
            return p.x == this.x && p.y == this.y;
        }
        return false;
    }


    /**
     * 实现 Compoarable 接口后,必须重写compareTo()
     * 返回值大于0:   this > o
     *       小于0:   this > o
     *       等于0:   this > o
     * @param o
     * @return
     */
    @Override
    public int compareTo(Point o) {
//        if ((this.x * this.x + this.y * this.y) > (o.x * o.x + o.y * o.y))
//            return 1;
//        if (this.x == o.x && this.y == o.y)
//            return 0;
//        return -1;
        int thisLen = this.x * this.x + this.y * this.y;
        int oLen = o.x * o.x + o.y * o.y;
        return thisLen-oLen;
    }
}
