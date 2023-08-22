public class Mahasiswa {
    private String nim;
    private String nama;
    private int usia;

    public Mahasiswa(String nim, String nama, int usia) {
        this.nim = nim;
        this.nama = nama;
        this.usia = usia;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getUsia() {
        return usia;
    }
}
