import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
    // 4. Buat program yang meminta bilangan n, lalu hitung n! (faktorial) 
    // menggunakan rekursi. 
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan angka: ");
        int angka = input.nextInt();
        
        int hasil = angka * faktorial(angka - 1);
        System.out.println("> " + angka + "! = " + hasil);

        input.close();
    }

    public static int faktorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}
