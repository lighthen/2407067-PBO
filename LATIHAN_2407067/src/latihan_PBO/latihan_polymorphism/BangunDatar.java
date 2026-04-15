// A. Memiliki dua atribut bertipe data double dengan nama varA dan varB, serta menggunakan prisip encapsulasi.
// B. Membuat dua buah constructor dengan nama yang sama tapi berbeda jumlah parameter. Constructor pertama berjumlah 2 parameter dan constructor kedua hanya 1 parameter
// C Memiliki method hitungLuas dengan nilai defaul 0. 
// D. Memiliki method tampilkan yang dapat mengenerate program menjadi tampilan seperti berikut:
// Bangun Datar
// ==================
// Var A : 3.0
// Var B : 4.0

package latihan_PBO.latihan_polymorphism;
public class BangunDatar {
    private double varA;
    private double varB;

    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public BangunDatar(double varA) {
        this.varA = varA;
        // this.varB = 0; // Default value for varB
    }

    public double hitungLuas() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("==================");
        System.out.println("Var A : " + varA);
        System.out.println("Var B : " + varB);
    }
}