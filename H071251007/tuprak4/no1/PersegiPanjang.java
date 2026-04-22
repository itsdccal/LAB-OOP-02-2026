package tuprak4.no1;

public class PersegiPanjang extends BangunDatar {
    double p;
    double l;

    public PersegiPanjang(double p, double l){
        super("Persegi");
        this.p = p;
        this.l = l;
    }

    public double luas(){
        return p * l;
    }

    public double keliling(){
        return 2 * (p + l);
    }
}
