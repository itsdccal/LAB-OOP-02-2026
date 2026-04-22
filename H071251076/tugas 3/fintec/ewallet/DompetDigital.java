package ewallet;

public class DompetDigital {
    private String pin;
    private double saldo;
    protected String idNasabah;
    int maksTransaksiHarian;
    
    public DompetDigital(String idNasabah, String pinAwal) {
        if (!isPinValid(pinAwal)) {
            System.out.println("ERROR: PIN harus 6 digit angka!");
            this.idNasabah = idNasabah;
            this.pin = "000000";
            this.saldo = 0.0;
            this.maksTransaksiHarian = 10;
            logAktivitas("Gagal membuat akun: PIN tidak valid");
            return;
        }
        
        this.idNasabah = idNasabah;
        this.pin = pinAwal;
        this.saldo = 0.0;
        this.maksTransaksiHarian = 10;
        logAktivitas("Akun baru dibuat untuk nasabah: " + idNasabah);
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getIdNasabah() {
        return idNasabah;
    }
    
    public boolean ubahPin(String pinLama, String pinBaru) {
        if (!isPinValid(pinBaru)) {
            logAktivitas("Gagal mengubah PIN: PIN baru harus 6 digit angka");
            System.out.println("PIN baru harus 6 digit angka!");
            return false;
        }
        
        if (pinLama.equals(this.pin)) {
            this.pin = pinBaru;
            logAktivitas("PIN berhasil diubah untuk: " + idNasabah);
            return true;
        } else {
            logAktivitas("Gagal mengubah PIN: PIN lama salah");
            System.out.println("PIN lama salah!");
            return false;
        }
    }
    
    public void setorTunai(double jumlah) {
        if (jumlah <= 0) {
            logAktivitas("Setor tunai gagal: jumlah tidak valid (" + jumlah + ")");
            System.out.println("Jumlah setor harus positif!");
            return;
        }
        
        saldo += jumlah;
        logAktivitas("Setor tunai berhasil: +Rp" + jumlah + 
                    ", Saldo sekarang: Rp" + saldo);
        System.out.println("Setor tunai berhasil! Saldo: Rp" + saldo);
    }
    
    public void tarikTunai(String pinInput, double jumlah) {
        if (!pinInput.equals(this.pin)) {
            logAktivitas("Tarik tunai gagal: PIN salah untuk " + idNasabah);
            System.out.println("PIN salah!");
            return;
        }
        
        if (jumlah > saldo) {
            logAktivitas("Tarik tunai gagal: saldo tidak cukup (Saldo: " + 
                        saldo + ", Diminta: " + jumlah + ")");
            System.out.println("Saldo tidak mencukupi!");
            return;
        }
        
        if (jumlah <= 0) {
            logAktivitas("Tarik tunai gagal: jumlah tidak valid");
            System.out.println("Jumlah tarik harus positif!");
            return;
        }
        
        saldo -= jumlah;
        logAktivitas("Tarik tunai berhasil: -Rp" + jumlah + 
                    ", Saldo sekarang: Rp" + saldo);
        System.out.println("Tarik tunai berhasil! Saldo: Rp" + saldo);
    }
    
    private boolean isPinValid(String pin) {
        
        //kalau pin kosong atau panjang bukan 6, gagal
        if (pin == null || pin.length() != 6) {
            return false;
        }
        
        //loop utk cek seluruh pin utk char non-angka
        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        
        return true;
    }
    
    private void logAktivitas(String pesan) {
        System.out.println("[LOG] " + java.time.LocalDateTime.now() + " - " + pesan);
    }
}