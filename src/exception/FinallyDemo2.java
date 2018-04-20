package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @PackageName: exception
 * @ClassName: FinallyDemo2
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/9 17:38
 **/

public class FinallyDemo2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("fos.txt");
            fis.read();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                // ...
            }
        }
    }
}
