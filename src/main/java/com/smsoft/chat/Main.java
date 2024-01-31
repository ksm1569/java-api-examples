package com.smsoft.chat;

public class Main {
    public static void main(String[] args) {
        // 현재는 스레드로 만듬 -> 스레드를 사용하지 않을 경우, main을 두개 만들어야한다.
        // 두 방식 전부 올바르다 -> 원하는 것 하면 됨

        // 아래는 클래스 두개 만드는방식
//         예) 1. MainServer라는 클래스 만들고, 아래와 같이 작성
//        public class MainServer {
//
//            public static void main(String[] args) {
//                // 서버 실행
//                ChattingServer server = new ChattingServer();
//                server.chattingServer();
//            }
//        }
        // 2. MainClient라는 클래스 만들고, 아래와 같이 작성
//        public class MainClient {
//
//            public static void main(String[] args) {
//                // 클라이언트 실행
//                ChattingClient client = new ChattingClient();
//                client.chattingClient();
//            }
//        }

        // 스레드방식
        // 서버 시작
        ChattingServer server = new ChattingServer();
        new Thread(new Runnable() {
            @Override
            public void run() {
                server.chattingServer();
            }
        }).start();

        // 클라이언트 시작
        ChattingClient client = new ChattingClient();
        client.chattingClient();
    }
}
