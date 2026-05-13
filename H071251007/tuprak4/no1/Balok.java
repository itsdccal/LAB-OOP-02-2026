package tuprak4.no1;

public class Balok extends BangunRuang {
    double p, l, t;

    public Balok(double p, double l, double t){
        super("Balok");
        this.p = p;
        this.l = l;
        this.t = t;
    }

    public double volume(){
        return p * l * t;
    }

    public double luasPermukaan(){
        return 2 * (p*l + p*t + l*t);
    }
}
