package ewallet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("PEMBUATAN AKUN BARU");
        System.out.print("Masukkan ID Nasabah: ");
        String id = input.nextLine();
        
        String pin;
        DompetDigital dompet;
        
        while (true) {
            System.out.print("Masukkan PIN awal (harus 6 digit angka): ");
            pin = input.nextLine();
            
            dompet = new DompetDigital(id, pin);
            
            // cek klo akun udh dibuat
            if (dompet.getSaldo() >= 0 && pin.length() == 6) {
                // cek utk pin valid dgn tes getsaldo
                // karena ndk ada getter utk pin, asumsikan sukses krna ndk ada eror
                System.out.println("Akun berhasil dibuat!\n");
                break;
            }
            
            System.out.println("Silakan coba lagi.\n");
        }
        
        System.out.println("SETOR TUNAI");
        System.out.print("Jumlah setor tunai: Rp");
        double setor = input.nextDouble();
        dompet.setorTunai(setor);
        
        input.nextLine(); // consume newline

        System.out.println("\nTARIK TUNAI");
        System.out.print("Masukkan PIN untuk tarik tunai: ");
        String pinTarik = input.nextLine();
        System.out.print("Jumlah tarik tunai: Rp");
        double tarik = input.nextDouble();
        dompet.tarikTunai(pinTarik, tarik);
        
        input.nextLine(); 
        
        System.out.println("\nUBAH PIN");
        System.out.print("Masukkan PIN lama: ");
        String pinLama = input.nextLine();
        System.out.print("Masukkan PIN baru (6 digit angka): ");
        String pinBaru = input.nextLine();
        boolean berhasil = dompet.ubahPin(pinLama, pinBaru);
        System.out.println("Ubah PIN: " + (berhasil ? "Berhasil" : "Gagal"));
        
        System.out.println("\nINFO AKUN");
        System.out.println("ID Nasabah: " + dompet.getIdNasabah());
        System.out.println("Saldo akhir: Rp" + dompet.getSaldo());
        
        input.close();
    }
}