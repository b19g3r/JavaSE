package reflect;

/**
 * @PackageName: reflect
 * @ClassName: Koo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/20 10:42
 * @Verson: v0.1
 **/

public class Koo {
    String name;
    static {
        // 静态代码块: 在类加载期间执行
        System.out.println("Load Koo. only once");
    }

    public Koo() {
        this.name = "Koo 的 name";
        System.out.println("Koo 的 Cons");
    }
    public Koo(String name) {
        this.name = name;
        System.out.println("Koo 的 String Cons");
    }
//
//    @Override
//    public String toString() {
//        return "Koo.toString()";
//
//    }

    public void test() {
        System.out.println("Koo  的 Test()");
    }
    public String test1() {
        System.out.println("Koo  的 Test1()");
        return "test1";
    }

    public void test(String name) {
        System.out.println("Who are u ? "+ name);
    }
    public void whoru(String name) {
        System.out.println("Who are u ? "+ name);
    }
}
