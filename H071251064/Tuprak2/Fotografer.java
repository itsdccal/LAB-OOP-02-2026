package Tuprak2;
import java.util.Random;

public class Fotografer {
    String nama;
    Kamera kamera = new Kamera();
    Perlengkapan perlengkapan;

    int baterai = 100;
    int sisaMemori = 64;

    public Fotografer() {
        this.nama = "Aqilah";
        this.kamera.merekKamera = "Canon EOS R5";
        this.kamera.lensa.tipeLensa = "Standard Zoom";
        this.kamera.lensa.focalLength = 24.0;
        this.perlengkapan = new Perlengkapan("UV Filter", "Standard Bag", "No Tripod");
    }

    public Fotografer(String nama, String merekKamera, String tipeLensa, double focalLength, String filter, String tas, String tripod) {
        this.nama = nama;
        this.kamera.merekKamera = merekKamera;
        this.kamera.lensa.tipeLensa = tipeLensa;
        this.kamera.lensa.focalLength = focalLength;
        this.perlengkapan = new Perlengkapan(filter, tas, tripod);
    }

    public void tangkapMomen(String objek) {
        if (baterai <= 5 || sisaMemori <= 0) {
            System.out.println("Tidak bisa memotret! Periksa baterai atau memori!");
            return;
        }

        Random random = new Random();
        System.out.printf("\n%s sedang membidik objek: [%s]\n", this.nama, objek);
        System.out.println("----------------------------------------------");

        int konsumsiBaterai = random.nextInt(5) + 1;
        double ukuranFile = 0.5 + (random.nextDouble() * 1.5);
        int skorEstetika = random.nextInt(100);

        this.baterai -= konsumsiBaterai;
        this.sisaMemori -= (int) ukuranFile;

        System.out.print("Hasil: ");
        if (skorEstetika > 85) {
            System.out.println("LUAR BIASA! Foto ini layak masuk galeri nasional.");
        } else if (skorEstetika > 50) {
            System.out.println("Bagus. Komposisi dan pencahayaannya pas.");
        } else {
            System.out.println("Kurang fokus. Mungkin perlu mencoba angle lain.");
        }

        System.out.printf("Info Gear: Menggunakan %s (Konsumsi Baterai: %d%%)\n", 
                          this.kamera.lensa.getSpec(), konsumsiBaterai);
    }

    public void Edit() {
        System.out.println("\nMengedit foto dan mengosongkan memori...");
        this.baterai = 100;
        this.sisaMemori = 64; 
        System.out.println("Baterai penuh kembali dan memori telah dikosongkan ke Cloud.");
    }

    public void lihatStatus() {
        System.out.println("\n=========== [STATUS FOTOGRAFER] ===========");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("Kamera\t\t: " + kamera.getMerekKamera());
        System.out.println("Spesifikasi\t: " + kamera.lensa.getSpec());
        System.out.println("Perlengkapan\t: " + perlengkapan.getPerlengkapan());
        System.out.println("Sisa Baterai\t: " + baterai + "%");
        System.out.println("Sisa Memori\t: " + sisaMemori + " GB");
        System.out.println("===========================================");
    }

    public int getBaterai() {
        return baterai;
    }

    public void setBaterai(int baterai) {
        this.baterai = baterai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}