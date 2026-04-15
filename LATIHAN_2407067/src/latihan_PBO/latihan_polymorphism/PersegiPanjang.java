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
    // Persegi panjang butuh 2 parameter: panjang dan lebar
    public PersegiPanjang(double panjang, double lebar) {
        super(panjang, lebar);
    }

    // Override hitungLuas: panjang x lebar
    @Override
    public double hitungLuas() {
        return getVarA() * getVarB();
    }

    // Override tampilkan dengan format khusus Persegi Panjang
    @Override
    public void tampilkan() {
        System.out.println("Persegi Panjang");
        System.out.println("================");
        System.out.println("Panjang: " + getVarA());
        System.out.println("Lebar: " + getVarB());
        System.out.println("================");
        System.out.println("Luas: " + hitungLuas());
        System.out.println();
    }
}