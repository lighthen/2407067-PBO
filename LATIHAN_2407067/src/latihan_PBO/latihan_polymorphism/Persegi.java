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
    // Persegi cuma butuh 1 parameter (sisi)
    // varA = sisi, varB tidak digunakan (atau bisa juga untuk sisi kedua)
    public Persegi(double sisi) {
        super(sisi);
    }

    // Override hitungLuas: sisi x sisi
    @Override
    public double hitungLuas() {
        return getVarA() * getVarA();
    }

    // Override tampilkan dengan format khusus Persegi
    @Override
    public void tampilkan() {
        System.out.println("Persegi");
        System.out.println("================");
        System.out.println("Sisi: " + getVarA());
        System.out.println("================");
        System.out.println("Luas: " + hitungLuas());
        System.out.println();
    }
}