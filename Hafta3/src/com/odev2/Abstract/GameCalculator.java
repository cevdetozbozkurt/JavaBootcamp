package com.odev2.Abstract;

public abstract class GameCalculator {
    public abstract void hesapla();

    public final void gameOver(){
        System.out.println("Oyun bitti...");
    }
}
