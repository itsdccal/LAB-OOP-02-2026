 package tuprak3;

public class DompetDigital {
    private String pin;
    private double saldo;
    protected String id_nasabah;
    String status_akun = "aktif";

    public DompetDigital(String pin, String id_nasabah){
        this.pin = pin;
        this.id_nasabah = id_nasabah;
        this.status_akun = "aktif";
        this.saldo = 0;
    }

    public String getId_nasabah(){
        return id_nasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setPin(String pin_lama, String pin_baru) {
        if (!this.pin.equals(pin_lama)){
            System.out.println("Pin lama salah! Perubahan ditolak.");
        } else if (pin_baru.length() != 6){
            System.out.println("Pin harus 6 digit! Perubahan ditolak.");
        } else {
            this.pin = pin_baru;
            System.out.println("Pin berhasil diubah!");
        }
    }

    public void Setor(double jumlah){
        if (jumlah <= 0){
            System.out.println("\nJumlah setor tidak boleh 0/negatif!");
            Riwayat_transaksi("Penyetoran gagal - setoran tidak valid");
        } else {
            saldo += jumlah;
            System.out.println(" ");
            System.out.printf("Penyetoran sebesar %.0f ditambahkan.\n", jumlah);
            Riwayat_transaksi("Penyetoran berhasil!");
        }
    }

    public void Tarik(double jumlah, String input_pin){
        if (!this.pin.equals(input_pin)){
            System.out.println("\nPin salah!");
            Riwayat_transaksi("Penarikan gagal - pin salah");
        } else if (jumlah > saldo){
            System.out.println("\nSaldo yang dimiliki kurang!");
            Riwayat_transaksi("Penarikan gagal - saldo kurang");
        } else {
            saldo -= jumlah;
            System.out.println(" ");
            System.out.printf("Penarikan sebesar %.0f berhasil!\n", jumlah);
            Riwayat_transaksi("Penarikan berhasil!");
        }
    }

    private void Riwayat_transaksi(String notif){
        System.out.println("[Riwayat]: " + notif);
    }
}
