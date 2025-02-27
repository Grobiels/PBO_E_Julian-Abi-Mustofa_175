

import java.util.Objects;
import java.util.Scanner;
public class codelab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Tentukan Login kamu");
        System.out.println("1.Admin");
        System.out.println("2.Mahasiswa");
        System.out.println("pilih user mu :");
        int opsi = input.nextInt();
        input.nextLine();

        if (opsi == 1) {
            // Login Admin
            System.out.print("Masukkan username: ");
            String username = input.nextLine();
            System.out.print("Masukkan password: ");
            String password = input.nextLine();

            // Validasi username dan password
            String validUsername = "Admin175";
            String validPassword = "Password175";

            if (Objects.equals(username, validUsername) && Objects.equals(password, validPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (opsi == 2) {
            // Login Mahasiswa
            System.out.print("Masukkan Nama: ");
            String nama = input.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = input.nextLine();

            // Validasi Nama dan NIM
            String validNama = "Julian Abi Mustofa";
            String validNim = "202410370110175";

            if (Objects.equals(nama, validNama) && Objects.equals(nim, validNim)) {
                System.out.println("Login Mahasiswa berhasil!");

            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            // Pilihan tidak valid
            System.out.println("Pilihan tidak valid.");
        }
    }
}