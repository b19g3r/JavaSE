package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @PackageName: socket
 * @ClassName: Server2
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/10 19:47
 **/

public class Server2 {
    private ServerSocket server;

    public Server2() {
        try {
            server = new ServerSocket(8088);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void start() {
        try {
            System.out.println("Conecting .... ");
            Socket socket = server.accept();
            System.out.println("Connected.");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(
                            socket.getInputStream(), "UTF-8"
                    )
            );
            /**
             * 客户端在断开连接时不同系统有不同的反应
             * linxu 客户端断开后，br.readLine() 犯返回 null
             * windows 客户端断开连接，brreadLine() 抛出异常
             */
            String message = null;
            while ((message = br.readLine()) != null ) {
                System.out.println("Hosts says: " + message);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        Server s = new Server();
        s.start();
    }
}
