package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

import java.util.Random;

public class HardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new DrawView3(this));
    }
}
class DrawView3 extends View {
    Paint paint = new Paint();
    public DrawView3(Context context) {
        super(context);
    }
    static Game3 game = new Game3();
    public void DrawPic1(Canvas canvas, int x , int y){
        Bitmap bitmap;
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.p1);
        canvas.drawBitmap(bitmap, x, y, paint);
    }
    public void DrawPic2(Canvas canvas, int x , int y){
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.p2);
        canvas.drawBitmap(bitmap, x, y, paint);
    }
    public void DrawPic3(Canvas canvas, int x , int y){
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.win1);
        canvas.drawBitmap(bitmap, x, y, paint);
    }
    public boolean onTouchEvent(MotionEvent event) {
        float X = event.getX();
        float Y = event.getY();

        if(game.getPlayer() == 2 && game.chek() == 0){
            int x = -1, y = -1;
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException ex)
            {
                Thread.currentThread().interrupt();
            }
            if (game.chek() == 0) {
                int n = 0;
                for(int k = 0; k < 3; k++){
                    for(int kk = 0; kk < 3; kk++){
                        if(game.get(k,kk) != 0)
                            n++;
                    }
                }
                if(n==0 && game.get(1,1) == 0){
                    x = 1;
                    y = 1;
                }
                if(n == 1){
                    if(game.get(1,1) == 0){
                        x = 1;y = 1;
                    }
                    else{
                        while (true) {
                            Random rdn = new Random();
                            x = rdn.nextInt(3);
                            y = rdn.nextInt(3);
                            if (x != -1 && y != -1 && game.get(x, y) == 0)
                                break;
                        }
                    }
                }
                else{
                    if(n != 0){
                        int prow = 0;
                        if(game.get(0,1) == 0 && game.get(0,0) == 2 && game.get(0,0) == game.get(0,2)) {
                            x = 0;
                            y = 1;

                        }else
                        if(game.get(0,2) == 0 && game.get(0,0) == 2 && game.get(0,0) == game.get(0,1)){
                            x = 0;
                            y = 2;

                        }else
                        if(game.get(0,0) == 0 && game.get(0,1) == 2 && game.get(0,1) == game.get(0,2)){
                            x = 0;
                            y = 0;

                        }else
                        if(game.get(2,0) == 0 && game.get(0,0) == 2 && game.get(0,0) == game.get(1,0)){
                            x = 2;
                            y = 0;

                        }else
                        if(game.get(1,0) == 0 && game.get(0,0) == 2 && game.get(0,0) == game.get(2,0)){
                            x = 1;
                            y = 0;

                        }else
                        if(game.get(0,0) == 0 && game.get(2,0) == 2 && game.get(2,0) == game.get(1,0)){
                            x = 0;
                            y = 0;

                        }else
                        if(game.get(1,2) == 0 && game.get(1,1) == 2 && game.get(1,0) == game.get(1,1)){
                            x = 1;
                            y = 2;

                        }else
                        if(game.get(1,0) == 0 && game.get(1,1) == 2 && game.get(1,1) == game.get(1,2)){
                            x = 1;
                            y = 0;

                        }else
                        if(game.get(1,1) == 0 && game.get(1,0) == 2 && game.get(1,2) == game.get(1,0)){
                            x = 1;
                            y = 1;

                        }else
                        if(game.get(2,2) == 0 && game.get(2,1) == 2 && game.get(2,0) == game.get(2,1)){
                            x = 2;
                            y = 2;

                        }else
                        if(game.get(2,0) == 0 && game.get(2,1) == 2 && game.get(2,1) == game.get(2,2)){
                            x = 2;
                            y = 0;

                        }else
                        if(game.get(2,1) == 0 && game.get(2,0) == 2 && game.get(2,2) == game.get(2,0)){
                            x = 2;
                            y = 1;

                        }else
                        if(game.get(2,1) == 0 && game.get(0,1) == 2 && game.get(0,1) == game.get(1,1)){
                            x = 2;
                            y = 1;

                        }else
                        if(game.get(1,1) == 2 && game.get(1,1) == game.get(2,1) && game.get(0,1) == 0){
                            x = 0;
                            y = 1;

                        }else
                        if(game.get(0,2) == 2 && game.get(1,2) == game.get(0,2) && game.get(2, 2) == 0) {
                            x = 2;
                            y = 2;

                        }else
                        if(game.get(0, 2) == 0 && game.get(2,2) == 2 && game.get(1,2) == game.get(2,2)) {
                            x = 0;
                            y = 2;

                        }else
                        if(game.get(0,0) == 2 && game.get(0,0) == game.get(1,1) && game.get(2, 2) == 0) {
                            x = 2;
                            y = 2;

                        }else
                        if(game.get(1,1) == 2 && game.get(1,1) == game.get(2,2) && game.get(0, 0) == 0) {
                            x = 0;
                            y = 0;

                        }else
                        if(game.get(2,0) == 2 && game.get(2,0) == game.get(1,1) && game.get(0, 2) == 0) {
                            x = 0;
                            y = 2;

                        }else
                        if(game.get(0,2) == 2 && game.get(0,2) == game.get(1,1) && game.get(2, 0) == 0) {
                            x = 2;
                            y = 0;
                        }else
                        if(game.get(0,2) == 2 && game.get(0,2) == game.get(2,0) && game.get(1, 1) == 0) {
                            x = 1;
                            y = 1;
                        }else
                        if(game.get(0,0) == 2 && game.get(0,0) == game.get(2,2) && game.get(1, 1) == 0) {
                            x = 1;
                            y = 1;
                        }else
                            //предотвращение выиграша соперника
                            if(game.get(0,1) == 0 && game.get(0,0) == 1 && game.get(0,0) == game.get(0,2)) {
                                x = 0;
                                y = 1;

                            }else
                            if(game.get(0,2) == 0 && game.get(0,0) == 1 && game.get(0,0) == game.get(0,1)){
                                x = 0;
                                y = 2;

                            }else
                            if(game.get(0,0) == 0 && game.get(0,1) == 1 && game.get(0,1) == game.get(0,2)){
                                x = 0;
                                y = 0;

                            }else
                            if(game.get(2,0) == 0 && game.get(0,0) == 1 && game.get(0,0) == game.get(1,0)){
                                x = 2;
                                y = 0;

                            }else
                            if(game.get(1,0) == 0 && game.get(0,0) == 1 && game.get(0,0) == game.get(2,0)){
                                x = 1;
                                y = 0;

                            }else
                            if(game.get(0,0) == 0 && game.get(2,0) == 1 && game.get(2,0) == game.get(1,0)){
                                x = 0;
                                y = 0;

                            }else
                            if(game.get(1,2) == 0 && game.get(1,1) == 1 && game.get(1,0) == game.get(1,1)){
                                x = 1;
                                y = 2;

                            }else
                            if( game.get(1,0) == 0 && game.get(1,1) == 1 && game.get(1,1) == game.get(1,2)){
                                x = 1;
                                y = 0;

                            }else
                            if(game.get(1,1) == 0 &&game.get(1,0) == 1 && game.get(1,2) == game.get(1,0)){
                                x = 1;
                                y = 1;

                            }else
                            if(game.get(2,2) == 0 && game.get(2,1) == 1 && game.get(2,0) == game.get(2,1)){
                                x = 2;
                                y = 2;

                            }else
                            if(game.get(2,1) == 1 && game.get(2,1) == game.get(2,2) && game.get(2,0) == 0){
                                x = 2;
                                y = 0;

                            }else
                            if(game.get(2,0) == 1 && game.get(2,2) == game.get(2,0) && game.get(2,1) == 0){
                                x = 2;
                                y = 1;

                            }else
                            if(game.get(0,1) == 1 && game.get(0,1) == game.get(1,1) && game.get(2,1) == 0){
                                x = 2;
                                y = 1;

                            }else
                            if(game.get(1,1) == 1 && game.get(1,1) == game.get(2,1) && game.get(0,1) == 0){
                                x = 0;
                                y = 1;

                            }else
                            if(game.get(0,2) == 1 && game.get(1,2) == game.get(0,2) && game.get(2, 2) == 0) {
                                x = 2;
                                y = 2;
                            }
                        if(game.get(2,2) == 1 && game.get(1,2) == game.get(2,2) && game.get(0, 2) == 0) {
                            x = 0;
                            y = 2;
                        }else
                        if(game.get(0,0) == 1 && game.get(0,0) == game.get(1,1) && game.get(2, 2) == 0) {
                            x = 2;
                            y = 2;

                        }else
                        if(game.get(1,1) == 1 && game.get(1,1) == game.get(2,2) && game.get(0, 0) == 0) {
                            x = 0;
                            y = 0;

                        }else
                        if(game.get(2,0) == 1 && game.get(2,0) == game.get(1,1) && game.get(0, 2) == 0) {
                            x = 0;
                            y = 2;

                        }else
                        if(game.get(0,2) == 1 && game.get(0,2) == game.get(1,1) && game.get(2, 0) == 0) {
                            x = 2;
                            y = 0;
                        }else
                        if(game.get(0,2) == 1 && game.get(0,2) == game.get(2,0) && game.get(1, 1) == 0) {
                            x = 1;
                            y = 1;
                        }else
                        if(game.get(0,0) == 1 && game.get(0,0) == game.get(2,2) && game.get(1, 1) == 0) {
                            x = 1;
                            y = 1;
                        }
                    }
                }
            }
            if(x == -1 && y == -1){
                while (true) {
                    Random rdn = new Random();
                    x = rdn.nextInt(3);
                    y = rdn.nextInt(3);
                    if (x != -1 && y != -1 && game.get(x, y) == 0)
                        break;
                }
            }
            if (x != -1 && y != -1) {
                game.set(x, y);
                game.change_player();
                invalidate();
            }
            return true;
        }
        DisplayMetrics displaymetrics = getResources().getDisplayMetrics();
        int w = displaymetrics.widthPixels;
        int h = displaymetrics.heightPixels;
        int i = -1, j = -1;

        if (X >= 0 && X <= w / 3) i = 0;
        if (X >= w / 3 + 10 && X <= 2 * w / 3 + 10) i = 1;
        if (X >= 2 * w / 3 + 20) i = 2;

        if (Y >= 600 && Y <= w / 3 + 600) j = 0;
        if (Y >= w / 3 + 10 + 600 && Y <= 2*w / 3 + 10 + 600) j = 1;
        if (Y >=  2*w / 3 + 20 + 600 && Y < w + 600) j = 2;
        if (i != -1 && j != -1 && game.getRun() == 1) {
            if (game.get(i, j) == 0) {
                game.set(i, j);
                game.change_player();
                invalidate();
            }
        }
        else {
            if(X >= 110 && X <= w/3+110 && Y < h - 50 && Y >= h - 400 ) {
                {
                    if (game.get(3, 0) == 0) {
                        game.restar();
                        invalidate();
                    }
                }
            }
        }

        return true;
    }
    @Override
    protected void onDraw(Canvas canvas){
        canvas.drawColor(Color.WHITE);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int wid = displayMetrics.widthPixels;
        int heg = displayMetrics.heightPixels;

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);

        canvas.drawLine(0,wid/3+600, wid,wid/3+600,paint);
        canvas.drawLine(0,2*wid/3+600, wid,2*wid/3+600,paint);
        canvas.drawLine(wid/3,600, wid/3,wid+600,paint);
        canvas.drawLine(2*wid/3,600, 2*wid/3,wid+600,paint);

        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(400);

        canvas.drawLine(0,0, wid,0,paint);
        String text1 = new String();
        text1 = "Крестики-нолики";
        paint.setColor(Color.WHITE);
        paint.setTextSize(82);
        canvas.drawText(text1, 200, 125, paint);
        paint.setColor(Color.BLACK);
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(game.get(i,j) == 1)
                    DrawPic1(canvas, 50 + i*wid/3, 50 + j*wid/3+600);
                if(game.get(i,j) == 2)
                    DrawPic2(canvas, 50 + i*wid/3, 50 + j*wid/3+600);
            }
        }
        String text = new String();
        int stat = game.chek();
        DrawPic3(canvas, 100,heg-400);
        if(stat == 0 && game.getPlayer()== 1) {
            text = "Ваш ход";
            paint.setTextSize(82);
            canvas.drawText(text, 150, 450, paint);
        }
        if(stat == 0 && game.getPlayer()== 2) {
            text = "Ход Геннадия";
            paint.setTextSize(82);
            canvas.drawText(text, 150, 450, paint);
        }
        if(stat != 0 && stat != 9 && game.getPlayer()== 2) {
            text = "Вы выигарли";
            paint.setTextSize(82);;
            paint.setColor(Color.RED);
            canvas.drawText(text, 90, 450, paint);
        }
        if(stat != 0 && stat != 9 && game.getPlayer()== 1) {
            text = "Геннадий победил";
            paint.setColor(Color.RED);
            paint.setTextSize(82);
            canvas.drawText(text, 90, 450, paint);
        }
        if(stat == 1){
            paint.setStrokeWidth(20);
            paint.setColor(Color.RED);
            canvas.drawLine(wid/6+5,620,wid/6+5,wid + 580,paint);
        }
        if(stat == 2){
            paint.setStrokeWidth(20);
            paint.setColor(Color.RED);
            canvas.drawLine(wid/6+10+wid/3,620,wid/6+10+wid/3,wid + 580,paint);
        }
        if(stat == 3){
            paint.setStrokeWidth(20);
            paint.setColor(Color.RED);
            canvas.drawLine(wid/6+15+wid/3*2,620,wid/6+15+wid/3*2,wid + 580,paint);
        }
        if(stat == 4){
            paint.setStrokeWidth(20);
            paint.setColor(Color.RED);
            canvas.drawLine(25,600+wid/6 + 5,50+wid-75,600+wid/6 + 5,paint);
        }
        if(stat == 5){
            paint.setStrokeWidth(20);
            paint.setColor(Color.RED);
            canvas.drawLine(25 ,600+wid/6 + wid/3 + 5,50+wid-75,600+wid/6 + wid/3 + 5,paint);
        }
        if(stat == 6){
            paint.setStrokeWidth(20);
            paint.setColor(Color.RED);
            canvas.drawLine(25 ,600+wid/6 + wid/3*2 + 10,50+wid-75,600+wid/6 + wid/3*2 + 10,paint);
        }
        if(stat == 7){
            paint.setStrokeWidth(20);
            paint.setColor(Color.RED);
            canvas.drawLine(25 ,625,wid-15,575+ wid ,paint);
        }
        if(stat == 8){
            paint.setStrokeWidth(20);
            paint.setColor(Color.RED);
            canvas.drawLine( 25 ,575 + wid,wid - 25,625 ,paint);
        }
        if(stat == 9 ) {
            text = "Ничья";
            paint.setColor(Color.RED);
            paint.setTextSize(102);
            canvas.drawText(text, 400, 450, paint);
        }
    }

}

