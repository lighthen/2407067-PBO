package latihan_PBO.latihan_polymorphism;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;

        bangunDatar = new Persegi(5.0);
        bangunDatar.tampilkan();

        bangunDatar = new PersegiPanjang(5.0, 4.0);
        bangunDatar.tampilkan();

        bangunDatar = new Segitiga(5.0, 4.0);
        bangunDatar.tampilkan();
    }
}
// a. Gunakan satu tipe variabel yang sama untuk menyimpan berbagai objek bangun datar yang berbeda. 


