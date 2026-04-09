import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int number = scanner.nextInt();
        int factorial = 1;

        //faktorialnya
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        //output
        System.out.println("Faktorial dari " + number + " adalah: " + factorial);
    }
}