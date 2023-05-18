package com.example.uts_muhammadarifaditya;

public class rumus2 {
    String nama,contoh,deskripsi,des2;
    int imgjm;

    public rumus2(String nama, String contoh, String deskripsi,String des2, int imgjm){
        this.nama = nama;
        this.contoh = contoh;
        this.deskripsi = deskripsi;
        this.imgjm = imgjm;
        this.des2=des2;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getContoh() {
        return contoh;
    }

    public void setContoh(String contoh) {
        this.contoh = contoh;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getImgjm() {
        return imgjm;
    }

    public void setImgjm(int imgjm) {
        this.imgjm = imgjm;
    }

    public String getdes2() {
        return des2;
    }

    public void setdes2(String des2) {
        this.des2 = des2;
    }
}