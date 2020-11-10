package pboif2.pkg10116374.latihan35.tunjangan;

/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan menghitung tunjangan
 *
 */
class Karyawan {
     private double gaji;
    private String status;

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    private double hitungTunjangan() {
        return status.equals("Menikah") ? gaji * 0.35 : 0;
    }
    
    private double hitungTotalGaji() {
        return gaji + hitungTunjangan();
    }
    
    public void tampilHasilPerhitungan() {
        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok\t\t: Rp " + gaji);
        System.out.println("Tunjangan\t\t: Rp " + hitungTunjangan());
        System.out.println("Total Gaji\t\t: Rp " + hitungTotalGaji());
        System.out.println("(Developed by : Aufa Ilyasha)");
    }
}
    

