package com.lgh.designpattern.adapterpattern;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        MediaAdapter mediaAdapter=new MediaAdapter(audioType);
        mediaAdapter.play(audioType,fileName);
    }
}
