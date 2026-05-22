public class Kelas {
    String namaKelas;
    String waliKelas;

    public Kelas() {
        this.namaKelas = "Kelas kosong";
        this.waliKelas = "Belum Ada";
    }

    public Kelas(String namaKelas, String waliKelas) {
        this.namaKelas = namaKelas;
        this.waliKelas = waliKelas;
    }

    public void infoKelas() {
        System.out.println("Kelas      : " + namaKelas);
        System.out.println("Wali Kelas : " + waliKelas);
    }
}