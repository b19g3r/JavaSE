package homework.T03SE.day02;


import java.io.File;

/**
 * 要求用户输入一个文件或目录名，并删除当前目录下的该文件或目录。
 * 可自行手动先在当前项目目录中创建一个要删除的文件或目录，若是目录，还可以
 * 在该目录中继续创建若干级目录和文件。
 *
 * @author ElaineSui
 */
public class Test05 {
    private static int num = 0;

    public static void main(String[] args) {
        // 1. 递归创建文件目录,在目录下创建 1.2.3.4.5.6.7.8.9
        File file = new File("./Test");
        creat(file);
//        StringBuilder s = new StringBuilder();
//        s.append(file.getName());
//        for (int i = 0; i < 10; i++) {
//            file = new File(file.getName()+"/"+String.valueOf(s));
//            System.out.println("Creating ... "+file.getName()+" "+file.mkdirs());
//            s.append(String.valueOf(i));
//        }

    }
    // delete方法: 删除文件. 如果是目录,则清空目录之后删除.如果是文件,直接删除
    private static void delete(File file){
        if (file.isDirectory()) {
            File[] subs = file.listFiles();
            for (int i = 0; i < subs.length; i++) {
                if (subs[i].isDirectory()){
                    delete(subs[i]);
                }
                subs[i].delete();
            }
        } else if ( file.isFile()){
            System.out.println("Deleting "+file.getName()+" "+file.delete());
        }
    }

    // creat 方法: 创建文件及目录
    private static void creat(File dir){
//        if (dir.isDirectory()) {
            if(num<10) {
                File newDir = new File("./"+dir.getName());
                num++;
                creat(newDir);
            } else {
                dir.mkdir();
                System.out.println(dir.getName()+" is been created.");
            }
  /*      } else {
            System.out.println(dir.getName()+"is not a dir.");
            return;
        }
*/
    }


}