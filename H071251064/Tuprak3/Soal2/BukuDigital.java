public class BukuDigital {
    private String judul;
    private boolean isTersedia;
    protected String idBuku;
    int jumlahHalaman;

    public BukuDigital(String judul, String idBuku){
        this.judul = judul;
        this.idBuku = idBuku;
        this.isTersedia = false;
        this.jumlahHalaman = 100;
    }

    public String getJudul(){
        return judul;
    }
    
    public boolean getIsTersedia(){
        return isTersedia;
    }

    public void setJudul(String inputjudul){
        if (!inputjudul.isEmpty()) {
            System.out.println("Berhasil mengubah judul buku");
        } else {
            System.out.println("Judul buku tidak boleh kosong");
        }
    }

    public void pinjamBuku(){
        if (this.isTersedia){
            this.isTersedia = false;
            System.out.println("Buku berhasil dipinjam");
            updateStatus();
        } else {
            System.out.println("Buku sedang tidak tersedia");
        }
    }

    public void kembalikanBuku(){
        if (!this.isTersedia){
            System.out.println("Tidak ada buku yang dikembalikan");
        } else {
            updateStatus();
        System.out.println("Buku telah dikembalikan");
        }
    }

    private void updateStatus(){
     System.out.println("Sistem: Status buku diperbarui");
        
    }
}