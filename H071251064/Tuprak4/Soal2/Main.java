import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produk> stock = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        stock.add(new Smartphone("Samsung", 123456, 899.99, 6.5, 256));
        stock.add(new Laptop("Dell", 987654, 1299.99, 16, "Intel Core i7"));
        stock.add(new Camera("Canon", 456789, 699.99, 24, "Telephoto");              
    boolean berjalan = true;
        while (berjalan) {
            try {
                System.out.println("\nMenu:");
                System.out.println("1. Tambah Produk");
                System.out.println("2. Tampilkan Semua Produk");
                System.out.println("3. Beli Produk");
                System.out.println("4. Keluar");
                System.out.print("\nPilih menu (1-4): ");

                int menu = Integer.parseInt(input.nextLine());

                if (menu == 1) {
                    System.out.print("Masukkan nama produk: ");
                    String brand = input.nextLine();
                    
                    System.out.print("Masukkan nomor seri: ");
                    int sn = Integer.parseInt(input.nextLine());

                    for (Produk p : stock) {
                        if (p.seriesNumber == sn) throw new Exception("Nomor seri sudah ada!");
                    }

                    System.out.print("Masukkan harga: ");
                    double price = Double.parseDouble(input.nextLine());
                    if (price < 0) throw new Exception("Harga tidak boleh negatif!");

                    System.out.print("Pilih tipe (1. Smartphone, 2. Laptop, 3. Camera): ");
                    int tipe = Integer.parseInt(input.nextLine());

                    if (tipe == 1) {
                        System.out.print("Masukkan ukuran layar: ");
                        double size = Double.parseDouble(input.nextLine());
                        System.out.print("Masukkan kapasitas: ");
                        int cap = Integer.parseInt(input.nextLine());
                        if (size < 0 || cap < 0) throw new Exception("Nilai tidak boleh negatif!");
                        stock.add(new Smartphone(brand, sn, price, size, cap));
                    } 
                    else if (tipe == 2) {
                        System.out.print("Masukkan RAM: ");
                        int ram = Integer.parseInt(input.nextLine());
                        if (ram < 0) throw new Exception("RAM tidak boleh negatif!");
                        System.out.print("Masukkan Prosesor: ");
                        String proc = input.nextLine();
                        stock.add(new Laptop(brand, sn, price, ram, proc));
                    } 
                    else if (tipe == 3) {
                        System.out.print("Masukkan Resolusi: ");
                        int res = Integer.parseInt(input.nextLine());
                        if (res < 0) throw new Exception("Resolusi tidak boleh negatif!");
                        System.out.print("Masukkan Lensa: ");
                        String lens = input.nextLine();
                        stock.add(new Camera(brand, sn, price, res, lens));
                    }

                } else if (menu == 2) {
                    System.out.println("Daftar Produk:");
                    if (stock.isEmpty()) System.out.println("- Stok Kosong -");
                    for (Produk p : stock) {
                        p.displayInfo();
                    }

                } else if (menu == 3) {
                    System.out.print("Masukkan nomor seri produk yang ingin dibeli: ");
                    int searchSn = Integer.parseInt(input.nextLine());
                    int indexDitemukan = -1;

                    for (int i = 0; i < stock.size(); i++) {
                        if (stock.get(i).seriesNumber == searchSn) {
                            indexDitemukan = i;
                            break;
                        }
                    }

                    if (indexDitemukan != -1) {
                        System.out.println("Anda telah membeli: " + stock.get(indexDitemukan).brand);
                        stock.remove(indexDitemukan);
                    } else {
                        System.out.println("Produk tidak ditemukan.");
                    }

                } else if (menu == 4) {
                    System.out.println("Sampai jumpa!");
                    berjalan = false;

                } else {
                    System.out.println("Pilihan tidak valid.");
                }

            } catch (Exception e) {
                System.out.println( e.getMessage());
            }
        }
        input.close();
    }
}