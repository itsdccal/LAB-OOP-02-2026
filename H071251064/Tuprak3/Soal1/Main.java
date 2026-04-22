public class Main {
    public static void main(String[] args) {
        DompetDigital dompetku = new DompetDigital("ID-56789", "543210");

        System.out.println("ID Nasabah: " + dompetku.getIdNasabah());

        System.out.println("\nMenguji Ubah PIN (PIN Lama Salah):");
        dompetku.setPin("000000", "787878");

        System.out.println("\nMenguji Ubah PIN (Benar):");
        dompetku.setPin("543210", "787878");

        System.out.println("\nMenguji Setor Tunai (Valid):");
        dompetku.setorTunai(500000);

        System.out.println("\nMenguji Setor Tunai (Negatif):");
        dompetku.setorTunai(-50000);

        System.out.println("\nMenguji Tarik Tunai (PIN Salah):");
        dompetku.tarikTunai(100000, "111111");

        System.out.println("\nMenguji Tarik Tunai (PIN Benar):");
        dompetku.tarikTunai(100000, "787878");

        System.out.println("Sisa Saldo: Rp " + dompetku.getSaldo());
    }
}