public class Main {
    public static void main(String[] args) {
        Kue daftarKue[] = new Kue[20];
        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalHargaJadi = 0;
        double totalBerat = 0;
        double totalJumlah = 0;

        daftarKue[0] = new KueJadi("Pastel", 2200, 22);
        daftarKue[1] = new KuePesanan("Serabi", 40000, 3.0);
        daftarKue[2] = new KuePesanan("Lemper", 60000, 2.3);
        daftarKue[3] = new KueJadi("Onde-onde", 2000, 15);
        daftarKue[4] = new KuePesanan("Kue Lumpur", 90000, 1.7);
        daftarKue[5] = new KueJadi("Pukis", 2500, 25);
        daftarKue[6] = new KuePesanan("Bika Ambon", 80000, 1.2);
        daftarKue[7] = new KueJadi("Klepon", 1000, 30);
        daftarKue[8] = new KuePesanan("Kastengel", 150000, 0.8);
        daftarKue[9] = new KuePesanan("Putu Ayu", 70000, 1.8);
        daftarKue[10] = new KueJadi("Nastar", 3000, 20);
        daftarKue[11] = new KueJadi("Getuk", 1500, 18);
        daftarKue[12] = new KuePesanan("Bolu Kukus", 55000, 2.1);
        daftarKue[13] = new KueJadi("Risoles", 3000, 14);
        daftarKue[14] = new KuePesanan("Roti Tawar", 50000, 2.0);
        daftarKue[15] = new KuePesanan("Brownies", 100000, 2.0);
        daftarKue[16] = new KueJadi("Martabak Mini", 4000, 12);
        daftarKue[17] = new KuePesanan("Lapis Legit", 120000, 1.5);
        daftarKue[18] = new KueJadi("Donat", 5000, 10);
        daftarKue[19] = new KueJadi("Kue Cubit", 2000, 20);

        Kue kueMahal = daftarKue[13];

        System.out.println("=== Daftar Semua Kue ===");
        for (Kue kue : daftarKue) {
            System.out.println(kue);
            double harga = kue.hitungHarga();
            totalHarga += harga;

            if (kue instanceof KuePesanan) {
                totalHargaPesanan += harga;
                totalBerat += ((KuePesanan) kue).getBerat();
            } else if (kue instanceof KueJadi) {
                totalHargaJadi += harga;
                totalJumlah += ((KueJadi) kue).getJumlah();
            }

            if (harga > kueMahal.hitungHarga()) {
                kueMahal = kue;
            }
        }
        System.out.println("\n=== Statistik ===");
        System.out.println("Total Harga Semua Kue      : Rp" + totalHarga);
        System.out.println("Total Harga Kue Pesanan    : Rp" + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan    : " + totalBerat + " kg");
        System.out.println("Total Harga Kue Jadi       : Rp" + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi      : " + (int) totalJumlah + " kue");
        System.out.println("\nKue dengan harga tertinggi:");
        System.out.println(kueMahal);
    }
}
