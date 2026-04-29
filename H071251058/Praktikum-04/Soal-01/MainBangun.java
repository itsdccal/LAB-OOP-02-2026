import java.util.Scanner;

public class MainBangun {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("===== BANGUN RUANG =====");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Bola");
        System.out.println("4. Tabung");

        System.out.println("\n===== BANGUN DATAR =====");
        System.out.println("5. Persegi");
        System.out.println("6. Persegi Panjang");
        System.out.println("7. Lingkaran");
        System.out.println("8. Trapesium");

        System.out.print("\nPilihan: ");
        int pilih = input.nextInt();

        switch (pilih){
            case 1:
                System.out.print("Masukkan sisi: ");
                double s = input.nextDouble();
                Kubus kubus = new Kubus(s);
                System.out.println("Volume: " + kubus.volume());
                System.out.println("Luas Permukaan: " + kubus.luasPermukaan());
                break;
            case 2:
                System.out.print("Masukkan panjang: ");
                double p = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t = input.nextDouble();
                Balok balok = new Balok(p, l, t);
                System.out.println("Volume: " + balok.volume());
                System.out.println("Luas Permukaan: " + balok.luasPermukaan());
                break;
            case 3:
                System.out.print("Masukkan jari-jari: ");
                double r = input.nextDouble();
                Bola bola = new Bola(r);
                System.out.println("Volume: " + bola.volume());
                System.out.println("Luas Permukaan: " + bola.luasPermukaan());
                break;
            case 4:
                System.out.print("Masukkan jari-jari: ");
                double r2 = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t2 = input.nextDouble();
                Tabung tabung = new Tabung(r2, t2);
                System.out.println("Volume: " + tabung.volume());
                System.out.println("Luas Permukaan: " + tabung.luasPermukaan());
                break;
            case 5:
                System.out.print("Masukkan sisi: ");
                double s2 = input.nextDouble();
                Persegi persegi = new Persegi(s2);
                System.out.println("Luas: " + persegi.luas());
                System.out.println("Keliling: " + persegi.keliling());
                break;
            case 6:
                System.out.print("Masukkan panjang: ");
                double p2 = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double l2 = input.nextDouble();
                PersegiPanjang persegiPanjang = new PersegiPanjang(p2, l2);
                System.out.println("Luas: " + persegiPanjang.luas());
                System.out.println("Keliling: " + persegiPanjang.keliling());
                break;
            case 7:
                System.out.print("Masukkan jari-jari: ");
                double r3 = input.nextDouble();
                Lingkaran lingkaran = new Lingkaran(r3);
                System.out.println("Luas: " + lingkaran.luas());
                System.out.println("Keliling: " + lingkaran.keliling());
                break;
            case 8:
                System.out.print("Masukkan sisi a: ");
                double a = input.nextDouble();
                System.out.print("Masukkan sisi b: ");
                double b = input.nextDouble();
                System.out.print("Masukkan sisi c: ");
                double c = input.nextDouble();
                System.out.print("Masukkan sisi d: ");
                double d = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double t3 = input.nextDouble();
                Trapezium trapezium = new Trapezium(a, b, c, d, t3);
                System.out.println("Luas: " + trapezium.luas());
                System.out.println("Keliling: " + trapezium.keliling());
                break;
            default:
                System.out.println("Pilihan tidak ada");
        }

    }
}