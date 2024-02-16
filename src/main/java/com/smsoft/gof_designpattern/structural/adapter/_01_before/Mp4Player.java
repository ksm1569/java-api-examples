package com.smsoft.gof_designpattern.structural.adapter._01_before;

// mp4 파일도 읽을 수 있는 구현체
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        throw new UnsupportedOperationException("Unsupported operation: playVlc");
    }
    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file: " + fileName);
    }
}
