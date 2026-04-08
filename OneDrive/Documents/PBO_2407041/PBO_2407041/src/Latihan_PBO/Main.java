package Latihan_PBO;

public class Main {
    public static void main(String[] args) {

        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;

        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        System.out.println("Luas alas: " + br.hitungLuas());
        System.out.println("Volume: " + br.hitungVolume());
    }
}
