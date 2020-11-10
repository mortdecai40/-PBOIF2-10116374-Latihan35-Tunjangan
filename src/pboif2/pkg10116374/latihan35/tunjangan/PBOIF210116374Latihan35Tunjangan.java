package pboif2.pkg10116374.latihan35.tunjangan;
import java.util.Scanner;

/**
 * @author Acromyrmex
 * NAMA                 : TEUKU RIZKI NABIL
 * KELAS                : PBO2
 * NIM                  : 10116374
 * Deskripsi Program    : Program untuk melakukan menghitung tunjangan
 *
 */
public class PBOIF210116374Latihan35Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Karyawan karyawan = new Karyawan();
        
        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        karyawan.setGaji(scanner.nextDouble());
        
        System.out.print("Status Anda? (Menikah/Belum)\t: ");
        karyawan.setStatus(scanner.next());
        
        karyawan.tampilHasilPerhitungan();
    }
    
}
