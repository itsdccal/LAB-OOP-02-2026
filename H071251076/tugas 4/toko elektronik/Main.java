import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Product> stok = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Pre-load some products to match sample output
        stok.add(new Smartphone("Samsung", 123456, 899.99, 6.5, 256));
        stok.add(new Laptop("Dell", 987654, 1299.99, 16, "Intel Core i7"));
        stok.add(new Camera("Canon", 456789, 699.99, 24, "Telephoto"));

        while (true) {
            tampilkanMenu();
            System.out.print(">>> Pilih menu (1-4):  ");
            int pilihan = sc.nextInt();

            switch (pilihan) {
                case 1: tambahProduk();       break;
                case 2: tampilkanProduk();    break;
                case 3: beliProduk();         break;
                case 4:
                    System.out.println("Terima kasih telah menggunakan layanan kami. Sampai jumpa!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private static void tampilkanMenu() {
        System.out.println("Menu:");
        System.out.println("1. Tambah Produk");
        System.out.println("2. Tampilkan Semua Produk");
        System.out.println("3. Beli Produk");
        System.out.println("4. Keluar");
    }

    private static void tambahProduk() {
        sc.nextLine(); // consume newline
        System.out.print("Masukkan nama produk: ");
        String brand = sc.nextLine();
        System.out.print("Masukkan nomor seri: ");
        int seriesNumber = sc.nextInt();
        System.out.print("Masukkan harga: ");
        double price = sc.nextDouble();

        System.out.println("Pilih tipe produk:");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Camera");
        System.out.print("Pilih tipe produk (1-3): ");
        int tipe = sc.nextInt();

        switch (tipe) {
            case 1: {
                System.out.print("Masukkan ukuran layar (inci): ");
                double screenSize = sc.nextDouble();
                System.out.print("Masukkan kapasitas penyimpanan (GB): ");
                int storage = sc.nextInt();
                stok.add(new Smartphone(brand, seriesNumber, price, screenSize, storage));
                break;
            }
            case 2: {
                System.out.print("Masukkan ukuran RAM (GB): ");
                int ram = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tipe prosesor: ");
                String processor = sc.nextLine();
                stok.add(new Laptop(brand, seriesNumber, price, ram, processor));
                break;
            }
            case 3: {
                System.out.print("Masukkan resolusi (MP): ");
                int resolution = sc.nextInt();
                sc.nextLine();
                System.out.print("Masukkan tipe lensa: ");
                String lensType = sc.nextLine();
                stok.add(new Camera(brand, seriesNumber, price, resolution, lensType));
                break;
            }
            default:
                System.out.println("Tipe tidak valid.");
        }
    }

    private static void tampilkanProduk() {
        System.out.println("Daftar Produk:");
        for (Product p : stok) {
            p.displayInfo();
            System.out.println();
        }
    }

    private static void beliProduk() {
        System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
        int seri = sc.nextInt();
        boolean found = false;
        for (Product p : stok) {
            if (p.getSeriesNumber() == seri) {
                System.out.println("Anda telah membeli produk:");
                p.displayInfo();
                stok.remove(p);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Produk dengan nomor seri tersebut tidak ditemukan.");
        }
    }
}
