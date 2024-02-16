package com.smsoft.gof_designpattern.structural.adapter._02_after;

// 기존 mp3 파일만 재생가능한 player의 구현체 - 타겟 구현체
public class AudioPlayer implements MediaPlayer {
    private MediaPlayerAdapter mediaPlayerAdapter;
    public void setMediaPlayerAdapter(MediaPlayerAdapter mediaPlayerAdapter) {
        this.mediaPlayerAdapter = mediaPlayerAdapter;
    }
    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaPlayerAdapter.play(audioType, fileName);
        } else {
            System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
