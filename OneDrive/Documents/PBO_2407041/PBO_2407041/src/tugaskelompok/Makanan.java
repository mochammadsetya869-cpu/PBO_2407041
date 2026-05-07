package tugaskelompok;

public class makanan {
    
}
class Makanan extends Menu {
    private String jenis;

    public Makanan(String nama, int harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    @Override
    public void detailMenu() {
        System.out.println("Makanan: " + getNama() +
                " | Harga: " + getHarga() +
                " | Jenis: " + jenis);
    }
}