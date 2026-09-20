package model;



public class Pasien {

    private String idPasien;
    private String nama;
    private int umur;
    private String noTelepon;
    private String keluhan;

    // Constructor
    public Pasien(String idPasien, String nama, int umur,
                  String noTelepon, String keluhan) {

        this.idPasien = idPasien;
        this.nama = nama;
        this.umur = umur;
        this.noTelepon = noTelepon;
        this.keluhan = keluhan;
    }

    // Method untuk menampilkan data pasien
    public void tampilkanInfo() {

        System.out.println("=== DATA PASIEN ===");
        System.out.println("ID Pasien   : " + idPasien);
        System.out.println("Nama        : " + nama);
        System.out.println("Umur        : " + umur + " tahun");
        System.out.println("No. Telepon : " + noTelepon);
        System.out.println("Keluhan     : " + keluhan);
    }

    // Getter
    public String getIdPasien() {
        return idPasien;
    }

    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public String getKeluhan() {
        return keluhan;
    }
}