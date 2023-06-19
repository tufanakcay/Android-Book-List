package com.tufanakcay.booklist;

public class KitapModel {

    private int kitapResim;
    private String kitapAdi;
    private String kitapYazari;
    private String kitapYayinEvi;
    private String kitapFiyati;
    private String kitapIlkBasimYili;

    public KitapModel(int kitapResim, String kitapAdi, String kitapYazari, String kitapYayinEvi, String kitapFiyati, String kitapIlkBasimYili) {
        this.kitapResim = kitapResim;
        this.kitapAdi = kitapAdi;
        this.kitapYazari = kitapYazari;
        this.kitapYayinEvi = kitapYayinEvi;
        this.kitapFiyati = kitapFiyati;
        this.kitapIlkBasimYili = kitapIlkBasimYili;
    }

    public int getKitapResim() {
        return kitapResim;
    }

    public void setKitapResim(int kitapResim) {
        this.kitapResim = kitapResim;
    }

    public String getKitapAdi() {
        return kitapAdi;
    }

    public void setKitapAdi(String kitapAdi) {
        this.kitapAdi = kitapAdi;
    }

    public String getKitapYazari() {
        return kitapYazari;
    }

    public void setKitapYazari(String kitapYazari) {
        this.kitapYazari = kitapYazari;
    }

    public String getKitapYayinEvi() {
        return kitapYayinEvi;
    }

    public void setKitapYayinEvi(String kitapYayinEvi) {
        this.kitapYayinEvi = kitapYayinEvi;
    }

    public String getKitapFiyati() {
        return kitapFiyati;
    }

    public void setKitapFiyati(String kitapFiyati) {
        this.kitapFiyati = kitapFiyati;
    }

    public String getKitapIlkBasimYili() {
        return kitapIlkBasimYili;
    }

    public void setKitapIlkBasimYili(String kitapIlkBasimYili) {
        this.kitapIlkBasimYili = kitapIlkBasimYili;
    }
}
