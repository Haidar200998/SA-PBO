import java.util.ArrayList;
import java.util.List;

public class Kampus {
    private String nama;
    private List<Mahasiswa> daftarMahasiswa;
    private List<Dosen> daftarDosen;
    private List<MataKuliah> daftarMataKuliah;

    public Kampus(String nama) {
        this.nama = nama;
        daftarMahasiswa = new ArrayList<>();
        daftarDosen = new ArrayList<>();
        daftarMataKuliah = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }

    public void tambahDosen(Dosen dosen) {
        daftarDosen.add(dosen);
    }

    public void tambahMataKuliah(MataKuliah mataKuliah) {
        daftarMataKuliah.add(mataKuliah);
    }

    public void daftarMahasiswa() {
        System.out.println("Daftar Mahasiswa di Kampus " + nama + ":");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("- " + mahasiswa.getNama() + " (NIM: " + mahasiswa.getNim() + ")");
        }
    }

    public void daftarDosen() {
        System.out.println("Daftar Dosen di Kampus " + nama + ":");
        for (Dosen dosen : daftarDosen) {
            System.out.println("- " + dosen.getNama() + " (NIP: " + dosen.getNip() + ")");
        }
    }

    public void daftarMataKuliah() {
        System.out.println("Daftar Mata Kuliah di Kampus " + nama + ":");
        for (MataKuliah mataKuliah : daftarMataKuliah) {
            System.out.println("- " + mataKuliah.getNama() + " (Kode: " + mataKuliah.getKode() + ")");
            System.out.println("  Dosen Pengampu: " + mataKuliah.getDosenPengampu().getNama());
        }
    }
}
