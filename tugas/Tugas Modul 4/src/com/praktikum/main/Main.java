package com.praktikum.main;

import com.praktikum.user.Admin;
import com.praktikum.user.Mahasiswa;
import com.praktikum.user.User;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        User user = null;

        System.out.println("=== Sistem Login ===");
        System.out.println("1. Login Admin");
        System.out.println("2. Login Mahasiswa");
        System.out.println("3. Keluar");
        System.out.print("Masukkan pilihan anda: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Masukkan username admin: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password admin: ");
            String password = scanner.nextLine();

            user = new Admin("admin175", "abil175");
            if (user.login(username, password)) {
                System.out.println("Login berhasil sebagai " + user.getUsername());
                user.displayAppMenu();
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }

        } else if (choice == 2) {
            System.out.print("Masukkan username mahasiswa: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password mahasiswa: ");
            String password = scanner.nextLine();

            user = new Mahasiswa("Julian Abi Mustofa Nabila", "202410370110175");
            if (user.login(username, password)) {
                System.out.println("Login berhasil sebagai " + user.getUsername());
                user.displayAppMenu();
            } else {
                System.out.println("Login gagal. Username atau password salah.");
            }

        } else if (choice == 3) {
            System.out.println("Keluar dari program...");
            System.exit(0);
        } else {
            System.out.println("Pilihan tidak valid.");
}
}
}