public abstract class LayananTransport {
    protected String namaDriver;
    protected double jarak;
    protected double saldo;


    public LayananTransport(String namaDriver , double jarak, double saldo) {
        this.namaDriver = namaDriver;
        this.jarak = jarak;
        this.saldo = saldo;
    }
    public void setJarak(double jarak) {
        this.jarak = jarak;
         if (jarak <= 0) {
            this.jarak = 1.0; 
        } else {
            this.jarak = jarak;
        }
    }

    public abstract double hitungTarif();
    
    public abstract void prosesTransaksi(String namaMahasiswa, String nimMahasiswa);
}
    

