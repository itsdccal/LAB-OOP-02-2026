import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        //password input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan password: ");
        String password = scanner.nextLine();
        
        //sistem if-else utk password benar salah
        if (isValidPassword(password)) {
            System.out.println("Password valid.");
        } else {
            System.out.println("Password tidak valid.");
        }
    }
    
    //cek syarat
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) return false;

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) hasUpper = true;
            else if (Character.isLowerCase(c)) hasLower = true;
            else if (Character.isDigit(c)) hasDigit = true;
        }

        return hasUpper && hasLower && hasDigit;
    }
}