import java.util.ArrayList;

public class AplikasiMadiunJek {
    public static void main(String[] args) {    
        String nama = "Naila Zahra"; 
        String nim = "22030045";
        ArrayList<LayananTransportasi> layanan = new ArrayList<>();
        
        layanan.add(new MadiunMotor("Pak Budi", 4, 15000));
        layanan.add(new MadiunMobil("Pak Andi", 10, 60000, nim));
        layanan.add(new MadiunMotor("Mas Joko", -3, 10000)); // Tes input minus (otomatis jadi 1km)
        
        // 3. Eksekusi dinamis
        System.out.println("=== SIMULASI MADIUN-JEK ===\n");
        for (LayananTransportasi l : layanan) {
            l.prosesTransaksi(nama, nim);
        }
    }
    }

}