abstract class PerangkatElektronik {
    protected String merk;
    protected int dayaListrik;

    public PerangkatElektronik(String merk, int dayaListrik) {
        this.merk = merk;
        this.dayaListrik = dayaListrik;
    }

    public abstract void cekFungsi();

    public void infoPower() {
        System.out.println("[" + merk + "] sedang menyedot daya sebesar " + dayaListrik + " Watt.");
    }
}

interface InteraksiInternet {
    void hubungkanWiFi();
}

interface KontrolSuara {
    void prosesPerintah(String perintah);
}

class SmartLamp extends PerangkatElektronik implements KontrolSuara {
    public SmartLamp(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    public void cekFungsi() {
        System.out.println("Fungsi Utama: Pencahayaan ruangan.");
    }

    @Override
    public void prosesPerintah(String perintah) {
        if (perintah.equalsIgnoreCase("NYALA")) {
            System.out.println("Lampu berpijar");
        } else {
            System.out.println("Perintah suara tidak dikenali oleh lampu.");
        }
    }
}

class SmartCCTV extends PerangkatElektronik implements InteraksiInternet {
    public SmartCCTV(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    public void cekFungsi() {
        System.out.println("Fungsi Utama: Keamanan dan pengawasan.");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println("Mengirim data ke server...");
    }
}

class SmartSpeaker extends PerangkatElektronik implements InteraksiInternet, KontrolSuara {
    public SmartSpeaker(String merk, int dayaListrik) {
        super(merk, dayaListrik);
    }

    @Override
    public void cekFungsi() {
        System.out.println("Fungsi Utama: Multimedia dan pusat kontrol.");
    }

    @Override
    public void hubungkanWiFi() {
        System.out.println("Speaker terhubung ke cloud Spotify/YouTube.");
    }

    @Override
    public void prosesPerintah(String perintah) {
        System.out.println("Speaker memproses perintah suara: " + perintah);
    }
}