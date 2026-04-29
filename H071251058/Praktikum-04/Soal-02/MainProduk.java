import java.util.Scanner;

public class MainProduk {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Produk[] daftarProduk = new Produk[100];

        daftarProduk[0] = new Smartphone("Samsung J2 Prime", "01", 10000000, 12, 256);
        int jumlahProduk = 1;


        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Semua Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");

            System.out.print(">>> Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    System.out.print("Masukkan nama produk: ");
                    String brand = input.nextLine();

                    System.out.print("Masukkan nomor seri: ");
                    String serial = input.nextLine();

                    System.out.print("Masukkan harga: ");
                    double price = input.nextDouble();

                    System.out.println("Pilih tipe produk:");
                    System.out.println("1. Smartphone");
                    System.out.println("2. Laptop");
                    System.out.println("3. Camera");

                    System.out.print("Pilih tipe produk (1-3): ");
                    int tipe = input.nextInt();
                    input.nextLine();

                    if (tipe == 1) {
                        System.out.print("Masukkan ukuran layar: ");
                        double layar = input.nextDouble();
                        System.out.print("Masukkan storage: ");
                        int storage = input.nextInt();

                        daftarProduk[jumlahProduk] = new Smartphone(brand, serial, price, layar, storage);
                        jumlahProduk++;

                    } else if (tipe == 2) {
                        System.out.print("Masukkan processor: ");
                        String proc = input.nextLine();
                        System.out.print("Masukkan RAM: ");
                        int ram = input.nextInt();

                        daftarProduk[jumlahProduk] = new Laptop(brand, serial, price, proc, ram);
                        jumlahProduk++;

                    } else if (tipe == 3) {
                        System.out.print("Masukkan resolusi: ");
                        int res = input.nextInt();
                        input.nextLine();
                        System.out.print("Masukkan jenis lensa: ");
                        String lens = input.nextLine();

                        daftarProduk[jumlahProduk] = new Camera(brand, serial, price, res, lens);
                        jumlahProduk++;
                    }

                    break;

                case 2:
                    System.out.println("\nDaftar Produk:");
                    for (int i = 0; i < jumlahProduk; i++) {
                        daftarProduk[i].tampilkanInfo();
                    }
                    break;

                case 3:
                    System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                    String cari = input.nextLine();

                    boolean ditemukan = false;

                    for (int i = 0; i < jumlahProduk; i++) {
                        if (daftarProduk[i].serialNumber.equals(cari)) {
                            System.out.println("Anda telah membeli produk:");
                            daftarProduk[i].tampilkanInfo();
                            ditemukan = true;
                            break;
                        }
                    }

                    if (!ditemukan) {
                        System.out.println("Produk tidak ditemukan.");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 4);
    }
}