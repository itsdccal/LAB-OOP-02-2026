import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
    // 3. Buat program untuk meminta input password dari pengguna dan validasi 
    // dengan ketentuan: (a) Minimal 8 karakter (b) Harus mengandung huruf besar, huruf kecil, dan angka
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = input.nextLine();

        if (password.length() >= 8 && password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*[0-9].*")) {
            System.out.println("Password valid :)");
        } else {
            System.out.println("Password tidak valid :(");
        }

        input.close();
        
            // note:
            // .* artinya boleh ada karakter apa saja sebelum atau sesudahnya
            // .*[a-z].* artinya ada huruf kecil
            // .*[A-Z].* artinya ada huruf besar
            // .*[0-9].* artinya ada angka
    }
}
