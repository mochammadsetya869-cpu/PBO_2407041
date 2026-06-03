package tugaskelompok;

public class Menu {
    private String nama;
    private int harga;

    // Constructor
    public Menu(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Overloading constructor
    public Menu(String nama) {
        this.nama = nama;
        this.harga = 0;
    }

    // Getter & Setter
    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    // Overloading setter
    public void setHarga(int harga, boolean diskon) {
        if (diskon) {
            this.harga = harga - (harga * 10 / 100);
        } else {
            this.harga = harga;
        }
    }

    public void detailMenu() {
        System.out.println("Menu: " + nama + " | Harga: " + harga);
    }
}