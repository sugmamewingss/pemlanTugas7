public abstract class Kue {
    String nama;
    double harga;

    public Kue(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public abstract double hitungHarga();

    @Override
    public String toString() {
        return "Nama Kue: " + nama + "\nHarga: Rp" + hitungHarga();
    }
}
