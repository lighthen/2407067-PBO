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
    // Segitiga butuh 2 parameter: alas dan tinggi
    public Segitiga(double alas, double tinggi) {
        super(alas, tinggi);
    }

    // Override hitungLuas: 0.5 x alas x tinggi
    @Override
    public double hitungLuas() {
        return 0.5 * getVarA() * getVarB();
    }

    // Override tampilkan dengan format khusus Segitiga
    @Override
    public void tampilkan() {
        System.out.println("Segitiga");
        System.out.println("================");
        System.out.println("Alas: " + getVarA());
        System.out.println("Tinggi: " + getVarB());
        System.out.println("================");
        System.out.println("Luas: " + hitungLuas());
        System.out.println();
    }
}