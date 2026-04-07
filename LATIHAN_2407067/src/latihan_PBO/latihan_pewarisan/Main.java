package latihan_PBO.latihan_pewarisan;

public class Main {
    public static void main(String[] args) {
        // contoh nilai untuk panjang, lebar, dan tinggi
        double panjang = 10;
        double lebar = 5;
        double tinggi = 4;
        
        // membuat objek BangunRuang dengan nilai panjang, lebar, dan tinggi
        BangunRuang bangunRuang = new BangunRuang(panjang, lebar, tinggi);
        
        // Menampilkan hasil
        System.out.println("Nama : Hendra Nurfatkhurrohman");
        System.out.println("NIM  : 2407067");
        System.out.println("SIKC2B");
        System.out.println("===Program Bangun Datar dan Bangun Ruang===");
        System.out.println("Diketahui:");
        System.out.println("Panjang : " + panjang);
        System.out.println("Lebar   : " + lebar);
        System.out.println("Tinggi  : " + tinggi);
        System.out.println();
        System.out.println("Hasil Perhitungan:");
        System.out.println("a. Luas Alas  : " + bangunRuang.hitungLuas());
        System.out.println("b. Volume     : " + bangunRuang.hitungVolume());
    }
}