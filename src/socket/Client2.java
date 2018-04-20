package socket;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @PackageName: socket
 * @ClassName: Client2
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/10 17:45
 **/

public class Client2 {
    private Socket socket;

    /**
     * 构造方法,创建套节字
     */

    public Client2() {
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

    public static void main(String[] args) {
        Client2 c2 = new Client2();
        c2.start();

    }
}
