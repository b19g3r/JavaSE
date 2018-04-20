package exception;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @PackageName: exception
 * @ClassName: FinallyDemo3
 * @Description: jkd 1.7 之后, 流自动关闭
 * @Author: Shane
 * @Date: 2018/4/9 17:50
 **/

public class FinallyDemo3 {
    public static void main(String[] args) {

        try (
            /**
             * AutoCloseable 接口的子类可以定义在这里
             * 自动关闭语法是编辑器认可的
             */
            FileInputStream fis = new FileInputStream("fos.txt");
        ){
            int d = fis.read();
            System.out.println(d);

        } catch (IOException e) {

        }

    }
}
