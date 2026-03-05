package latihan6;

public class Main {
    public static void main(String[] args) {
        SegiTiga sTiga = new SegiTiga();

        sTiga.setAlas(20);
        sTiga.setTinggi(5);
        System.out.println("Luas SegiTiga adalah : " + sTiga.LuasSegiTiga());


        Persegi p = new Persegi();

        p.setSisi(9);
        p.setSisi(5);
        System.out.println("Luas Persegi adalah : " + p.LuasPersegi());


        JajarGenjang jGenjang = new JajarGenjang();
        jGenjang.setAlas(15);
        jGenjang.setTinggi(10);
        System.out.println("Luas JajarGenjang adalah : " +jGenjang.LuasJajarGenjang());
    }
}
