package com.smsoft.thisisjava.ch7inheritance.ex01classInherit;

public class SmartPhoneExam {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("아이폰", "로즈골드");

        // phone한테 상속받은 필드
        System.out.println("모델: " + myPhone.model);
        System.out.println("색상: " + myPhone.color);

        // smartphone 필드
        System.out.println("와이파이 상태: " + myPhone.wifi);

        // phone한테 상속받은 메소드
        myPhone.bell();
        myPhone.sendVoice("여보세요?");
        myPhone.receiveVoice("네 반갑습니다");
        myPhone.sendVoice("아 네 반갑습니다~");
        myPhone.hangUp();
        
        // smartphone 메소드 호출
        myPhone.setWifi(true);
        myPhone.internet();
    }
}
