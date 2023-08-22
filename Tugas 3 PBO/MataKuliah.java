public class MataKuliah {
    private String kode;
    private String nama;
    private Dosen dosenPengampu;

    public MataKuliah(String kode, String nama, Dosen dosenPengampu) {
        this.kode = kode;
        this.nama = nama;
        this.dosenPengampu = dosenPengampu;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public Dosen getDosenPengampu() {
        return dosenPengampu;
    }
}
