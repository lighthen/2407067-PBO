package latihan_PBO.latihan_pewarisan;

public class BangunDatar {
    // dua atribut dengan prinsip enkapsulasi (private)
    private double panjang;
    private double lebar;
    
    // constructor untuk mengisi nilai atribut
    public BangunDatar(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
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
    
    // method untuk menghitung luas
    public double hitungLuas() {
        return panjang * lebar;
    }
}