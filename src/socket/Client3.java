package socket;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * @PackageName: socket
 * @ClassName: Client2
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/10 17:45
 **/

public class Client3 {
    private Socket socket;

    /**
     * 构造方法,创建套节字
     */

    public Client3() {
        try {
            System.out.println("Connecting the server ... ");
            socket = new Socket("172.176.1.103", 8088);
            System.out.println("Server connected.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 启动连接
     */
    public void start() {
        try {
            //启动用于读取服务端消息的线程
            ServerHandle serverHandle = new ServerHandle();
            Thread t = new Thread(serverHandle);
            t.start();



            // 启动输入消息的线程
            PrintWriter pw = new PrintWriter(
                    new BufferedWriter(
                            new OutputStreamWriter(
                                    socket.getOutputStream(), "UTF-8"
                            )
                    ), true
            );
            while (true) {
                pw.println(new Scanner(System.in).nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 结束连接
      */
    public void terminate() {

    }

    /**
     * 该线程负责循环接收服务端的消息
     *
     * 给服务端发送消息 和 接收消息 要放在不同的线程运行,才能做到互不干扰
     */
    private class ServerHandle implements Runnable {

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                socket.getInputStream(),"UTF-8"
                        )
                );

                String message = null;
                while ((message = br.readLine()) != null ){
                    System.out.println(message);
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Client3 c2 = new Client3();
        c2.start();

    }
}
