package com.smsoft.gof_designpattern.structural.adapter._02_after;

// vlc, mp4 파일도 읽을 수 있는 인터페이스 - 어댑티(adaptee) 인터페이스
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
