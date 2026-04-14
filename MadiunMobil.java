public class MadiunMobil extends LayananTransport {
    private String nim;

    public MadiunMobil(String namaDriver, double jarak, double saldoUser, String nim) {
        super(namaDriver, jarak, saldoUser);
        this.nim = nim;
    }

    @Override
    public double hitungTarif() {
        int digitAkhir = Integer.parseInt(nim.substring(nim.length() - 2)); 
        return (jarak * 5000) + 3000 + (digitAkhir * 100);
    }
    public double hitungTarif(String nimMahasiswa) {
        double tarifDasar = jarak * 5000; 
        int duaDigitNIM = getDuaDigitTerakhirNIM(nimMahasiswa);
    
        double biayaAdmin = 3000 + (duaDigitNIM * 100); 
        
        return tarifDasar + biayaAdmin;
    }

    private int getDuaDigitTerakhirNIM(String nimMahasiswa) {
        return Integer.parseInt(nimMahasiswa.substring(nimMahasiswa.length() - 2));
    }

    @Override
    public void prosesTransaksi(String namaUser, String metodeTransaksi) {
        double tarif = hitungTarif();
        if (saldo >= tarif) {
            saldo -= tarif;
            System.out.println("Transaksi berhasil. Tarif: " + tarif);
        } else {
            System.out.println("Saldo tidak cukup untuk transaksi.");
        }
    }
}
