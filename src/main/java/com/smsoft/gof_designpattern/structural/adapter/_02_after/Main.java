package com.smsoft.gof_designpattern.structural.adapter._02_after;

// Client 코드
public class Main {
    public static void main(String[] args) {
        // AudioPlayer 인스턴스 생성
        AudioPlayer audioPlayer = new AudioPlayer();

        // .mp3 파일 재생
        audioPlayer.play("mp3", "beyond the horizon.mp3");

        // .mp4 파일 재생을 위한 MediaPlayerAdapter 설정
        MediaPlayerAdapter mp4Adapter = new MediaPlayerAdapter(new Mp4Player());
        audioPlayer.setMediaPlayerAdapter(mp4Adapter);
        audioPlayer.play("mp4", "alone.mp4");

        // .vlc 파일 재생을 위한 MediaPlayerAdapter 설정
        MediaPlayerAdapter vlcAdapter = new MediaPlayerAdapter(new VlcPlayer());
        audioPlayer.setMediaPlayerAdapter(vlcAdapter);
        audioPlayer.play("vlc", "far far away.vlc");

        System.out.println();
        audioPlayer.play("avi", "mind me.avi");
    }
}
