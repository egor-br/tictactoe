package com.example.tic_tac_toe;

import android.media.SoundPool;

public class SoundFM
{
    int sound;
    SoundPool soundPool;
    public SoundFM(int sound, SoundPool soundPool){
        this.sound = sound;
        this.soundPool = soundPool;
    }
    public void play(float volume){
        soundPool.play(sound, volume, volume, 0, 0,1);
    }
    public  void displece(){
        soundPool.unload(sound);
    }
}
