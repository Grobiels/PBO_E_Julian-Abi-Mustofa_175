package perpustakaan;

import perpustakaan.interfaces.Peminjaman;

public class Anggota implements Peminjaman {
    private String nama;
    private String idAnggota;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
    }

    @Override
    public void pinjamBuku(String judulBuku) {
        System.out.println(nama + " meminjam buku berjudul: " + judulBuku);
    }

    @Override
    public void kembalikanBuku(String judulBuku) {
        System.out.println(nama + " mengembalikan buku berjudul: " + judulBuku);
    }

    public void pinjamBuku(String judulBuku, int durasiHari) {
        System.out.println(nama + " meminjam buku \"" + judulBuku + "\" selama " + durasiHari + " hari.");
    }

    public String getNama() {
        return nama;
    }

    public String getIdAnggota() {
        return idAnggota;
    }
}