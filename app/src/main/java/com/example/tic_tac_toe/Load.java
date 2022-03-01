package com.example.tic_tac_toe;

public class Load {
    public Load(CoreFM coreFM){
        loadAudio(coreFM);
    }

    private void loadAudio(CoreFM coreFM) {
        Until.knopka = coreFM.getAdioFM().newSound("knop.ogg");
    }
}
