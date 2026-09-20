package model;

public class Dokter extends Manager {

    private String spesialisasi;

    // Constructor
    public Dokter(String id, String nama, String noTelepon,
                  String spesialisasi) {

        super(id, nama, noTelepon);
        this.spesialisasi = spesialisasi;
    }

    // Override method dari Manager
    @Override
    public void tampilkanInfo() {

        System.out.println("=== DATA DOKTER ===");

        super.tampilkanInfo();

        System.out.println("Spesialisasi : " + spesialisasi);
    }

    // Getter
    public String getSpesialisasi() {
        return spesialisasi;
    }
}
