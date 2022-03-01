package com.example.tic_tac_toe;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4;
    private MediaPlayer knop;
    private int zvuk_m = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        knop = MediaPlayer.create(this, R.raw.knopka);
        Intent intent = getIntent();
        //String zvuk = intent.getStringExtra("zvuk");
        //int i = Integer.valueOf(zvuk);
        zvuk game;
        game = new zvuk();
        zvuk_m = zvuk.zv(1);
        onButton();

    }

    private void onButton() {
        Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
// Vibrate for 500 milliseconds

        btn1 = (Button) findViewById(R.id.button);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);

        btn1.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(zvuk_m == 0)
                            SoundPlay(knop);
                        Intent intent = new Intent(MainActivity.this, twotwo.class);
                        startActivity(intent);
                    }
                }
        );
        btn2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(zvuk_m == 0)
                            SoundPlay(knop);
                        Intent intent = new Intent(MainActivity.this, ViborActivity.class);
                        startActivity(intent);
                    }
                }
        );
        btn3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if(zvuk_m == 0)
                            SoundPlay(knop);
                        Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                        startActivity(intent);
                    }
                }
        );
        btn4.setOnClickListener(
                new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        if(zvuk_m == 0)
                            SoundPlay(knop);
                        AlertDialog.Builder a1_builder = new AlertDialog.Builder(MainActivity.this);
                        a1_builder.setMessage("Вы хотите закрыть приложение?").setCancelable(false).setPositiveButton("Да", new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                finish();
                            }
                        }).setNegativeButton("Нет",new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                        AlertDialog al_builder = a1_builder.create();
                        al_builder.setTitle("Закрыть приложение");
                        al_builder.show();
                    }
                }
        );
    }

    public void SoundPlay(MediaPlayer sound){
        sound.start();
    }
}

