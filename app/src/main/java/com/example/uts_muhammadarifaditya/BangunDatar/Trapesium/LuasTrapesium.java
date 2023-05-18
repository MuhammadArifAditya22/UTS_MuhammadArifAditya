package com.example.uts_muhammadarifaditya.BangunDatar.Trapesium;



public class LuasTrapesium {
    double AB;
    double CD;
    double tinggi;

    public LuasTrapesium(double ab, double cd, double t) {
        AB = ab;
        CD = cd;
        tinggi = t;
    }

    public double hitung_luas() {
        return ((AB + CD) * tinggi) / 2;
    }
}
