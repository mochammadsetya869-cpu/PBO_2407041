package coba2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Menu[] daftarMenu = {
            new Menu("Nasi Goreng", 15000),
            new Menu("Mie Ayam", 12000),
            new Menu("Es Teh", 5000)
        };

        ArrayList<MenuItem> daftarPesanan = new ArrayList<>();

        char lagi;

        do {
            System.out.println("\n=== DAFTAR MENU ===");
            for (int i = 0; i < daftarMenu.length; i++) {
                System.out.println((i + 1) + ". " + daftarMenu[i].nama + " - " + daftarMenu[i].harga);
            }

            System.out.print("Pilih menu: ");
            int pilih = input.nextInt();

            System.out.print("Jumlah: ");
            int jumlah = input.nextInt();

            Menu menuDipilih = daftarMenu[pilih - 1];

            MenuItem pesanan = new MenuItem(menuDipilih.nama, menuDipilih.harga, jumlah);
            daftarPesanan.add(pesanan);

            System.out.print("Tambah pesanan lagi? (y/n): ");
            lagi = input.next().charAt(0);

        } while (lagi == 'y' || lagi == 'Y');

        // 🔥 tampilkan semua pesanan
        double totalSemua = 0;

        System.out.println("\n=== STRUK PESANAN ===");
        for (MenuItem item : daftarPesanan) {
            item.tampilkan();
            totalSemua += item.hitungTotal();
        }

        System.out.println("---------------------");
        System.out.println("Total Bayar: " + totalSemua);
    }
}