/**
 * @Package: file @author: Shane  	@date: 2018年4月3日 上午11:57:17
 * Usage:
 * :
 */
package file;

import java.io.File;

public class DeleteDirectorysDemo {

    /**
     * 1. 编写代码 1+2+3...+100 求和.代码中不能出现 for while 关键字
     * 2. 1瓶汽水1块钱,三个瓶盖换一瓶,2个空瓶换一瓶. 20 块 得几瓶
     * Usage: 清空目录
     * 递归:自己调用自己
     */
    public static void main(String[] args) {
        File dir = new File("./1");
        delete(dir);
    }

    public static void delete(File file) {        // delete方法: 删除文件. 如果是目录,则清空目录之后删除.如果是文件,直接删除
        if (file.isDirectory()) {
            File[] subs = file.listFiles();
            for (int i = 0; i < subs.length; i++) {
                if (subs[i].isDirectory()) {
                    delete(subs[i]);
                }
                subs[i].delete();
            }
        }
        if (file.isFile()) {
            System.out.println("Deleting " + file.getName() + "..." + file.delete());
        }
    }
}


