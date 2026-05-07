package tugas4;

public class Main {
    public static void main(String[] args) {

        MenuItem item1 = new MenuItem("Nasi Goreng", 15000, 2);
        MenuItem item2 = new MenuItem("Mie Ayam", 12000, 1);
        MenuItem item3 = new MenuItem("Es Teh", 5000, 3);

        double totalPesanan = 0;

        System.out.println("=== DAFTAR PESANAN ===");

        item1.tampilkan();
        System.out.println();

        item2.tampilkan();
        
        System.out.println();

        item3.tampilkan();
        System.out.println();

        totalPesanan = item1.hitungTotal() + item2.hitungTotal() + item3.hitungTotal();

        System.out.println("Total Pesanan: " + totalPesanan);
    }
}