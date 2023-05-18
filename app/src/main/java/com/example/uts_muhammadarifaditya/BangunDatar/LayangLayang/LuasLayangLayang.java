package com.example.uts_muhammadarifaditya.BangunDatar.LayangLayang;



public class LuasLayangLayang {
    double diagonal_satu;
    double diagonal_dua;

    public LuasLayangLayang(double d1, double d2){
        diagonal_satu=d1;
        diagonal_dua=d2;
    }

    public double hitung_luas(){
        return (diagonal_satu*diagonal_dua)/2;
    }
}
