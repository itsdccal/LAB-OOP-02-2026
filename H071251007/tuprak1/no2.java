import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
    // 2. Buat program yang mengkonversi tanggal dalam format "dd-mm-yy" 
    // menjadi format lebih jelas "d NamaBulan yyyy". 
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan tanggal (dd-mm-yy): ");
        String tgl = input.nextLine();

        String[] tanggal = tgl.split("-");

        String hari = tanggal[0];
        String bulan = tanggal[1];
        String tahun = tanggal[2];


        String NamaBulan = "";
        switch (bulan) {
            case "01":
                NamaBulan = "Januari";
                break;
            case "02":
                NamaBulan = "Februari";
                break;
            case "03":
                NamaBulan = "Maret";
                break;
            case "04":
                NamaBulan = "April";
                break;
            case "05":
                NamaBulan = "Mei";
                break;
            case "06":
                NamaBulan = "Juni";
                break;
            case "07":
                NamaBulan = "Juli";
                break;
            case "08":
                NamaBulan = "Agustus";
                break;
            case "09":
                NamaBulan = "September";
                break;
            case "10":
                NamaBulan = "Oktober";
                break;
            case "11":
                NamaBulan = "November";
                break;
            case "12":
                NamaBulan = "Desember";
                break;
            default: System.out.println("Bulan tidak valid!");
                break;
        }

        int thn = Integer.parseInt(tahun);
        if (thn < 30){
            thn += 2000;
        } else {
            thn += 1900;
        }

        System.out.println(hari + " " + NamaBulan + " " + thn);

        input.close();
    }
}
