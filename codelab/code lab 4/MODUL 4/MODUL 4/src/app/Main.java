package app;

import perpustakaan.*;

public class Main {
    public static void main(String[] args) {
        // Buat objek buku
        Buku buku1 = new NonFiksi("Pulang", "Tere Liye", "Novel");
        Buku buku2 = new Fiksi("Laut Bercerita", "Leila Salikha Chudori", "historical fiction");

        // Tampilkan info buku
        buku1.displayInfo();
        buku2.displayInfo();
        System.out.println();

        // Buat objek anggota
        Anggota anggota1 = new Anggota("Julian Abi Mustofa Nabila", "175");
        Anggota anggota2 = new Anggota("Wildan Noveliansyah Umasugi", "168");

        // Tampilkan info anggota
        System.out.println("Anggota: " + anggota1.getNama() + " (ID: " + anggota1.getIdAnggota() + ")");
        System.out.println("Anggota: " + anggota2.getNama() + " (ID: " + anggota2.getIdAnggota() + ")");
        System.out.println();

        // Contoh peminjaman dan pengembalian
        anggota1.pinjamBuku("Pulang");
        anggota2.pinjamBuku("Laut Bercerita", 7);
        System.out.println();

        anggota1.kembalikanBuku("Pulang");
        anggota2.kembalikanBuku("Laut Bercerita");
    }
}