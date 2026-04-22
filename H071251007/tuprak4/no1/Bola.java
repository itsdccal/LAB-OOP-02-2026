package tuprak4.no1;

public class Bola extends BangunRuang {
    double r;

    public Bola(double r){
        super("Bola");
        this.r = r;
    }

    public double volume(){
        return (4/3) * Math.PI * r * r * r;
    }

    public double luasPermukaan(){
        return 4 * Math.PI * r * r;
    }
}
