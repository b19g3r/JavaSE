package socketPractice;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * @PackageName: socketPractice
 * @ClassName: Server
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/13 18:07
 **/

public class Server {
    private ServerSocket server = null;
    // 存放客户端的输入流
    private PrintWriter[] allOut = new PrintWriter[0];

    /**
     * 初始化服务端的ServerSocket的同时指定
     * 服务端口.若与系统其他应用程序冲突时则
     * 会抛出该端口被占用的异常
     */
    public Server() {
        try {
            System.out.println("Init Server...");
            server = new ServerSocket(8088);
            System.out.println("Inited");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void start() {
        try {
            while (true) {
                System.out.println("Waiting for a connecting");
                Socket socket = server.accept();
                System.out.println("One client has connected");

                // 创建线程处理给客户端交互
                Clienthandler cl = new Clienthandler(socket);
                Thread t = new Thread(cl);
                t.start();
                System.out.println("A thread has Started.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    class Clienthandler implements Runnable {
        Socket socket;
        private String clientName;

        public Clienthandler(Socket socket) {
            this.socket = socket;
            // 获取远端计算机地址
            InetAddress address = socket.getInetAddress();
            // 获取客户端 IP 的字符串形式并赋值到属性中
            clientName = address.getHostAddress();
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

                // 创建输出流
                pw = new PrintWriter(
                        new BufferedWriter(
                                new BufferedWriter(
                                        new OutputStreamWriter(
                                                socket.getOutputStream(), "UTF-8"
                                        )
                                )
                        ), true
                );
                // 扩容数组
                synchronized (allOut) {
                    allOut = Arrays.copyOf(allOut, allOut.length + 1);
                    // 将输出流存入数组
                    allOut[allOut.length - 1] = pw;
                    System.out.println("一个客户端上线了,当前在线人数:" + allOut.length);
                }
                // 输出并转发消息
                String message = null;
                while ((message = br.readLine()) != null) {
                    // 输出到终端
                    System.out.println(clientName + " says: " + message);
                    // 转发到所有客户机
                    synchronized (allOut) {
                        for (int i = 0; i < allOut.length; i++) {
                            allOut[i].println(message);
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
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
        Server server = new Server();
        server.start();
    }

}
