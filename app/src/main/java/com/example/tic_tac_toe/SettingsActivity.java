package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SettingsActivity extends AppCompatActivity {

    private MediaPlayer knop;
    private Button btn1,btn2,btn3,btn4;
    private int zvuk1 = 0, muz = 0,muzz = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        knop = MediaPlayer.create(this, R.raw.knopka);
        onButton();
    }

    private void onButton() {
        btn1 = (Button) findViewById(R.id.button8);
        btn2 = (Button) findViewById(R.id.button9);
        btn3 = (Button) findViewById(R.id.button11);
        btn4 = (Button) findViewById(R.id.button10);
        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(zvuk1 == 0) {
                            zvuk1 = zvuk.zv(0);
                            SoundPlay(knop);
                            btn1.setText("Звук кнопки: выкл");
                        }
                        else{
                            zvuk1 = zvuk.zv(0);
                            btn1.setText("Звук кнопки: вкл");
                        }
                    }
                }
        );
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(zvuk1 == 0)
                            SoundPlay(knop);
                        if(muz == 0) {
                            muz = 1;
                            btn2.setText("Музыка: выкл");
                        }
                        else{
                            muz = 0;
                            btn2.setText("Музыка: вкл");
                        }
                    }
                }
        );
        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(zvuk1 == 0)
                            SoundPlay(knop);
                        if(muzz == 0) {
                            muzz = 1;
                            btn3.setText("Звук в игре: выкл");
                        }
                        else{
                            muzz = 0;
                            btn3.setText("Звук в игре: вкл");
                        }
                    }
                }
        );
        btn4.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(zvuk1 == 0)
                            SoundPlay(knop);
                        finish();
                    }
                }
        );

    }

    public void SoundPlay(MediaPlayer sound){
        sound.start();
    }
}