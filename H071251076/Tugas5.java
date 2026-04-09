import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Membuat array 2D seperti contoh
        int[][] nums = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        try {
            System.out.print("Input : ");
            int cari = input.nextInt();
            
            // Variabel untuk menyimpan posisi
            boolean ditemukan = false;
            int baris = -1;
            int kolom = -1;
            
            // Perulangan untuk mencari angka
            for (int i = 0; i < nums.length; i++) {
                for (int j = 0; j < nums[i].length; j++) {
                    if (nums[i][j] == cari) {
                        baris = i;
                        kolom = j;
                        ditemukan = true;
                        break;
                    }
                }
                if (ditemukan) {
                    break;
                }
            }
            
            // Menampilkan hasil, kalau angka dalam array
            if (ditemukan) {
                System.out.println("Ditemukan " + cari + " di [" + baris + "][" + kolom + "]");
            } else {
                System.out.println("Angka " + cari + " tidak ditemukan dalam array");
            }
        
        //utk error kalau bukan angka
        } catch (Exception e) {
            System.out.println("Error: Input harus berupa angka!");
            System.out.println("Detail error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}