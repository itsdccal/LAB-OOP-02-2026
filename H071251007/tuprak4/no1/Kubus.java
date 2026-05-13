package tuprak4.no1;

public class Kubus extends BangunRuang {
    double s;

    public Kubus(double s){
        super("Kubus");
        this.s = s;
    }

    public double volume(){
        return s * s * s;
    }

    public double luasPermukaan(){
        return 6 * s;
    }
}
