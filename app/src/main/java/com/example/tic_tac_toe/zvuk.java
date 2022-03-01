package com.example.tic_tac_toe;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;

import java.nio.channels.AcceptPendingException;
import java.security.AccessControlContext;

public class zvuk {
    private MediaPlayer knop;
    private static int k;
    public static int zv(int m){
        if(m == 0) {
            if (k == 0) {
                k = 1;
                return  1;
            }
            else
                k = 0;
            return 0;
        }
        else
            return k;
    }
}
