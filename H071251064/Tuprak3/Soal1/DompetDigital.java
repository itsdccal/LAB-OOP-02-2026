public class DompetDigital {

    private double saldo;
    private String pin;
    protected String idNasabah;
    String statusAkun;

    public DompetDigital(String idNasabah, String pinAwal) {
        this.idNasabah = idNasabah;
        this.pin = pinAwal;
        this.saldo = 0;
        this.statusAkun = "Aktif";
    }

    public String getIdNasabah() {
        return idNasabah;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setPin(String pinLama, String pinBaru) {
        if (this.pin.equals(pinLama)) {
            if (pinBaru.length() == 6) {
                this.pin = pinBaru;
                catatLog("Berhasil: PIN telah diperbarui.");
            } else {
                catatLog("Gagal: PIN baru harus tepat 6 karakter.");
            }
        } else {
            catatLog("Gagal: PIN lama salah.");
        }
    }

    public void setorTunai(double jumlah) {
        if (jumlah > 0) {
            this.saldo += jumlah;
            catatLog("Berhasil: Setor tunai sebesar " + jumlah);
        } else {
            catatLog("Gagal: Jumlah setor tidak boleh negatif.");
        }
    }

    public void tarikTunai(double jumlah, String inputPin) {
        if (!this.pin.equals(inputPin)) {
            catatLog("Gagal: PIN salah untuk penarikan.");
        } else if (jumlah > saldo) {
            catatLog("Gagal: Saldo tidak mencukupi.");
        } else {
            this.saldo -= jumlah;
            catatLog("Berhasil: Tarik tunai sebesar " + jumlah);
        }
    }

    private void catatLog(String pesan) {
        System.out.println("[LOG SISTEM]: " + pesan);
    }
}