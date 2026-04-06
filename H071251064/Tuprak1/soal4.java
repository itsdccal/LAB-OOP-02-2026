import java.util.Scanner;

public class soal4 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan Input: ");
        int n = a.nextInt();

        long hasil = Faktorial(n);
        System.out.println("Output: " + hasil);

        a.close();
    }

    public static long Faktorial(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * Faktorial(n - 1);
        }
    }
}