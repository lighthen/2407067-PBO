//latihan polymorphism menu pesanan makanan

package latihan_PBO.latihan_polymorphism_kelas;

public class Menu {
    private String nama;
    private double harga;
    private double hitungTotal() {
        return 0;
    }

    public Menu() {
        this.nama = "";
        this.harga = 0;
    }

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public double hitungHarga() {
        return 0;
    }

    public void tampilkanMenu() {
        System.out.println("Daftar Menu:");
        System.out.println("- Ketoprak");
        System.out.println("- Nasgor");
        System.out.println("- Ajib Kopi");
        System.out.println("- soda gembira");
    }
}

