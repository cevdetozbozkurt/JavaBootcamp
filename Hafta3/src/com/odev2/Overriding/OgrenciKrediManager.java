package com.odev2.Overriding;

public class OgrenciKrediManager extends BaseKrediManager{
    @Override
    public double hesapla(double tutar) {
        return tutar * 1.10;
    }   
}
