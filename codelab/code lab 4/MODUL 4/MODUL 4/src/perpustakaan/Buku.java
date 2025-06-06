package perpustakaan;

public abstract class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public abstract void displayInfo();

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }
}