package com.wl.soundsystem;

import org.springframework.stereotype.Component;

/**
 * Created by wangl on 2018/10/30 15:25
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
