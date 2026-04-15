package latihan_PBO.latihan_pewarisan;

public class BangunDatar {
    // dua atribut dengan prinsip enkapsulasi (private)
    private double panjang;
    private double lebar;
    private double tinggi;
    
    // constructor untuk mengisi nilai atribut
    public BangunDatar(double panjang, double lebar, double tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // getter dan Setter untuk enkapsulasi
    public double getPanjang() {
        return panjang;
    }
    
    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
    
    public void setLebar(double lebar) {
        this.lebar = lebar;
    }
    public double getTinggi() {
        return tinggi;
    }
    
    public void setTinggi(double tinggi) {
        this.lebar = tinggi;
    }
    
    // method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }

    public double hitungVolume() {
        return panjang * lebar * tinggi;
    }
}