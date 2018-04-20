package socket;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * @PackageName: socket
 * @ClassName: Server2
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/10 19:47
 **/

public class Server3 {
    /*
     * 运行在服务端的java.net.ServerSocket
     * 主要作用有两个:
     * 1:向系统申请服务端口,客户端就是通过这个端口与服务端
     *   建立连接的.
     * 2:监听该服务端口,一旦一个客户端连接,ServerSocket
     *   就会自动创建一个Socket,通过这个Socket就可以与
     *   刚刚连接的客户端交互了.
     */
    private ServerSocket server;
    /*
     * ClientHandler是Server的内部类,所以所有的CH实例
     * 都可以看到Server的这个属性allOut.那么他们就可以
     * 将各自对应的客户端的输出流都存入这个数组中,以便
     * 某个CH可以将其对应的客户端发送过来的内容转发给其他
     * 客户端.
     */

    // 存放所有客户端的输入流
    private PrintWriter[] allOut = new PrintWriter[0];

    // static int i = 1;

    public Server3() {
        try {
            /*
             * 初始化服务端的ServerSocket的同时指定
             * 服务端口.若与系统其他应用程序冲突时则
             * 会抛出该端口被占用的异常.
             */
            System.out.println("正在初始化服务端");
            server = new ServerSocket(8088);
            System.out.println("初始化完毕");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            while (true) {
                System.out.println("Waiting for Conecting .... ");
                Socket socket = server.accept();
                System.out.println("One host Connected. ");
                //创建线程处理该客户端交互
                ClientHandler handler = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
                System.out.println("已经启动一个线程");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 内部类
     * 该线程任务负责与指定 Socket 所对应的客户端进行交互
     */
    private class ClientHandler implements Runnable {
        // 通过这个Socket与指定客户端交互
        Socket socket;
        //当前线程处理的客户端的地址信息
        private String host;

        public ClientHandler(Socket socket) {
            this.socket = socket;
            //获取远端计算机地址信息
            InetAddress address = socket.getInetAddress();
            //获取客户端IP的字符串形式并赋值到属性中
            host = address.getHostAddress();
        }

        @Override
        public void run() {
            PrintWriter pw = null;
            try {
                // 创建输入流
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(), "UTF-8"
                        )
                );

                // 创建输出流 给客户端发送信息
                pw = new PrintWriter(
                        new BufferedWriter(
                                new OutputStreamWriter(
                                        socket.getOutputStream(), "UTF-8"
                                )
                        ), true
                );

                // 将当前客户对应的输入流存入共享数组
                /*
                 * 将输出流存入共享数组allOut中,以便其他的
                 * ClientHandler可以将他们对应的客户端发送过来的
                 * 消息通过这个输出流发送给当前ClientHandler对应
                 * 的客户端.
                 */
                // 扩容数组
                synchronized (allOut) {
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    // 将输出流存入数组
                    allOut[allOut.length - 1] = pw;
                    System.out.println("一个客户端上线了,当前在线人数:" + allOut.length);
                }

                /**
                 * 客户端在断开连接时不同系统有不同的反应
                 * linxu 客户端断开后，br.readLine() 犯返回 null
                 * windows 客户端断开连接，brreadLine() 抛出异常
                 */
                String message = null;
                while ((message = br.readLine()) != null) {
                    // 输出客户端消息
                    System.out.println("Host" + ":" + message);
                    //将消息发送给所有客户端
                    synchronized (allOut) {
                        for (int i = 0; i < allOut.length; i++) {
                            allOut[i].println(host + "说:" + message);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                // 处理客户端断开连接
                // 1.将客户端的输入流共享数组中删除
                // 这样其他CH就不会
                // 将他们的客户端发送过来的消息在转发
                // 给当前客户端了
                synchronized (allOut) {
                    for (int i = 0; i < allOut.length; i++) {
                        if (allOut[i] == pw) {
                            // 将最后一个元素放入这个位置,然后数组缩容
                            allOut[i] = allOut[allOut.length - 1];
                            allOut = Arrays.copyOf(allOut, allOut.length - 1);
                            break;
                        }
                    }
                    System.out.println("一个客户端下线了,当前在线人数为:"+allOut.length);
                    // 2.客户端断开后,服务端关闭该客户端socket,释放资源
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }


        }
    }

    public static void main(String[] args) {
        Server3 s3 = new Server3();
        s3.start();
    }
}
