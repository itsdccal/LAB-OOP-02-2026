package tuprak4.no2;

public class Smartphone extends Produk {
    private double ukuranLayar;
    private int ukuranPenyimpanan;

    public Smartphone(String brand, int nomorSeri, double harga, double ukuranLayar, int ukuranPenyimpanan){
        super(brand, nomorSeri, harga);
        this.ukuranLayar = ukuranLayar;
        this.ukuranPenyimpanan = ukuranPenyimpanan;
    }

    @Override // pake override agar isi displayinfo subclass bisa muncul bersama displayinfo parent class
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tipe: Smartphone");
        System.out.println("Ukuran layar (inci): " + ukuranLayar);
        System.out.println("Kapasitas Penyimpanan (GB): " + ukuranPenyimpanan);
    }
}
