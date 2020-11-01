package if1.pkg10119030.latihan17.tunjangan;
import java.util.Scanner;
/**
* Nama              :Rendy Dermawan
* NIM               :10119030
* Kelas             :IF1
* Deskripsi Program :
 */
public class Tunjangan {
    final double tunjangan = 0.35;
    final static Scanner scan = new Scanner(System.in);
    double gaji;
    String status;
    
    private void masukkanTunjangan(){
        System.out.println("====Program Tunjangan====");
        System.out.print("Berapa gaji anda perbulan ? \t: Rp.");
        gaji = scan.nextDouble();
        System.out.print("Status anda? (Menikah/Belum) \t: ");
        status = scan.next().toUpperCase();
    }
    private double hitungTunjangan(){
        return (status.equals("MENIKAH")) ? gaji * tunjangan : 0;
    }
    private void tampilGaji(double tunjangan){
        System.out.println("====Hasil Perhitungan Gaji Anda====");
        System.out.println("Gaji Pokok\t\t:"+gaji);
        System.out.println("Tunjangan\t\t:"+tunjangan);
        System.out.println("Total Gaji\t\t:"+(gaji+tunjangan));
    }
    public static void main(String[] args){
        Tunjangan data = new Tunjangan();
        data.masukkanTunjangan();
        double hitung = data.hitungTunjangan();
        data.tampilGaji(hitung);
        System.out.println("(Developed by : Rendy Dermawan)");
    }
}
