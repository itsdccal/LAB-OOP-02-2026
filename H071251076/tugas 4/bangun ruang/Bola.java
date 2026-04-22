public class Bola extends BangunRuang {
    private double jariJari;

    public Bola(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return 4 * Math.PI * jariJari * jariJari;
    }

    @Override
    public double hitungVolume() {
        return (4.0 / 3) * Math.PI * jariJari * jariJari * jariJari;
    }
}
