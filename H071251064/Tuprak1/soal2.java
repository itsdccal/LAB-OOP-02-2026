import java.util.Scanner;

public class soal2 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);

        String[] bulan = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};

        System.out.print("Masukkan Tanggal: ");
        String input = a.nextLine();

        String[] bagian = input.split("-");

        int tgl = Integer.parseInt(bagian[0]);
        int bln = Integer.parseInt(bagian[1]); 
        int thn = Integer.parseInt(bagian[2]);

        String tahun = (thn > 26) ? "19" + bagian[2] : "20" + bagian[2];

        System.out.println("Tanggal: " + tgl + " " + bulan[bln-1] + " " + tahun);
        a.close();
    } 
}