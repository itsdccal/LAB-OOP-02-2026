package tuprak4.no2;

public class Kamera extends Produk {
    private int relousi;
    private String tipeLensa;

    public Kamera(String brand, int nomorSeri, double harga, int relousi, String tipeLensa){
        super(brand, nomorSeri, harga);
        this.relousi = relousi;
        this.tipeLensa = tipeLensa;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tipe: Kamera");
        System.out.println("Resolusi (MP): " + relousi);
        System.out.println("Tipe lensa: " + tipeLensa);
    }
}
