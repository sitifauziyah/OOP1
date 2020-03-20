public class Mahasiswa {
    String nim;
    String nama;
    String kelas;

    public Mahasiswa(String nimb, String nama, String kelas) {
        nim = nimb;
        this.nama = nama;
        this.kelas = kelas;
    }
    public Mahasiswa() {
        nim = "18090019";
        nama = "Siti Fauziyah";
        kelas = "4D";
    }
    public String info() {
        return nim + ":" + nama + ":" +kelas;
    }
}