//a. Gunakan cosntructor sesuai dengan kebutuhan dalam menghitung luas 
// b. Lakukan override pada method hitungLuas dan tampilkan 
// c. Misal ketika akan menghitung luas persegi maka akan mendapatkan hasil sebagai berikut:
// PersegiPanjang
// ==================
// sisi : 5.0
// luas : 25.0
// ===================
// d. Sesuaikan nama variabel dengan bangun datar yang akan dihitung

package latihan_PBO.latihan_polymorphism;
public class PersegiPanjang extends BangunDatar {
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar); // Menggunakan constructor dengan 2 parameter dari kelas induk
    }

    @Override
    public double hitungLuas() {
        double panjang = super.hitungLuas(); // Mengambil nilai varA sebagai panjang
        double lebar = super.hitungLuas(); // Mengambil nilai varB sebagai lebar
        return panjang * lebar; // Luas persegi panjang = panjang * lebar
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("==================");
        System.out.println("panjang : " + super.hitungLuas()); // Menampilkan nilai varA sebagai panjang
        System.out.println("lebar : " + super.hitungLuas()); // Menampilkan nilai varB sebagai lebar
        System.out.println("luas : " + hitungLuas()); // Menampilkan hasil   
        System.out.println("==================");
    }
}                               
