import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("----------------------------------------");
        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. KUBUS\n2. BALOK\n3. BOLA\n4. TABUNG");
        System.out.println("\n===== BANGUN DATAR =====");
        System.out.println("5. PERSEGI\n6. PERSEGI PANJANG\n7. LINGKARAN\n8. TRAPESIUM");
        System.out.println("----------------------------------------");
        
        System.out.print("Pilihan: ");
        int pilihan = input.nextInt();
        System.out.println("----------------------------------------");

        if (pilihan == 1) {
            Kubus kubus = new Kubus();
            System.out.print("Masukkan sisi kubus: ");
            double sisiKubus = input.nextDouble();
            kubus.hitung(sisiKubus); 
        } else if (pilihan == 2) {
            Balok balok = new Balok();
            System.out.print("Masukkan panjang balok: ");
            double pBalok = input.nextDouble();
            System.out.print("Masukkan lebar balok: ");
            double lBalok = input.nextDouble();
            System.out.print("Masukkan tinggi balok: ");
            double tBalok = input.nextDouble();
            balok.hitung(pBalok, lBalok, tBalok);
        } else if (pilihan == 3) {
            Bola bola = new Bola();
            System.out.print("Masukkan jari-jari bola: ");
            double rBola = input.nextDouble();
            bola.hitung(rBola);
        } else if (pilihan == 4) {
            Tabung tabung = new Tabung();
            System.out.print("Masukkan jari-jari tabung: ");
            double rTabung = input.nextDouble();
            System.out.print("Masukkan tinggi tabung: ");
            double tTabung = input.nextDouble();
            tabung.hitung(rTabung, tTabung);
        } else if (pilihan == 5) {
            Persegi persegi = new Persegi();
            System.out.print("Masukkan sisi persegi: ");
            double sPersegi = input.nextDouble();
            persegi.hitung(sPersegi);
        } else if (pilihan == 6) {
            PersegiPanjang pp = new PersegiPanjang();
            System.out.print("Masukkan panjang: ");
            double pPP = input.nextDouble();
            System.out.print("Masukkan lebar: ");
            double lPP = input.nextDouble();
            pp.hitung(pPP, lPP);
        } else if (pilihan == 7) {
            Lingkaran lingkaran = new Lingkaran();
            System.out.print("Masukkan jari-jari lingkaran: ");
            double rLingkaran = input.nextDouble();
            lingkaran.hitung(rLingkaran);
        } else if (pilihan == 8) {
            Trapesium trapesium = new Trapesium();
            System.out.print("Masukkan sisi 1 trapesium: ");
            double s1 = input.nextDouble();
            System.out.print("Masukkan sisi 2 trapesium: ");
            double s2 = input.nextDouble();
            System.out.print("Masukkan sisi 3 trapesium: ");
            double s3 = input.nextDouble();
            System.out.print("Masukkan sisi 4 trapesium: ");
            double s4 = input.nextDouble();
            System.out.print("Masukkan tinggi trapesium: ");
            double t = input.nextDouble();
            trapesium.hitung(s1, s2, s3, s4, t);
        } else {
            System.out.println("Pilihan tidak tersedia.");

        }
        System.out.println("----------------------------------------");
    }
}