package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ViborActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3;
    private MediaPlayer knop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vibor);
        knop = MediaPlayer.create(this, R.raw.knopka);
        onButton();
    }

    private void onButton() {
        btn1 = (Button) findViewById(R.id.button5);
        btn2 = (Button) findViewById(R.id.button6);
        btn3 = (Button) findViewById(R.id.button7);

        btn1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SoundPlay(knop);
                        Intent intent = new Intent(ViborActivity.this, EasilyActivity.class);
                        startActivity(intent);
                    }
                }
        );
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SoundPlay(knop);
                        Intent intent = new Intent(ViborActivity.this, AverageActivity.class);
                        startActivity(intent);
                    }
                }
        );
        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        SoundPlay(knop);
                        Intent intent = new Intent(ViborActivity.this, HardActivity.class);
                        startActivity(intent);
                    }
                }
        );
    }
    public void SoundPlay(MediaPlayer sound){
        sound.start();
    }
}