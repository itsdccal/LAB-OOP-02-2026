public class Main {
    public static void main(String[] args) {
        BukuDigital library = new BukuDigital("Pengantar PBO", "ID-543210");

        System.out.println("\nMenguji Ubah judul buku:");
        library.setJudul("Pengantar Sisfo");

        System.out.println("\nMenguji Ubah judul buku:");
        library.setJudul("");

        System.out.println("\nMenguji pinjam buku:");
        library.pinjamBuku();

        System.out.println("\nMenguji kembalikan buku:");
        library.kembalikanBuku();
    }
}