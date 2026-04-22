package tuprak4.no1;

abstract class BangunRuang extends Bangun{
    BangunRuang(String nama){
        super(nama);
    }

    abstract double volume();
    abstract double luasPermukaan();
}
