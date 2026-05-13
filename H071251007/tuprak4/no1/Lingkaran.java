package tuprak4.no1;

public class Lingkaran extends BangunDatar {
    double r;

    public Lingkaran(double r){
        super("Lingkaran");
        this.r = r;
    }

    public double luas(){
        return Math.PI * r * r;
    }

    public double keliling(){
        return 2 * Math.PI * r;
    }
}
