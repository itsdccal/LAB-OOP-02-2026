package Tuprak2;

public class Main {
    public static void main(String[] args) {
        Fotografer fotografer1 = new Fotografer();
        Fotografer fotografer2 = new Fotografer("Alifah", "Fujifilm X-T5", "Wide", 23.0, "UV Filter", "Tote Bag", "No Tripod");

        fotografer1.setNama("Aura");

        fotografer1.lihatStatus();
        fotografer2.lihatStatus();

        fotografer1.tangkapMomen("Model Streetwear");

        fotografer2.lihatStatus(); 
        fotografer1.lihatStatus();

        fotografer2.tangkapMomen("Pemandangan Kota");
        
        fotografer2.lihatStatus();
        fotografer1.lihatStatus();

        fotografer1.Edit();
        fotografer2.Edit();
        fotografer1.lihatStatus();
        fotografer2.lihatStatus();
    }
}