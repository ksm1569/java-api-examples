package com.smsoft.gof_designpattern.structural.adapter._01_before;

// vlc, mp4 파일도 읽을 수 있는 인터페이스
public interface AdvancedMediaPlayer {
    void playVlc(String fileName);
    void playMp4(String fileName);
}
