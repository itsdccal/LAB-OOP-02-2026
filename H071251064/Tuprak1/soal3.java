import java.util.Scanner;

public class soal3 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan Password: ");
        String input = a.nextLine();

        boolean Besar = false;
        boolean Kecil = false;
        boolean Angka = false;

        if (input.length() >= 8) {
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isUpperCase(c)) {
                    Besar = true;
                } else if (Character.isLowerCase(c)) {
                    Kecil = true;
                } else if (Character.isDigit(c)) {
                    Angka = true;
                }
            }
        }

        if (input.length() >= 8 && Besar && Kecil && Angka) {
            System.out.println("Password Valid");
        } else {
            System.out.println("Password Tidak Valid");
        }
        a.close();
    } 
}