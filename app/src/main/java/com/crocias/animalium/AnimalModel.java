package com.crocias.animalium;

/**
 * Created by Jefri Yushendri on 26/11/2016.
 */

public class AnimalModel {
    String namaIndo;
    String namaEng;
    int gambar;

    public AnimalModel(int gambar, String namaIndo, String namaEng){
        this.namaIndo=namaIndo;
        this.namaEng=namaEng;
        this.gambar=gambar;

    }

    public String getNamaIndo() {
        return namaIndo;
    }

    public void setNamaIndo(String namaIndo) {
        this.namaIndo = namaIndo;
    }

    public String getNamaEng() {
        return namaEng;
    }

    public void setNamaEng(String namaEng) {
        this.namaEng = namaEng;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }




}
