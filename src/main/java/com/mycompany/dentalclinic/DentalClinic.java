package com.mycompany.dentalclinic;

import java.util.ArrayList;
import java.util.Scanner;
import model.Dokter;
import model.Pasien;
import model.Manager;

public class DentalClinic {

    static Scanner input = new Scanner(System.in);

    // Menyimpan daftar dokter
    static ArrayList<Dokter> daftarDokter = new ArrayList<>();

    // Menyimpan daftar pasien
    static ArrayList<Pasien> daftarPasien = new ArrayList<>();

    public static void main(String[] args) {

        // =====================================
        // DATA DOKTER YANG SUDAH TERSEDIA
        // =====================================

        Dokter dokter1 = new Dokter(
                "D001",
                "Dr. Andi",
                "081234567890",
                "Dokter Gigi Umum"
        );

        Dokter dokter2 = new Dokter(
                "D002",
                "Dr. Siti",
                "082345678901",
                "Spesialis Ortodonti"
        );

        Dokter dokter3 = new Dokter(
                "D003",
                "Dr. Budi",
                "083456789012",
                "Spesialis Gigi Anak"
        );

        // Memasukkan dokter ke daftar
        daftarDokter.add(dokter1);
        daftarDokter.add(dokter2);
        daftarDokter.add(dokter3);

        // =====================================
        // MENU UTAMA
        // =====================================

        int pilihan;

        do {

            tampilkanMenu();

            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {

                case 1:
                    daftarPasien();
                    break;

                case 2:
                    tampilkanPasien();
                    break;

                case 3:
                    tampilkanDokter();
                    break;

                case 4:
                    pilihDokter();
                    break;

                case 5:
                    tampilkanInformasiKlinik();
                    break;

                case 6:
                    System.out.println("\n=================================");
                    System.out.println("Terima kasih telah menggunakan");
                    System.out.println("Sistem Manajemen Klinik Gigi.");
                    System.out.println("=================================");
                    break;

                default:
                    System.out.println("\nPilihan tidak tersedia!");

            }

        } while (pilihan != 6);

        input.close();
    }

    // =====================================
    // MENU UTAMA
    // =====================================

    public static void tampilkanMenu() {

        System.out.println("\n======================================");
        System.out.println("       MANAJEMEN KLINIK GIGI");
        System.out.println("======================================");
        System.out.println("1. Daftar Sebagai Pasien");
        System.out.println("2. Lihat Data Pasien");
        System.out.println("3. Lihat Daftar Dokter");
        System.out.println("4. Pilih Dokter");
        System.out.println("5. Informasi Klinik");
        System.out.println("6. Keluar");
        System.out.println("======================================");
    }

    // =====================================
    // DAFTAR PASIEN
    // =====================================

