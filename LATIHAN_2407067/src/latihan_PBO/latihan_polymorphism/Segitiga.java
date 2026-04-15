//a. Gunakan cosntructor sesuai dengan kebutuhan dalam menghitung luas 
// b. Lakukan override pada method hitungLuas dan tampilkan 
// c. Misal ketika akan menghitung luas persegi maka akan mendapatkan hasil sebagai berikut:
// Segitiga
// ==================
// sisi : 5.0
// luas : 25.0
// ===================
// d. Sesuaikan nama variabel dengan bangun datar yang akan dihitung

package latihan_PBO.latihan_polymorphism;
public class Segitiga extends BangunDatar {
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi); // Menggunakan constructor dengan 2 parameter dari kelas induk
    }

    @Override
    public double hitungLuas() {
        double alas = super.hitungLuas(); // Mengambil nilai varA sebagai alas
        double tinggi = super.hitungLuas(); // Mengambil nilai varB sebagai tinggi
        return 0.5 * alas * tinggi; // Luas segitiga = 0.5 * alas * tinggi
    }

    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("==================");
        System.out.println("alas : " + super.hitungLuas()); // Menampilkan nilai varA sebagai alas
        System.out.println("tinggi : " + super.hitungLuas()); // Menampilkan nilai varB sebagai tinggi
        System.out.println("luas : " + hitungLuas()); // Menampilkan hasil perhitungan luas
        System.out.println("==================");       
    }
}   