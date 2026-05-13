package tuprak4.no2;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static ArrayList<Produk> daftar_Produk = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    // ‼️nanti tanya kak haikal knp pakai static, lalu apa itu arraylist? fungsinya apa? apa bedanya dengan []?

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== Menu: ===");
            System.out.println("1. Tambah Produk");
            System.out.println("2. Tampilkan Produk");
            System.out.println("3. Beli Produk");
            System.out.println("4. Keluar");
            System.out.print("> Pilih menu (1-4): ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    tampilkanProduk();
                    break;
                case 3:
                    beliProduk();
                    break;
                case 4:
                    System.out.println("Menutup Program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 4);
        
        input.close();
    }

    public static void tambahProduk(){
        System.out.print("Masukkan nama produk: ");
        String brand = input.nextLine();

        int seri;
        while (true) {
            System.out.print("Masukkan nomor seri: ");
            seri = input.nextInt();

            boolean ditemukan = false;
            for (Produk p : daftar_Produk){
                if (p.getNomorSeri() == seri){
                    ditemukan = true;
                    System.out.println("Nomor seri sudah terdaftar! masukkan nomor baru...");
                    break;
                }
            }

            if (!ditemukan){
                break;
            }
        }

        System.out.print("Masukkan harga: ");
        double harga = input.nextDouble();
        while (harga <= 0) {
            System.out.println("Harga tidak boleh negatif! silahkan input ulang...");
            System.out.print("Masukkan harga: ");
            harga = input.nextDouble();
        }

        System.out.println("Pilih tipe produk: ");
        System.out.println("1. Smartphone");
        System.out.println("2. Laptop");
        System.out.println("3. Kamera");
        System.out.print("Pilihan: ");
        int tipe = input.nextInt();

        if (tipe == 1){
            System.out.print("Masukkan ukuran layar (inci): ");
            double layar = input.nextDouble();
            while (layar <= 0) {
                System.out.println("Ukuran layar tidak boleh negatif! silahkan input ulang...");
                System.out.print("Masukkan ukuran layar (inci): ");
                layar = input.nextDouble();
            }

            System.out.print("Masukkan ukuran penyimpanan (GB): ");
            int penyimpanan = input.nextInt();
            while (penyimpanan <= 0) {
                System.out.println("Penyimpanan tidak boleh negatif! silahkan input ulang...");
                System.out.print("Masukkan ukuran penyimpanan (GB): ");
                penyimpanan = input.nextInt();
            }
            daftar_Produk.add(new Smartphone(brand, seri, harga, layar, penyimpanan));

        } else if (tipe == 2){
            System.out.print("Masukkan RAM (GB): ");
            int ram = input.nextInt();
            while (ram <= 0) {
                System.out.println("RAM tidak boleh negatif! silahkan input ulang...");
                System.out.print("Masukkan RAM (GB): ");
                ram = input.nextInt();
            }
            input.nextLine();
            System.out.print("Masukkan tipe processor: ");
            String prosesor = input.nextLine();
            daftar_Produk.add(new Laptop(brand, seri, harga, ram, prosesor));

        } else if (tipe == 3){
            System.out.print("Masukkan resolusi (MP): ");
            int resolusi = input.nextInt();
            while (resolusi < 0) {
                System.out.println("Resolusi tidak boleh negatif! silahkan input ulang...");
                System.out.print("Masukkan resolusi (MP): ");
                resolusi = input.nextInt();
            }
            input.nextLine();
            System.out.print("Masukkan tipe lensa: ");
            String lensa = input.nextLine();
            daftar_Produk.add(new Kamera(brand, seri, harga, resolusi, lensa));
        }

        System.out.println("Produk berhasil ditambahkan!");
        // note: kalau mau pakai input.nextLine() sehabis memakai input.nextInt() 
        //       maka harus hapus enter dulu dengan cara input.nextLine() lagi tanpa variabel/atribut.
    }

    public static void tampilkanProduk(){
        if (daftar_Produk.isEmpty()){
            System.out.println("Belum ada produk tersedia...");
            return;
        }

        System.out.println("\n=== Daftar Produk ===");
        for (Produk p : daftar_Produk){
            p.displayInfo(); // ‼️nanti tanya kak haikal soal polymorphism
            System.out.println("--------------------");
        }
    }

    public static void beliProduk() {
        if (daftar_Produk.isEmpty()){
            System.out.println("Belum ada produk tersedia...");
            return;
        }

        boolean ditemukan = false;
        while (!ditemukan) {
            System.out.print("\nMasukkan nomor seri produk yang ingin dibeli: ");
            int cari = input.nextInt();

            for (Produk p : daftar_Produk) {
                if (p.getNomorSeri() == cari) {
                    System.out.println("Anda telah membeli produk: ");
                    p.displayInfo();
                    System.out.println("Pembelian berhasil!");
                    ditemukan = true; 
                    return;
                }
            }
            System.out.println("Produk tidak ditemukan. Silakan coba lagi.");
        }
    }
}