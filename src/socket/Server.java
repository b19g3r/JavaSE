package socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

/**
 * 聊天室服务端
 * @author adminitartor
 *
 */
public class Server {

    public static void main(String[] args) {
        Server server = new Server();
        server.start();
    }
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
    private PrintWriter[] allOut = new PrintWriter[0];

    public Server(){
        try {
            /*
             * 初始化服务端的ServerSocket的同时指定
             * 服务端口.若与系统其他应用程序冲突时则
             * 会抛出该端口被占用的异常.
             */
            System.out.println("正在初始化服务端...");
            server = new ServerSocket(8088);
            System.out.println("服务端初始化完毕!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void start(){
        try {
            /*
             * ServerSocket的accept方法是一个阻塞方法
             * 当程序执行到这个方法时就"卡住了",实际上
             * 是在监听申请的8088端口,直到一个客户端通过
             * 这个端口与服务端建立连接,一旦成功建立,
             * 该方法会自动创建一个Socket并将其返回.那么
             * 通过这个Socket就可以与刚刚连接的客户端进行
             * 交互了.
             */
            while(true){
                System.out.println("等待客户端连接...");
                Socket socket = server.accept();
                System.out.println("一个客户端连接了!");
                //创建线程处理该客户端交互
                ClientHandler handler
                        = new ClientHandler(socket);
                Thread t = new Thread(handler);
                t.start();
                System.out.println("已启动一个线程处理该客户端.");
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    /**
     * 该线程是用来与指定的客户端进行交互的
     * @author adminitartor
     *
     */
    private class ClientHandler implements Runnable{
        /*
         * 通过这个Socket与指定客户端交互
         */
        private Socket socket;
        //当前线程处理的客户端的地址信息
        private String host;


        public ClientHandler(Socket socket){
            this.socket = socket;
            //获取远端计算机地址信息
            InetAddress address= socket.getInetAddress();
            //获取客户端IP的字符串形式并赋值到属性中
            host = address.getHostAddress();
        }

        public void run(){
            PrintWriter pw = null;
            try {
                InputStream in = socket.getInputStream();
                BufferedReader br = new BufferedReader(
                        new InputStreamReader(
                                in,"UTF-8"
                        )
                );
                //创建输出流,用于给客户端发送消息
                pw = new PrintWriter(
                        new BufferedWriter(
                                new OutputStreamWriter(
                                        socket.getOutputStream(),"UTF-8"
                                )
                        ),true
                );
                /*
                 * 将输出流存入共享数组allOut中,以便其他的
                 * ClientHandler可以将他们对应的客户端发送过来的
                 * 消息通过这个输出流发送给当前ClientHandler对应
                 * 的客户端.
                 */
                synchronized (allOut) {
                    allOut = Arrays.copyOf(allOut, allOut.length+1);
                    allOut[allOut.length-1] = pw;
                    System.out.println("一个客户端上线了,当前在线人数为:"+allOut.length);
                }



                String line = null;
                /*
                 * 当客户端断开连接时,由于客户端的系统不同
                 * 这里的效果不一样
                 * windows断开时,通常这里readLine方法会抛出
                 * 异常
                 * linux断开时,通常readLine方法会返回null
                 *
                 */
                while((line = br.readLine())!=null){
                    System.out.println(host+"说:"+line);
                    synchronized (allOut) {
                        //将消息发送给所有客户端
                        for(int i=0;i<allOut.length;i++){
                            allOut[i].println(host+"说:"+line);
                        }
                    }

                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally{
                //处理客户端断开连接的操作
                /*
                 * 1 将当前CH对应的客户端的输出流从
                 *  allOut数组中删除,这样其他CH就不会
                 *  将他们的客户端发送过来的消息在转发
                 *  给当前客户端了
                 */
                synchronized (allOut) {
                    for(int i=0;i<allOut.length;i++){
                        if(allOut[i]==pw){
                            //将最后元素放入这个位置
                            allOut[i] = allOut[allOut.length-1];
                            allOut = Arrays.copyOf(allOut, allOut.length-1);
                            break;
                        }
                    }
                    System.out.println("一个客户端下线了,当前在线人数为:"+allOut.length);
                }
            }
        }
    }

}











