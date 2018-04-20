package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @PackageName: io
 * @ClassName: InDemo
 * @Description:
 * @Author: Shane
 * @Date: 2018/4/9 15:25
 **/

public class InDemo {
    public static void main(String[] args) throws IOException {
        // 按行读取文件内容
        System.out.println("请输入文件内容: ");

        BufferedReader br = new BufferedReader(
                new InputStreamReader(
                        System.in
                )
        );

        String line = null;
        while (true) {
            line = br.readLine();
            if ("exit".equals(line)) {
                break;
            }
            System.out.println(line);
        }
    }
}
