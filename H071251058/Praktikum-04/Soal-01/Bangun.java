
public class Bangun {
    void bangun(){
        System.out.println("Perhitungan bangun datar dan bangun ruang");
    }
}

class BangunDatar extends Bangun{
    double luas(){
        return 0;
    }

    double keliling(){
        return 0;
    }
}

class Persegi extends BangunDatar{
    double sisi;

    Persegi(double x){
        sisi = x;
    }

    double luas(){
        return sisi * sisi;
    }

    double keliling(){
        return 4 * sisi;
    }
}

class PersegiPanjang extends BangunDatar{
    double panjang, lebar;

    PersegiPanjang(double x, double y){
        panjang = x;
        lebar = y;
    }

    double luas(){
        return panjang * lebar;
    }

    double keliling(){
        return 2 * (panjang + lebar);
    }
}

class Lingkaran extends BangunDatar{
    double r;

    Lingkaran(double x){
        r = x;
    }

    double luas(){
        return Math.PI * r * r;
    }

    double keliling(){
        return 2 * Math.PI * r;
    }
}

class Trapezium extends BangunDatar{
    double a, b, c, d, tinggi;

    Trapezium(double x, double y, double z, double w, double t){
        a = x;
        b = y;
        c = z;
        d = w;
        tinggi = t;
    }

    double luas(){
        return 0.5 * (a + b) * tinggi;
    }

    double keliling(){
        return a + b + c + d;
    }
}

class BangunRuang extends Bangun{
    double volume(){
        return 0;
    }

    double luasPermukaan(){
        return 0;
    }
}

class Kubus extends BangunRuang{
    double sisi;

    public Kubus(double x){
        sisi = x;
    }

    double volume(){
        return sisi * sisi * sisi;
    }

    double luasPermukaan(){
        return 6 * sisi * sisi;
    }
}

class Balok extends BangunRuang{
    double panjang, lebar, tinggi;

    Balok(double x, double y, double z){
        panjang = x;
        lebar = y;
        tinggi = z;
    }

    double volume(){
        return panjang * lebar * tinggi;
    }

    double luasPermukaan(){
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);
    }
}

class Tabung extends BangunRuang{
    double r, tinggi;

    Tabung(double x, double y){
        r = x;
        tinggi = y;
    }

    double volume(){
        return Math.PI * r * r * tinggi;
    }

    double luasPermukaan(){
        return 2 * Math.PI * r * (r + tinggi);
    }
}

class Bola extends BangunRuang{
    double r;
    
    Bola(double x){
        r = x;
    }

    double volume(){
        return (4/3) * Math.PI * r * r * r;
    }

    double luasPermukaan(){
        return 4 * Math.PI * r * r;
    }
}



