import java.util.Scanner;

public class no1 {
    public static void main(String[] args) {
    // 1. Buatlah sebuah method yang berfungsi merubah huruf 
    // pertama dari tiap kata menjadi kapital. Gunakan scanner untuk membuat inputan. 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan text: ");
        String text = input.nextLine();

        String[] kata = text.split(" ");
        String hasil = ""; 

        for (int i = 0; i < kata.length; i++){
            String k = kata[i];
            hasil += k.substring(0,1).toUpperCase() + k.substring(1).toLowerCase() + " ";
        }

        System.out.println(" > " + hasil);

        input.close();
    }
}