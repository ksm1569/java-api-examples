package com.smsoft.gof_designpattern.structural.adapter._02_after;

// vlc 파일도 읽을 수 있는 구현체 - 어댑티(adaptee) 구현체
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        throw new UnsupportedOperationException("Unsupported operation: playMp4");
    }
}
