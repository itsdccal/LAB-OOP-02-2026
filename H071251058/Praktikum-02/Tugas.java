public class Tugas {
    String judul;
    boolean selesai;

    public Tugas() {
        this.judul = "Tugas Kosong";
        this.selesai = false;
    }

    public Tugas(String judul, boolean selesai) {
        this.judul = judul;
        this.selesai = selesai;
    }

    public void infoTugas() {
        String status = selesai ? "Selesai" : "Belum";
        System.out.println("Tugas: " + judul + " | Status: " + status);
    }
}