package tuprak4.no2;

public class Laptop extends Produk {
    private int ukuranRAM;
    private String tipeProsesor;

    public Laptop(String brand, int nomorSeri, double harga, int ukuranRAM, String tipeProsesor){
        super(brand, nomorSeri, harga);
        this.ukuranRAM = ukuranRAM;
        this.tipeProsesor = tipeProsesor;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tipe: Laptop");
        System.out.println("RAM (GB): " + ukuranRAM);
        System.out.println("Prosesor: " + tipeProsesor);
    }
}
