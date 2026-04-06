import java.util.Scanner;

public class soal5 {
    public static void main (String[] args) {
        int[][] nums = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        Scanner a = new Scanner(System.in);

        try {
        System.out.print("Masukkan Input: ");
        int cari = a.nextInt();

        boolean ditemukan = false;

        search:
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == cari) {
                    System.out.println("found " + cari + " at index [" + i + "][" + j + "]");
                    ditemukan = true;
                    break search;
                }
            }
        }

        if (!ditemukan) {
            System.out.println("Angka " + cari + " tidak ditemukan dalam array");
        }
        } catch (Exception e) {
            System.out.println("Input tidak valid. Harap masukkan angka bulat");
        } finally {
        a.close();
        }
    } 
}