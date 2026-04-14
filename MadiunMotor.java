public class MadiunMotor extends LayananTransport {

    public MadiunMotor(String namaDriver, double jarak, double saldo) {
        super(namaDriver, jarak, saldo);
    }

    @Override
    public double hitungTarif() {
        return jarak * 2500;
    }

    @Override
    public void prosesTransaksi(String namaMahasiswa, String nimMahasiswa) {
        System.out.println("transaksi oleh: "+ "-"+ nimMahasiswa + "validasi saldo: " + saldo);
        
        double tarif = hitungTarif();
        if (saldo >= tarif) {
            saldo -= tarif;
            System.out.println("nama driver: " + namaDriver + "jarak: " + jarak + "km" + "tarif: " + tarif + "sisa saldo: " + saldo);
        } else {
            System.out.println("Saldo tidak cukup untuk transaksi.");
        }
    }
}
