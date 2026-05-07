package tugaskelompok;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Cafe cafe = new Cafe("Bantu Siaga Cafe");

        // Polymorphism
        Menu m1 = new Makanan("Nasi Goreng", 15000, "Berat");
        Menu m2 = new Minuman("Es Teh", 5000, "Medium");
        Menu m3 = new Minuman("Kopi", 10000, "Large");

        cafe.tambahMenu(m1);
        cafe.tambahMenu(m2);
        cafe.tambahMenu(m3);

        int total = 0;
        int pilihan;

        do {
        cafe.tampilkanMenu();
        System.out.print("Pilih menu (0 untuk keluar): ");
        pilihan = input.nextInt();

        if (pilihan > 0 && pilihan <= cafe.getJumlahMenu()) {
            Menu pilihMenu = cafe.getMenu(pilihan - 1);

            System.out.print("Jumlah pesanan: ");
            int jumlah = input.nextInt();

            int subtotal = pilihMenu.getHarga() * jumlah;
            total += subtotal;

            System.out.println("Ditambahkan: " + pilihMenu.getNama() + 
                            " x" + jumlah + 
                            " = Rp" + subtotal);
        } 
        else if (pilihan != 0) {
            System.out.println("Pilihan tidak valid!");
    }

} while (pilihan != 0);

        System.out.println("Total harga: Rp" + total);
        input.close();
    }
}