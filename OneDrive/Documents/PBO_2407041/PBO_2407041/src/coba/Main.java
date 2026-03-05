package coba;

public class Main {
    public static void main(String[] args) {
        Coba pp1 = new Coba();
        
        pp1.setPanjang(9);
        System.out.println("Panjangnya adalah : "+ pp1.getPanjang());
        pp1.setLebar(10);
        System.out.println("Luasnya adalah :"+ pp1.hitungLuas());
        pp1.cetakLuas();
    }
}
