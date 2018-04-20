package socketPractice;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @PackageName: socketPractice
 * @ClassName: Clienthandler
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/13 18:17
 **/

public class Clienthandler implements Runnable {
    Socket socket;
    private String host;

    public Clienthandler(Socket socket) {
        this.socket = socket;
        // 获取远端计算机地址
        InetAddress address = socket.getInetAddress();
        // 获取客户端 IP 的字符串形式并赋值到属性中
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

            //









        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
