import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------------");
            System.out.println("  ===== BANGUN RUANG =====");
            System.out.println("1. KUBUS");
            System.out.println("2. BALOK");
            System.out.println("3. BOLA");
            System.out.println("4. TABUNG");
            System.out.println();
            System.out.println("  ===== BANGUN DATAR =====");
            System.out.println("5. PERSEGI");
            System.out.println("6. PERSEGI PANJANG");
            System.out.println("7. LINGKARAN");
            System.out.println("8. TRAPESIUM");
            System.out.println("----------------------------------------");
            System.out.print("Pilihan: ");
            int pilihan = sc.nextInt();
            System.out.println("----------------------------------------");

            switch (pilihan) {
                case 1: {
                    System.out.print("Masukkan sisi kubus: ");
                    double sisi = sc.nextDouble();
                    Kubus k = new Kubus(sisi);
                    System.out.println("Luas kubus: " + k.hitungLuas());
                    System.out.println("Volume kubus: " + k.hitungVolume());
                    break;
                }
                case 2: {
                    System.out.print("Masukkan panjang balok: ");
                    double p = sc.nextDouble();
                    System.out.print("Masukkan lebar balok: ");
                    double l = sc.nextDouble();
                    System.out.print("Masukkan tinggi balok: ");
                    double t = sc.nextDouble();
                    Balok b = new Balok(p, l, t);
                    System.out.println("Luas balok: " + b.hitungLuas());
                    System.out.println("Volume balok: " + b.hitungVolume());
                    break;
                }
                case 3: {
                    System.out.print("Masukkan jari-jari bola: ");
                    double r = sc.nextDouble();
                    Bola bo = new Bola(r);
                    System.out.println("Luas bola: " + bo.hitungLuas());
                    System.out.println("Volume bola: " + bo.hitungVolume());
                    break;
                }
                case 4: {
                    System.out.print("Masukkan jari-jari tabung: ");
                    double r = sc.nextDouble();
                    System.out.print("Masukkan tinggi tabung: ");
                    double t = sc.nextDouble();
                    Tabung tab = new Tabung(r, t);
                    System.out.println("Luas tabung: " + tab.hitungLuas());
                    System.out.println("Volume tabung: " + tab.hitungVolume());
                    break;
                }
                case 5: {
                    System.out.print("Masukkan sisi persegi: ");
                    double sisi = sc.nextDouble();
                    Persegi ps = new Persegi(sisi);
                    System.out.println("Luas persegi: " + ps.hitungLuas());
                    System.out.println("Keliling persegi: " + ps.hitungKeliling());
                    break;
                }
                case 6: {
                    System.out.print("Masukkan panjang: ");
                    double p = sc.nextDouble();
                    System.out.print("Masukkan lebar: ");
                    double l = sc.nextDouble();
                    PersegiPanjang pp = new PersegiPanjang(p, l);
                    System.out.println("Luas persegi panjang: " + pp.hitungLuas());
                    System.out.println("Keliling persegi panjang: " + pp.hitungKeliling());
                    break;
                }
                case 7: {
                    System.out.print("Masukkan jari-jari lingkaran: ");
                    double r = sc.nextDouble();
                    Lingkaran lg = new Lingkaran(r);
                    System.out.println("Luas lingkaran: " + lg.hitungLuas());
                    System.out.println("Keliling lingkaran: " + lg.hitungKeliling());
                    break;
                }
                case 8: {
                    System.out.print("Masukkan sisi 1 trapesium: ");
                    double s1 = sc.nextDouble();
                    System.out.print("Masukkan sisi 2 trapesium: ");
                    double s2 = sc.nextDouble();
                    System.out.print("Masukkan sisi 3 trapesium: ");
                    double s3 = sc.nextDouble();
                    System.out.print("Masukkan sisi 4 trapesium: ");
                    double s4 = sc.nextDouble();
                    System.out.print("Masukkan tinggi trapesium: ");
                    double t = sc.nextDouble();
                    Trapesium tr = new Trapesium(s1, s2, s3, s4, t);
                    System.out.println("Luas trapesium: " + tr.hitungLuas());
                    System.out.println("Keliling trapesium: " + tr.hitungKeliling());
                    break;
                }
                default:
                    System.out.println("Pilihan tidak valid.");
            }
            System.out.println("----------------------------------------");
        }
    }
}
