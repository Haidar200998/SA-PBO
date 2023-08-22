public class Main {
    public static void main(String[] args) {
        Kampus kampus = new Kampus("Universitas Dian Nuswantoro");

        Mahasiswa mahasiswa1 = new Mahasiswa("A11.2019.12268", "Haidar Izzuddin Rabbani", 24);
        Mahasiswa mahasiswa2 = new Mahasiswa("A11.2019.12260", "Elva Izzi Azka", 22);
        Mahasiswa mahasiswa3 = new Mahasiswa("A11.2019.12255", "Daffa Berry Adhani", 23);

        Dosen dosen1 = new Dosen("D001", "Pak Suprayogi", "PBO");
        MataKuliah matkul1 = new MataKuliah("M001", "Pemrograman Berorientasi Objek", dosen1);

        kampus.tambahMahasiswa(mahasiswa1);
        kampus.tambahMahasiswa(mahasiswa2);
        kampus.tambahMahasiswa(mahasiswa3);
        kampus.tambahDosen(dosen1);
        kampus.tambahMataKuliah(matkul1);

        kampus.daftarMahasiswa();
        kampus.daftarDosen();
        kampus.daftarMataKuliah();
    }
}
