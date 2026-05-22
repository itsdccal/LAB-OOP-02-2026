public class Main {
    public static void main(String[] args) {

        Kelas kelas1 = new Kelas("X RPL", "Pak Budi");

        Tugas tugas1 = new Tugas("Matematika", false);
        Tugas tugas2 = new Tugas("Bahasa Inggris", false);

        Siswa siswa1 = new Siswa("Andi", 80, tugas1, kelas1);
        Siswa siswa2 = new Siswa("Budi", 85, tugas2, kelas1);

        System.out.println("Status Awal:");
        siswa1.tampilStatus();
        siswa2.tampilStatus();

        siswa1.kerjakanTugas();

        System.out.println("\nSetelah mengerjakan tugas:");
        siswa1.tampilStatus();

        siswa1.bandingkanNilai(siswa2);
    }
}