    public static void daftarPasien() {

        System.out.println("\n=================================");
        System.out.println("        DAFTAR SEBAGAI PASIEN");
        System.out.println("=================================");

        System.out.print("ID Pasien       : ");
        String id = input.nextLine();

        System.out.print("Nama Pasien     : ");
        String nama = input.nextLine();

        System.out.print("Umur            : ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("No. Telepon     : ");
        String noTelepon = input.nextLine();

        System.out.print("Keluhan         : ");
        String keluhan = input.nextLine();

        // Membuat objek pasien
        Pasien pasien = new Pasien(
                id,
                nama,
                umur,
                noTelepon,
                keluhan
        );

        // Menambahkan pasien ke daftar
        daftarPasien.add(pasien);

        System.out.println("\nData pasien berhasil ditambahkan!");
        System.out.println("Silakan pilih dokter yang ingin Anda kunjungi.");
    }

    // =====================================
    // MENAMPILKAN DATA PASIEN
    // =====================================

    public static void tampilkanPasien() {

        System.out.println("\n=================================");
        System.out.println("          DAFTAR PASIEN");
        System.out.println("=================================");

        if (daftarPasien.isEmpty()) {

            System.out.println("Belum ada pasien yang terdaftar.");

            return;
        }

        for (int i = 0; i < daftarPasien.size(); i++) {

            System.out.println("\nPasien ke-" + (i + 1));

            daftarPasien.get(i).tampilkanInfo();

            System.out.println("---------------------------------");
        }
    }

    // =====================================
    // MENAMPILKAN DAFTAR DOKTER
    // =====================================

    public static void tampilkanDokter() {

        System.out.println("\n=================================");
        System.out.println("          DAFTAR DOKTER");
        System.out.println("=================================");

        for (int i = 0; i < daftarDokter.size(); i++) {

            Dokter dokter = daftarDokter.get(i);

            System.out.println("\nDokter ke-" + (i + 1));
            dokter.tampilkanInfo();

            System.out.println("---------------------------------");
        }
    }

    // =====================================
    // MEMILIH DOKTER
    // =====================================

    public static void pilihDokter() {

        // Memeriksa apakah pasien sudah terdaftar
        if (daftarPasien.isEmpty()) {

            System.out.println("\nAnda belum terdaftar sebagai pasien.");
            System.out.println("Silakan pilih menu 1 terlebih dahulu.");

            return;
        }

        System.out.println("\n=================================");
        System.out.println("          PILIH DOKTER");
        System.out.println("=================================");

        // Menampilkan pasien
        System.out.println("\nDaftar Pasien:");

        for (int i = 0; i < daftarPasien.size(); i++) {

            System.out.println(
                    (i + 1) + ". " +
                    daftarPasien.get(i).getNama()
            );
        }

        System.out.print("\nPilih pasien: ");
        int pilihPasien = input.nextInt();
        input.nextLine();

        // Validasi pasien
        if (pilihPasien < 1 || pilihPasien > daftarPasien.size()) {

            System.out.println("Pilihan pasien tidak valid!");

            return;
        }

        Pasien pasien = daftarPasien.get(pilihPasien - 1);

        // Menampilkan dokter
        System.out.println("\nDokter yang tersedia:");

        for (int i = 0; i < daftarDokter.size(); i++) {

            Dokter dokter = daftarDokter.get(i);

            System.out.println(
                    (i + 1) + ". " +
                    dokter.getNama() +
                    " - " +
                    dokter.getSpesialisasi()
            );
        }

        System.out.print("\nPilih dokter yang ingin dikunjungi: ");
        int pilihDokter = input.nextInt();
        input.nextLine();

        // Validasi dokter
        if (pilihDokter < 1 || pilihDokter > daftarDokter.size()) {

            System.out.println("Pilihan dokter tidak valid!");

            return;
        }

        Dokter dokter = daftarDokter.get(pilihDokter - 1);

        // Menampilkan hasil pilihan
        System.out.println("\n=================================");
        System.out.println("       PEMILIHAN DOKTER");
        System.out.println("=================================");
        System.out.println("Nama Pasien   : " + pasien.getNama());
        System.out.println("Keluhan       : " + pasien.getKeluhan());
        System.out.println("Dokter        : " + dokter.getNama());
        System.out.println("Spesialisasi  : " + dokter.getSpesialisasi());
        System.out.println("No. Telepon   : " + dokter.getNoTelepon());
        System.out.println("=================================");
        System.out.println("Dokter berhasil dipilih!");
    }

    // =====================================
    // INFORMASI KLINIK
    // =====================================

    public static void tampilkanInformasiKlinik() {

        System.out.println("\n=================================");
        System.out.println("        INFORMASI KLINIK");
        System.out.println("=================================");
        System.out.println("Nama   : Klinik Gigi Sehat");
        System.out.println("Layanan: Pemeriksaan dan Perawatan Gigi");
        System.out.println("Jumlah Dokter: " + daftarDokter.size());
        System.out.println("Jumlah Pasien: " + daftarPasien.size());
        System.out.println("=================================");
    }
}