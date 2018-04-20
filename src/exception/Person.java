package exception;

/**
 * @PackageName: exception
 * @ClassName: Person
 * @Description: 测试异常抛出
 * @Author: Shane
 * @Date: 2018/4/10 9:13
 **/

public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    /**
     * 一个方法内部throw 了异常,就要在方法上用 throws 声明该异常的抛出以告知调用者处理之
     * 只有 RuntimeException 及其子类型异常在方法中抛出是不要求必须在方法上声明该异常的抛出.
     * 其他类型是必须要在方法上声明 thropws XXX
     **/
    public void setAge(int age) throws Exception {
        if (age < 0 || age > 140) {
            // 取值不在合理区间,抛出异常
            throw new IllegalAgeException("illegal age");
        }
        this.age = age;
    }
}
