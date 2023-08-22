public class Dosen {
    private String nip;
    private String nama;
    private String bidang;

    public Dosen(String nip, String nama, String bidang) {
        this.nip = nip;
        this.nama = nama;
        this.bidang = bidang;
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getBidang() {
        return bidang;
    }
}
