import java.util.ArrayList;
public class AplikasiMadiunJek {
    public static void main(String[] args) {    
        String nama = "Naila Zahra "; 
        String nim = "254311006";

         System.out.println("====Transaksi oleh: " + nama + nim+ " ====");
         
        ArrayList<LayananTransport> daftarLayanan = new ArrayList<>();
        daftarLayanan.add(new MadiunMotor("Pak Budi", 4.0, 15000));
        daftarLayanan.add(new MadiunMotor("Mas Joko", -5.0, 10000));        

        for (LayananTransport l : daftarLayanan) {
            l.prosesTransaksi(nama, nim);
        }
    }

}