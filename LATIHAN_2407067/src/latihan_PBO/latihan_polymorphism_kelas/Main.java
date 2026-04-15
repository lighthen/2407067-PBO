// tampilkan misal ketoprak dengan harga 15000 dan jumlah 2 maka akan mendapatkan hasil sebagai berikut:
// Menu Item: Ketoprak
// Harga per item: 15000.0 dikali jumlah: 2 sama dengan total harga : 30000.0  
// Menu Item: Nasgor
// Harga per item: 20000.0 dikali jumlah: 1 sama dengan total harga : 20000.0
// total harga : 50000.0

package latihan_PBO.latihan_polymorphism_kelas;
public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.tampilkanMenu();

        MenuItem item1 = new MenuItem("Ketoprak", 15000, 2);
        MenuItem item2 = new MenuItem("Nasgor", 20000, 1);
        MenuItem item3 = new MenuItem("Ajib Kopi", 120000, 3);
        MenuItem item4 = new MenuItem("Soda Gembira", 10000, 4);

        System.out.println("==============================");
        System.out.println("Pesanan:");
        System.out.println("Menu Item: " + item1.getNama());
        System.out.println("Harga per item: " + item1.getHarga() + " dikali jumlah pesanan: " + item1.getJumlah() + " sama dengan total harga : " + item1.hitungHarga());

        System.out.println("Menu Item: " + item2.getNama());
        System.out.println("Harga per item: " + item2.getHarga() + " dikali jumlah pesanan: " + item2.getJumlah() + " sama dengan total harga : " + item2.hitungHarga());

        System.out.println("Menu Item: " + item3.getNama());
        System.out.println("Harga per item: " + item3.getHarga() + " dikali jumlah pesanan: " + item3.getJumlah() + " sama dengan total harga : " + item3.hitungHarga());

        System.out.println("Menu Item: " + item4.getNama());
        System.out.println("Harga per item: " + item4.getHarga() + " dikali jumlah pesanan: " + item4.getJumlah() + " sama dengan total harga : " + item4.hitungHarga());
     
        double totalHarga = item1.hitungHarga() + item2.hitungHarga();
        System.out.println("Total harga : " + totalHarga);

    }
}