package tugas2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Lingkaran l = new Lingkaran();

        System.out.println("Masukan jari-jari lingkaran: ");
        double r = input.nextDouble();

        l.setJarijari(r);
        l.setDiameter(r * 2);

        System.out.println("jari-jari : " + l.getJarijari());
        System.out.println("Diameter : " + l.getDiameter());
        System.out.println("Luas : " + l.hitungLuas());
        System.out.println("Keliling : " + l.hitungKeliling());
    }
}
