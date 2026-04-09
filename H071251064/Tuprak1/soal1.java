import java.util.Scanner;

public class soal1 {
    public static void main (String[] args) {
        Scanner a = new Scanner(System.in);

        System.out.print("Masukkan Judul Film: ");
        String input = a.nextLine();

        String[] kata = input.split(" ");
        String hasil = "";
        
        for (String k : kata) {
            if (!k.isEmpty()) {
                String baru = k.substring(0, 1).toUpperCase() + k.substring(1).toLowerCase();
                hasil += baru + " ";
            }
        }
        System.out.println("Judul Film: " + hasil);
        a.close();
    } 
}