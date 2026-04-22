package tuprak4.no1;

public class Trapesium extends BangunDatar {
    double a, b, c, d, t;

    public Trapesium(double a, double b, double c, double d, double t){
        super("Trapesium");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.t = t;
    }

    public double luas(){
        return 0.5 * (a + b) * t;
    }

    public double keliling(){
        return a + b + c + d;
    }
}
