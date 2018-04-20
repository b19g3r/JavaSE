package homework;

import java.io.*;
import java.sql.SQLOutput;

/**
 * @PackageName: homework
 * @ClassName: StreamPractice
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/9 18:40
 **/

public class StreamPractice {
/*    private final String FOS = "fos.txt";
    private final String FIS = "fos.txt";
    private final String BOS = "bos.txt";*/

    public static void main(String[] args) throws IOException {

        fInpStream();
        fOpStream();
        bufferInpStream();
        bufferOpStream();
        printWriter();
        bufferReader();









    }

    private static void printWriter() throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter pw = new PrintWriter("pw.txt","UTF-8");
        pw.println("PW 写入一行 , 等待读取 ... ");
        System.out.println("done");
        pw.close();
    }

    private static void bufferReader() throws IOException {
        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("pw.txt")
                )
        );
        String line = null;
        while ((line=br.readLine())!=null) {
            System.out.println(line);
        }

        // TODO br.close();
    }

    private static void bufferInpStream() throws IOException {
        FileInputStream fis = new FileInputStream("bos.txt");
        // 将缓冲流连接在文件流上,提高读文件效率
        BufferedInputStream bis = new BufferedInputStream(fis);
        byte[] readData = new byte[100];
        while (bis.read(readData) != -1) {
            // TODO bis.read() 和 bis.read(byte[] data) 方法差别不大 ?
            System.out.print(new String(readData,0,readData.length,"UTF-8"));
        }
        System.out.println("done");
        bis.close();
    }

    private static void bufferOpStream() throws IOException {
        FileOutputStream fos = new FileOutputStream("bos.txt");
        // 将缓冲流连接在文件流上,提高写文件效率
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        String str = "BufferedOutputStream 写入到文件";
        bos.write(str.getBytes());
        System.out.println(str+"done");
        // 缓冲流 close 时会flush
        bos.close();
    }

    private static void fOpStream() throws IOException {

        // FileOutputStream 两种模式,追加 和 覆盖 写入到文件
        FileOutputStream fos1 = new FileOutputStream("fos.txt");
        String data = "FileOutputStream 写入到文件 Overwrite";
        fos1.write(data.getBytes("UTF-8"));
        System.out.println(data + "done");
        // TODO 需不需要 flush() ???
        /**
         * (FileOutputStream)public void flush()
         * 刷新此输出流，并强制将所有已缓冲的输出字节写入该流中。
         * FilterOutputStream 的 flush 方法调用其基础输出流(OutputStream)的 flush 方法。
         *
         * (OutputStream)
         * 刷新此输出流并强制写出所有缓冲的输出字节。
         * Todo OutputStream 的 flush 方法不执行任何操作。
         */
        fos1.flush();
        // 关闭此文件输出流并释放与此流有关的所有系统资源。此文件输出流不能再用于写入字节。
        fos1.close();
        FileOutputStream fos2 = new FileOutputStream("fos.txt", true);
        data = "FileOutputStream 写入到文件 Append";
        fos2.write(data.getBytes("UTF-8"));
        System.out.println(data + "done");
        // TODO 需不需要 flush() ???
        fos2.close();
    }

    private static void fInpStream() throws IOException {
        // FileInputStream  读取文件数据
        FileInputStream fis = new FileInputStream("fos.txt");
        byte[] readData = new byte[100];
        while (fis.read(readData) != -1) {
            System.out.println(new String(readData, 0,
                    readData.length,"UTF-8"));
        }
        System.out.println("done");
        fis.close();
    }

}
