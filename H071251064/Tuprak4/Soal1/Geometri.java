class Geometri {
    double hasil1;
    double hasil2;
}

class BangunDatar extends Geometri {
    void tampilkanHasil(String nama, String label1, String label2) {
        System.out.println("Luas " + nama + ": " + hasil1);
        System.out.println("Keliling " + nama + ": " + hasil2);
    }
}

class BangunRuang extends Geometri {
    void tampilkanHasil(String nama) {
        System.out.println("Luas Permukaan " + nama + ": " + hasil1);
        System.out.println("Volume " + nama + ": " + hasil2);
    }
}

class Kubus extends BangunRuang {
    void hitung(double s) {
        this.hasil1 = 6 * (s * s);
        this.hasil2 = (s * s * s);
        super.tampilkanHasil("kubus");
    }
}

class Balok extends BangunRuang {
    void hitung(double p, double l, double t) {
        this.hasil1 = 2 * ((p * l) + (p * t) + (l * t));
        this.hasil2 = p * l * t;
        super.tampilkanHasil("balok");
    }
}

class Bola extends BangunRuang {
    void hitung(double r) {
        this.hasil1 = 4 * Math.PI * r * r;
        this.hasil2 = (4.0/3.0) * 3.14 * r * r * r;
        super.tampilkanHasil("bola");
    }
}

class Tabung extends BangunRuang {
    void hitung(double r, double t) {
        this.hasil1 = 2 * Math.PI * r * (r + t);
        this.hasil2 = Math.PI * r * r * t;
        super.tampilkanHasil("tabung");
    }
}

class Persegi extends BangunDatar {
    void hitung(double s) {
        this.hasil1 = s * s;
        this.hasil2 = 4 * s;
        super.tampilkanHasil("persegi", "Luas", "Keliling");
    }
}

class PersegiPanjang extends BangunDatar {
    void hitung(double p, double l) {
        this.hasil1 = p * l;
        this.hasil2 = 2 * (p + l);
        super.tampilkanHasil("persegi panjang", "Luas", "Keliling");
    }
}

class Lingkaran extends BangunDatar {
    void hitung(double r) {
        this.hasil1 = Math.PI * r * r;
        this.hasil2 = 2 * Math.PI * r;
        super.tampilkanHasil("lingkaran", "Luas", "Keliling");
    }
}

class Trapesium extends BangunDatar {
    void hitung(double s1, double s2, double s3, double s4, double t) {
        this.hasil1 = 0.5 * (s1 + s2) * t;
        this.hasil2 = s1 + s2 + s3 + s4;
        super.tampilkanHasil("trapesium", "Luas", "Keliling");
    }
}