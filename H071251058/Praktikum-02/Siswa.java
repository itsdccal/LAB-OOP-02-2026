public class Siswa {
    String nama;
    int nilai;
    Tugas tugas;
    Kelas kelas;

    // Constructor default
    public Siswa() {
        this.nama = "Tanpa Nama";
        this.nilai = 0;
        this.tugas = new Tugas();
        this.kelas = new Kelas();
    }

    public Siswa(String nama, int nilai, Tugas tugas, Kelas kelas) {
        this.nama = nama;
        this.nilai = nilai;
        this.tugas = tugas;
        this.kelas = kelas;
    }
]
    public void kerjakanTugas() {
        System.out.println(nama + " mengerjakan tugas: " + tugas.judul);
        tugas.selesai = true;
        nilai += 10;
    }

    public void bandingkanNilai(Siswa teman) {
        System.out.println("\nPerbandingan nilai:");
        System.out.println(this.nama + " vs " + teman.nama);

        if (this.nilai > teman.nilai) {
            System.out.println(this.nama + " lebih tinggi");
        } else if (this.nilai < teman.nilai) {
            System.out.println(teman.nama + " lebih tinggi");
        } else {
            System.out.println("Nilai sama");
        }
    }

    public void tampilStatus() {
        System.out.println("Nama  : " + nama);
        System.out.println("Nilai : " + nilai);

        kelas.infoKelas();
        tugas.infoTugas();

        System.out.println("------------------------");
    }
}