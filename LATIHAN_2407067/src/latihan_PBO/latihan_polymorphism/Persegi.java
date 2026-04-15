//a. Gunakan cosntructor sesuai dengan kebutuhan dalam menghitung luas 
// b. Lakukan override pada method hitungLuas dan tampilkan 
// c. Misal ketika akan menghitung luas persegi maka akan mendapatkan hasil sebagai berikut:
// Persegi
// ==================
// sisi : 5.0
// luas : 25.0
// ===================
// d. Sesuaikan nama variabel dengan bangun datar yang akan dihitung

package latihan_PBO.latihan_polymorphism;
public class Persegi extends BangunDatar {
    public Persegi(double sisi) {
        super(sisi); // Menggunakan constructor dengan 1 parameter dari kelas induk
    }

    @Override
    public double hitungLuas() {
        double sisi = super.hitungLuas(); // Mengambil nilai varA sebagai sisi
        return sisi * sisi; // Luas persegi = sisi * sisi
    }

    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("==================");
        System.out.println("sisi : " + super.hitungLuas()); // Menampilkan nilai varA sebagai sisi
        System.out.println("luas : " + hitungLuas()); // Menampilkan hasil perhitungan luas
        System.out.println("==================");
    }
}
