package com.example.silenceinterruptedbysounds.model;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;

import static javax.sound.sampled.AudioSystem.getAudioInputStream;
import static javax.sound.sampled.AudioFormat.Encoding.PCM_SIGNED;

public class SoundsModel {
    private String dir;
    private Integer volumeLevel = 0;

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setVolumeLevel(Integer val) {
        volumeLevel = val;
    }
}
