package com.example.uts_muhammadarifaditya;


public class defenisi2 {
    String judul,ciri,jciri,sifat,jsifat;

    public defenisi2(String judul, String ciri, String jciri, String sifat, String jsifat) {
        this.judul = judul;
        this.ciri = ciri;
        this.jciri =jciri;
        this.sifat=sifat;
        this.jsifat=jsifat;

    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getCiri() {
        return ciri;
    }

    public void setCiri(String ciri) {
        this.ciri = ciri;
    }

    public String getJciri() {
        return jciri;
    }

    public void setJciri(String jciri) {
        this.jciri = jciri;
    }

    public String getSifat() {
        return sifat;
    }

    public void setSifat(String sifat) {
        this.sifat = sifat;
    }

    public String getJsifat() {
        return jsifat;
    }

    public void setJsifat(String jsifat) {
        this.jsifat = jsifat;
    }
}
