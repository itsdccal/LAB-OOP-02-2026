public class MainKaryawan {
    public static void main(String[] args) {
        KaryawanTetap kt = new KaryawanTetap("M. Fayyadh", 01, 5000000, 50000);
        kt.absen();
        kt.absen();
        kt.absen();
        
        System.out.println("--- Karyawan Tetap ---");
        System.out.println("Nama: " + kt.getNama());
        System.out.println("Gaji Total + Bonus: Rp" + kt.hitungGaji(5000));

        System.out.println();

        KaryawanKontrak kk = new KaryawanKontrak("Muwaffaq", 02, 100000);
        for (int i = 0; i < 21; i++) {
            kk.absen();
        }
        
        System.out.println("--- Karyawan Kontrak ---");
        System.out.println("Nama: " + kk.getNama());
        System.out.println("Jumlah Kehadiran: " + 21 + " hari");
        System.out.println("Gaji Total: Rp" + kk.hitungGaji());
    }
}