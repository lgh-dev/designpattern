package com.lgh.designpattern.adapterpattern;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