class Game3{
    int [][] arr = {{0,0,0},{0,0,0},{0,0,0},{0,1,2}};
    int player = 1, run = 1;
    public  void set(int i, int j){
        arr[i][j] = player;
    }
    public void change_player() {
        if(player == 1)
            player = 2;
        else
            player = 1;
    }
    public int getPlayer(){return player;}
    public int chek(){
        int state = 0;
        if(arr[0][0] != 0 && arr[0][0] == arr[0][1] && arr[0][0] == arr[0][2]) state = 1;
        else if(arr[1][0] != 0 && arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2]) state = 2;
        else if(arr[2][0] != 0 && arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2]) state = 3;
        else if(arr[0][0] != 0 && arr[0][0] == arr[1][0] && arr[1][0] == arr[2][0]) state = 4;
        else if(arr[0][1] != 0 && arr[0][1] == arr[1][1] && arr[1][1] == arr[2][1]) state = 5;
        else if(arr[0][2] != 0 && arr[0][2] == arr[1][2] && arr[1][2] == arr[2][2]) state = 6;
        else if(arr[0][0] != 0 && arr[0][0] == arr[1][1] && arr[1][1] == arr[2][2]) state = 7;
        else if(arr[0][2] != 0 && arr[0][2] == arr[1][1] && arr[1][1] == arr[2][0]) state = 8;
        else
        if(arr[0][0]*arr[0][1]*arr[0][2]*arr[1][0]*arr[1][1]*arr[1][2]*arr[2][0]*arr[2][1]*arr[2][2] != 0)
            state = 9;
        if(state != 0)
            run = 0;
        return  state;
    }
    public int getRun(){
        return run;
    }
    public int get(int i, int j) {
        return arr[i][j];
    }
    public void restar() {
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                arr[i][j] = 0;
            }
        }
        run = 1;
    }

}