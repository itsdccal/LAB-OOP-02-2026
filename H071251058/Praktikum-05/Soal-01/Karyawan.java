public abstract class Karyawan {
    private String nama;
    private int idKaryawan;
    protected int jumlahKehadiran;

    public Karyawan(String nama, int idKaryawan) {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.jumlahKehadiran = 0;
    }

    public void absen() {
        this.jumlahKehadiran++;
    }

    public String getNama() {
        return nama;
    }

    public int getIdKaryawan() {
        return idKaryawan;
    }

    public abstract double hitungGaji();
}

class KaryawanTetap extends Karyawan {
    private double gajiPokok;
    private double tunjanganMakan;

    public KaryawanTetap(String nama, int idKaryawan, double gajiPokok, double tunjanganMakan) {
        super(nama, idKaryawan);
        this.gajiPokok = gajiPokok;
        this.tunjanganMakan = tunjanganMakan;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + (tunjanganMakan * jumlahKehadiran);
    }

    public double hitungGaji(double bonusKinerja) {
        return hitungGaji() + bonusKinerja;
    }
}

class KaryawanKontrak extends Karyawan {
    private double upahPerHari;

    public KaryawanKontrak(String nama, int idKaryawan, double upahPerHari) {
        super(nama, idKaryawan);
        this.upahPerHari = upahPerHari;
    }

    @Override
    public double hitungGaji() {
        double totalGaji = upahPerHari * jumlahKehadiran;
        
        if (jumlahKehadiran > 20) {
            totalGaji += 500000;
        }
        
        return totalGaji;
    }
}

