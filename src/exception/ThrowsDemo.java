package exception;

import java.awt.*;
import java.io.EOFException;
import java.io.IOException;
import java.net.UnknownHostException;

/**
 * @PackageName: exception
 * @ClassName: ThrowsDemo
 * @Description: 子类重写父类含有throws声明异常抛出的方法时对throws 的重写原则
 * @Author: Shane
 * @Date: 2018/4/10 10:12
 **/

public class ThrowsDemo {
    /**
     *
     */
    public void demo() throws IOException,AWTException {

    }
}

class son extends ThrowsDemo {
    // 子类可以不抛出任何异常
//    public void dosome(){
//
//    }
// 子类可以抛出部分异常
//    public void dosome() throws IOException{
//
//    }
// 子类可以抛出父类异常的子类型异常
//    public void dosome() throws EOFException {
//
//    }
    // 子类不可以抛出父类异常的父类型异常
    public void dosome() throws Exception {

    }


}

class Main{
    public static void main(String[] args) throws Exception {
        son s = new son();
        s.dosome();
    }
}
