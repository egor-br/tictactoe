package com.example.tic_tac_toe;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class CoreFM extends AppCompatActivity {

    private AdioFM adioFM;

    protected void onCreat(){
        adioFM = new AdioFM(this);

    }

    public  AdioFM getAdioFM(){
        return  adioFM;
    }
}
