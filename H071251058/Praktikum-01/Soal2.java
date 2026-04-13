import java.util.Scanner;

public class Soal2 {

    public static String konversiTanggal(String input) {

        String[] bagian = input.split("-");

        int day = Integer.parseInt(bagian[0]);
        int month = Integer.parseInt(bagian[1]);
        int tahun = Integer.parseInt(bagian[2]);

        String[] monthname = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        String monthStr = monthname[month - 1];

        if (tahun <= 26) {
            tahun += 2000;
        } else {
            tahun += 1900;
        }

        return day + " " + monthStr + " " + tahun;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tanggal: (dd-mm-yy)");
        String tanggal = input.nextLine();

        String hasil = konversiTanggal(tanggal);

        System.out.println(hasil);
    }
}