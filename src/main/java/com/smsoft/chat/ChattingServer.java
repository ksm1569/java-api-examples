package com.smsoft.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingServer {

    public void chattingServer() {
        int port = 8888; // 문제점1 - 클라이언트와 포트 번호를 불일치 -> 일치시킴
        ServerSocket serverSocket = null;
        DataInputStream dis = null;
        DataOutputStream dos = null;

        try {
            serverSocket = new ServerSocket(port);
            Socket clientSocket = serverSocket.accept();

            dis = new DataInputStream(clientSocket.getInputStream());
            dos = new DataOutputStream(clientSocket.getOutputStream());

            dos.writeUTF("[서버 연결 성공]");
            String clientMsg = dis.readUTF();
            dos.writeUTF(clientMsg); // 클라이언트에게 받은 메시지를 다시 전송

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dis != null) dis.close();
                if (dos != null) dos.close();
                if (serverSocket != null) serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}