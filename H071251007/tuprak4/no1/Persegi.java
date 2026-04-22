package tuprak4.no1;

public class Persegi extends BangunDatar {
    double s;

    Persegi(double s){
        super("Persegi");
        this.s = s;
    }

    public double luas(){
        return s * s;
    }

    public double keliling(){
        return 4 * s;
    }
}
