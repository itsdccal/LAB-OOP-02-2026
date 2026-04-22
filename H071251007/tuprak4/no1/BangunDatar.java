package tuprak4.no1;

abstract class BangunDatar extends Bangun{
    public BangunDatar(String nama){
        super(nama);
    }

    abstract double luas();
    abstract double keliling();
}
