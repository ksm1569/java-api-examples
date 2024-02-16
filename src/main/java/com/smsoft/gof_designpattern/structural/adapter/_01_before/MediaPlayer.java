package com.smsoft.gof_designpattern.structural.adapter._01_before;

// 기존 mp3 파일만 재생가능한 player의 인터페이스
public interface MediaPlayer {
    void play(String audioType, String fileName);
}
