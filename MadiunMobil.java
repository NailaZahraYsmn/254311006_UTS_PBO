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

    @Override
    public void prosesTransaksi(String nama, String nimOutput) {
        System.out.println("Transaksi oleh " + nama + " - " + nimOutput + " Validasi Saldo: ");
        
        double tarif = hitungTarif();
        if (saldo >= tarif) {
            saldo -= tarif;
            System.out.println("- Driver: " + namaDriver + " | Jarak: " + jarak + "km | Total Bayar: Rp" + tarif + " | Sisa Saldo: Rp" + saldo);
        } else {
            System.out.println("Gagal: Saldo tidak mencukupi untuk perjalanan ini!");
        }
        System.out.println("--------------------------------------------------");
    }
}
