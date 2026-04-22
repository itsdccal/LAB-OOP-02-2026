public class Trapesium extends BangunDatar {
    private double sisi1, sisi2, sisi3, sisi4, tinggi;

    public Trapesium(double sisi1, double sisi2, double sisi3, double sisi4, double tinggi) {
        this.sisi1  = sisi1;
        this.sisi2  = sisi2;
        this.sisi3  = sisi3;
        this.sisi4  = sisi4;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        // (sisi sejajar1 + sisi sejajar2) / 2 * tinggi
        return (sisi1 + sisi2) / 2 * tinggi;
    }

    @Override
    public double hitungKeliling() {
        return sisi1 + sisi2 + sisi3 + sisi4;
    }
}
