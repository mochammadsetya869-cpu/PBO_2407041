package tugaskelompok;

public class minuman {
    
}
class Minuman extends Menu {
    private String ukuran;

    public Minuman(String nama, int harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    @Override
    public void detailMenu() {
        System.out.println("Minuman: " + getNama() +
                " | Harga: " + getHarga() +
                " | Ukuran: " + ukuran);
    }
}