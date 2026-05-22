import java.util.Scanner;

public class Soal4 {

    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input : ");
        int n = input.nextInt();

        int hasil = faktorial(n);

        System.out.println("Output : " + hasil);
    }
}