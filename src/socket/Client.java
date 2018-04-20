package socket;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * 聊天室客户端
 * @author adminitartor
 *
 */
public class Client {
    /*
     * java.net.Socket 套接字
     * Socket封装了TCP协议,使用它可以基于两条流完成
     * 网络间通讯.
     */
    private Socket socket;
    /**
     * 构造方法,用来初始化客户端
     */
    public Client(){
        try {
            /*
             * 实例化Socket是要传入两个参数
             * 1:服务端的IP地址信息
             * 2:服务端的端口号
             * 实例化Socket的过程就是连接服务端的过程
             * 若成功连接上服务端那么实例化完成,否则会
             * 抛出网络异常.
             * 这里通过IP地址找到对方的计算机,通过端口
             * 找到运行在对方计算机上的应用程序.
             * 对于客户端而言,对方应当就是服务端了.
             */
            System.out.println("正在连接服务端...");
            socket = new Socket("127.0.0.1",8088);
            System.out.println("服务端已连接!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    /**
     * 客户端开始工作的方法
     */
    public void start(){
        try {
            OutputStream out = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    out,"UTF-8"
                            )
                    ),true
            );


            Scanner scanner = new Scanner(System.in);
            while(true){
                String line = scanner.nextLine();
                pw.println(line);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Client client = new Client();
        client.start();
    }
}



//package socket;
//
//import java.io.*;
//import java.net.Socket;
//import java.util.Scanner;
//
///**
// * @PackageName: exception
// * @ClassName: Client
// * @Description:
// * @Author: Shane
// * @Date: 2018/4/10 15:19
// **/
//
//public class Client {
//    /**
//     * java.net.Socket
//     * 套接字,封装了 TCp协议.Socket 提供了两条流
//     * 用来与服务端进行双向通讯
//     */
//    private static Socket socket;
//
//    // 构造方法 初始化客户端
//    public Client() {
//        try {
//            /**
//             * Socket(InetAddress address, int port)  创建一个流套接字并将其连接到指定 IP地址的指定端口号
//             *
//             *
//             * 实例化Socket是要传入两个参数
//             * 1:服务端的IP地址信息
//             * 2:服务端的端口号
//             *
//             * 实例化Socket的过程就是连接服务端的过程
//             * 若成功连接上服务端那么实例化完成,否则会
//             * 抛出网络异常.
//             * 这里通过IP地址找到对方的计算机,通过端口
//             * 找到运行在对方计算机上的应用程序.
//             * 对于客户端而言,对方应当就是服务端了.
//             */
//            System.out.println("正在连接服务端...");
//            socket = new Socket("10.30.100.87", 8088);
//            System.out.println("服务端已连接!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    // 客户端开始工作的方法
//    public static void start() {
//        /**
//         * Socket 提供方法:
//         * OutputStream getOutPutStream()
//         * 通过返回的字节输入流写出的数据会发送给远程计算机，
//         * 对于客户端这边而言远端计算机就是服务端
//         */
//        try {
//            OutputStream out = null;
//            out = socket.getOutputStream();
//            PrintWriter pw = new PrintWriter(
//                    new BufferedWriter(
//                            new OutputStreamWriter(out)
//                    ), true
//            );
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static void main(String[] args) {
//        Client client = new Client();
//        Client.start();
//    }
//}
