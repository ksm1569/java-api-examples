package com.smsoft.thisisjava.ch15collection.ex13queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExam {
    public static void main(String[] args) {
        Queue<Message> messageQueue = new LinkedList<>();

        messageQueue.offer(new Message("sendMail", "봉주희"));
        messageQueue.offer(new Message("sendSMS", "김수민"));
        messageQueue.offer(new Message("sendKakao", "봉수진"));

        while(!messageQueue.isEmpty()) {
            Message message = messageQueue.poll();
            switch (message.command) {
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS를 보냅니다");
                    break;
                case "sendKakao":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다");
                    break;
            }
        }

    }
}
