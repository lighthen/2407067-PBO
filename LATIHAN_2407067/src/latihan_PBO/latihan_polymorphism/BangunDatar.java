package latihan_PBO.latihan_polymorphism;

public class BangunDatar {
    // a. atribut varA dan varB di privatein dulu (encapsulation)
    // biar datanya gak bisa diacak acak langsung dari luar class
    private double varA;
    private double varB;

    // getter & setter buat ngakses variabel private tadi
    public double getVarA() { return varA; }
    public void setVarA(double varA) { this.varA = varA; }
    public double getVarB() { return varB; }
    public void setVarB(double varB) { this.varB = varB; }

    // b. Constructor Overloading: nama sama, parameter beda
    // Constructor 1 parameter: buat bangun yang cuma butuh 1 dimensi (misal sisi persegi)
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0; // defaultin 0 dulu biar gak null
    }

    // constructor kdua parameter: buat bangun yang butuh 2 dimensi (panjang & lebar, alas & tinggi)
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // c. method hitungLuas defaultnya 0 soalnya ini class induk
    // belum tau bentuk spesifiknya jadi return 0 aja dulu dan sesuai tugas
    public double hitungLuas() {
        return 0;
    }

    // d. method tampilkan buat ngeprint hasil
    // nanti di child class bakal dioverride biar outputnya lebih spesifik
    public void tampilkan() {
        System.out.println("Bangun Datar");
        System.out.println("================");
        System.out.println("varA: " + varA);
        System.out.println("varB: " + varB);
        System.out.println("================");
    }
}