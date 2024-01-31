package com.smsoft.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class ChattingClient {

    public void chattingClient() {
        String serverIp = "127.0.0.1";
        int serverPort = 8888; // 문제점1 - 서버와 포트 번호를 불일치 -> 일치시킴
        Socket socket = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;

        try {
            socket = new Socket(serverIp, serverPort);
            dis = new DataInputStream(socket.getInputStream());
            dos = new DataOutputStream(socket.getOutputStream());

            String serverMsg = dis.readUTF();
            System.out.println(serverMsg);

            Scanner sc = new Scanner(System.in);    // 문제점2 - 선언 안되어있었음
            System.out.print("입력 > ");
            String sendMsg = sc.nextLine();
            dos.writeUTF(sendMsg);

            serverMsg = dis.readUTF();
            System.out.println("서버 > " + serverMsg);
            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null) dis.close();
                if (dos != null) dos.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}


