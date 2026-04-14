public class MadiunMotor extends LayananTransport {
    
    public MadiunMotor(String namaDriver, double jarak, double saldo) {
        super(namaDriver, jarak, saldo);
    }

    @Override
    public double hitungTarif() {
        // Assuming a rate of 5000 per km for motor service
        return jarak * 5000;
    }

    @Override
    public void prosesTransaksi(String namaMahasiswa, String nimMahasiswa) {
        double tarif = hitungTarif();
        if (saldo >= tarif) {
            saldo -= tarif;
            System.out.println("Transaksi berhasil untuk " + namaMahasiswa + " (" + nimMahasiswa + ") dengan driver " + namaDriver + ". Tarif: " + tarif + ". Saldo tersisa: " + saldo);
        } else {
            System.out.println("Saldo tidak cukup untuk transaksi.");
        }
    }
}
