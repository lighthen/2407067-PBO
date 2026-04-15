package latihan_PBO.latihan_pewarisan;

import latihan_PBO.latihan1.string;

// class bangunDatar (inheritance)
public class BangunRuang extends BangunDatar {
    // atribut tinggi
    private double tinggi;
    
    // constructor
    public BangunRuang(double panjang, double lebar, double tinggi) {
        // memanggil constructor parent class
        super(panjang, lebar, tinggi);
        this.tinggi = tinggi;
    }
    
    // getter dan Setter untuk tinggi
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    // method untuk menghitung volume
    // volume = Luas alas * tinggi
    // public double hitungVolume() {
    //     // menggunakan method hitungLuas() dari parent class
    //     return hitungLuas() * tinggi;
    // }
    @Override
    public double hitungLuas() {
        // luas alas = panjang * lebar
        return getPanjang() * getLebar();
    }

    @Override
    public double hitungVolume() {
        // volume = luas alas * tinggi
        return hitungLuas() * tinggi;
    }
}