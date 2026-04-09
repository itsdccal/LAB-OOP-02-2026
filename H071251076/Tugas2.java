import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // array nama bulan
        String[] namaBulan = {
            "Januari", "Februari", "Maret", "April", "Mei", "Juni",
            "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };
        
        System.out.print("Input (DD-MM-YY): ");
        String tanggalInput = input.nextLine();
        
        // tanggal dipisah dgn -
        String[] bagian = tanggalInput.split("-");
        
        // hari bulan tahun diambil
        int hari = Integer.parseInt(bagian[0]);
        int bulan = Integer.parseInt(bagian[1]);
        int tahun = Integer.parseInt(bagian[2]);
        
        // Konversi tahun 2 digit menjadi 4 digit
        // kalau tahun diatas 50, jadi sekitar 1950 keatas sampai 1999, kalau dibawah 50, sekitar 2049 kebawah sampai 2000
        if (tahun >= 50) {
            tahun = 1900 + tahun;
        } else {
            tahun = 2000 + tahun;
        }
        
        // output
        System.out.println("Output :");
        System.out.println(hari + " " + namaBulan[bulan - 1] + " " + tahun);
        
        input.close();
    }
}