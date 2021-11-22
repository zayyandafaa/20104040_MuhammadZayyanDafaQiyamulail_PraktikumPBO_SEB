package Modul6.praktikum.percobaan2.subbangun;

import Modul6.praktikum.percobaan2.BangunDatar;

public class PersegiPanjang extends BangunDatar {
    double panjang;
    double lebar;



    public double luas() {
        return panjang * lebar;
    }


    public double keliling() {
        return 2 * (panjang + lebar);
    }

    public double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
}

