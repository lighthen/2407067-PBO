//harga dikali jumlah
package latihan_PBO.latihan_polymorphism_kelas;

public class MenuItem extends Menu {
    private int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }

    @Override
    public double hitungHarga() {
        return getHarga() * jumlah; 
    }
}

