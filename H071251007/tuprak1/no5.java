import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
    // 5. Buatlah array 2d seperti di soal, lalu buatlah input satu buah bilangan, kemudian buat perulangan 
    // untuk mencari angka tersebut dari array 2d yang dibuat sebelumnya dan setelah angka yang dicari diperoleh 
    // maka hentikan semua perulangan. (jangan lupa tambahkan try catch)
        Scanner input = new Scanner(System.in);
        int[][] nums = {{1,2,3}, {4,5,6}, {7,8,9}};

        try {
            System.out.print("Angka yg dicari: ");
            int cari = input.nextInt();

            boolean diperoleh = false;
            for (int i = 0; i < nums.length; i++){
                for (int j = 0; j < nums[i].length; j++){
                
                    if (nums[i][j] == cari) {
                        System.out.println("Angka " + cari + " berada di [" + i + "][" + j + "]");
                        diperoleh = true;
                        break;
                    }
                }
                if (diperoleh){
                    break;
                }
            
            }
            if (!diperoleh){
                System.out.println("Angka tidak ditemukan");
            }
        } catch (Exception e) {
            System.out.println("Input harus berupa angka!");
        }

        input.close();
    }
}
