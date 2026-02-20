package latihan1_pbo;

class Cafe {
    String namaMinuman;
    int harga;
    String tipe;

    Cafe(String namaMinuman, int harga, String tipe) {
        this.namaMinuman = namaMinuman;
        this.harga = harga;
        this.tipe = tipe;
    }

    void tampilkanInfo() {
        System.out.println("Nama Minuman : " + namaMinuman);
        System.out.println("Harga        : Rp " + harga);
        System.out.println("Tipe         : " + tipe);
    }
}

public class Main {
    public static void main(String[] args) {

        Cafe minuman1 = new Cafe("Americano", 15000, "Panas");
        Cafe minuman2 = new Cafe("Cappuccino", 20000, "Dingin");

        minuman1.tampilkanInfo();
        System.out.println("--------------------");
        minuman2.tampilkanInfo();
    }
}