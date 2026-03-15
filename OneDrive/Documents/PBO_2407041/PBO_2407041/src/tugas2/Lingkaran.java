package tugas2;

public class Lingkaran {

    private double jarijari;
    private double diameter;


    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }

    public void setDiameter(double diameter){
        this.diameter = diameter;
    }
    
    public double getJarijari() {
        return jarijari;
    }

    public double getDiameter() {
        return diameter;
    }

    public double hitungLuas(){
        return 3.14 * jarijari * jarijari;
    }

    public double hitungKeliling(){
        return 2 * 3.14 * jarijari;
    }

}
