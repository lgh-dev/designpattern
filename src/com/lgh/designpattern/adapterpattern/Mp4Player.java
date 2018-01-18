package com.lgh.designpattern.adapterpattern;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class Mp4Player implements AdvanceMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
