package Latihan_PBO;

public class BangunDatar {
    protected double panjang;
    protected double lebar;


    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double hitungLuas() {
        return panjang * lebar * 2;
    }

}
