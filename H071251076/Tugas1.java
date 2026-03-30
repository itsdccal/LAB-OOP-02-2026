import java.util.Scanner;

public class Tugas1{

    public static void main(String[] arg){
        Scanner kapitalis = new Scanner(System.in);
        String text = kapitalis.nextLine();
        //judul diubah ke huruf kecil semua
        String lower = text.toLowerCase();
        String benar = "";
        
        //utk kapitalisasi huruf pertama tiap kata aja
        boolean capitalizeNext = true;
        
        for(int i = 0; i < lower.length(); i++){
            char current = lower.charAt(i);
            
            if(capitalizeNext && current != ' '){
                benar += Character.toUpperCase(current);
                capitalizeNext = false;
            } else {
                benar += current;
            }
            
            if(current == ' '){
                capitalizeNext = true;
            }
        }

        System.out.println(benar);
    }
}