package perpustakaan.interfaces;

public interface Peminjaman {
    void pinjamBuku(String judulBuku);
    void kembalikanBuku(String judulBuku);
}