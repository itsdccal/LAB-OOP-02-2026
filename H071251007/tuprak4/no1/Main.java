package tuprak4.no1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        System.out.println("   === BANGUN RUANG ===");
        System.out.println("1. KUBUS");
        System.out.println("2. BALOK");
        System.out.println("3. BOLA");
        System.out.println("4. TABUNG");

        System.out.println("   === BANGUN DATAR ===");
        System.out.println("5. PERSEGI");
        System.out.println("6. PERSEGI PANJANG");
        System.out.println("7. LINGKARAN");
        System.out.println("8. TRAPESIUM");
        System.out.println("------------------------------------------------");
        System.out.print("PIlihan: ");
        int pilihan = input.nextInt();
        System.out.println("------------------------------------------------");

        switch (pilihan) {
            case 1:
                System.out.print("Sisi: ");
                double sk = input.nextDouble();

                Kubus kubus = new Kubus(sk);
                System.out.println("Volume: " + kubus.volume());
                break;
            
            case 2:
                System.out.print("Panjang: ");
                double pb = input.nextDouble();
                System.out.print("Lebar: ");
                double lb = input.nextDouble();
                System.out.print("Tinggi: ");
                double tb = input.nextDouble();

                Balok balok = new Balok(pb, lb, tb);
                System.out.println("Volume: " + balok.volume());
                break;

            case 3:
                System.out.print("Jari-jari: ");
                double rb = input.nextDouble();
                
                Bola bola = new Bola(rb);
                System.out.println("Volume: " + bola.volume());
                break;


            case 4:
                System.out.print("Jari-jari: ");
                double rt = input.nextDouble();
                System.out.println("Tinggi: ");
                double tt = input.nextDouble();

                Tabung tabung = new Tabung(rt, tt);
                System.out.println("Volume: " + tabung.volume());
                break;

            case 5:
                System.out.print("Sisi: ");
                double s = input.nextDouble();

                Persegi persegi = new Persegi(s);
                System.out.println("Luas: " + persegi.luas());
                System.out.println("Keliling: " + persegi.keliling());
                break;

            case 6:
                System.out.print("Panjang: ");
                double p = input.nextDouble();
                System.out.print("Lebar");
                double l = input.nextDouble();

                PersegiPanjang persegi_panjang = new PersegiPanjang(p, l);
                System.out.println("Luas: " + persegi_panjang.luas());
                System.out.println("Keliling: " + persegi_panjang.keliling());
                break;

            case 7:
                System.out.print("Jari-jari: ");
                double r = input.nextDouble();

                Lingkaran lingkaran = new Lingkaran(r);
                System.out.println("Luas: " + lingkaran.luas());
                System.out.println("Keliling: " + lingkaran.keliling());
                break;

            case 8:
                System.out.print("Sisi a: ");
                double a = input.nextDouble();
                System.out.print("Sisi b: ");
                double b = input.nextDouble();
                System.out.print("Sisi c: ");
                double c = input.nextDouble();
                System.out.print("Sisi d: ");
                double d = input.nextDouble();
                System.out.print("Tinggi: ");
                double t = input.nextDouble();

                Trapesium trapesium = new Trapesium(a, b ,c, d, t);
                System.out.println("Luas: " + trapesium.luas());
                System.out.println("Keliling: " + trapesium.keliling());
                break;

            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }

        System.out.println("------------------------------------------------");
        System.out.println(" ");
        input.close();
    }
}
