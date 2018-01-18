package com.lgh.designpattern.adapterpattern;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class AdapterPatternDemo {

    public static void main(String[] args) {

        AudioPlayer audioPlayer=new AudioPlayer();
        audioPlayer.play("vlc","xxx.vlc");
        audioPlayer.play("vlc","xxx.vlc");

    }
}
