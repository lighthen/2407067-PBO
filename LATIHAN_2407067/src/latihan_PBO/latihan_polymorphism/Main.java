package latihan_PBO.latihan_polymorphism;

public class Main {
    public static void main(String[] args) {
        // di poin 3.a: Gunakan satu tipe variabel yang sama (BangunDatar)
        // untuk menyimpan berbagai objek bangun datar yang berbeda
        // ini yang dnamakan polymorphism (menimpa bentuk objek berbeda dengan tipe variabel yang sama)
        
        BangunDatar bangun1 = new Persegi(5);
        BangunDatar bangun2 = new PersegiPanjang(8, 4);
        BangunDatar bangun3 = new Segitiga(10, 6);

        // jalankan method tampilkan untuk setiap objek
        // yh walaupun variabelnya bertipe BangunDatar memanggil versi override dari child class
        bangun1.tampilkan();
        bangun2.tampilkan();
        bangun3.tampilkan();
    }
}
