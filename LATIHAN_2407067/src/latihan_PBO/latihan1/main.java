package latihan_PBO.latihan1;


class Cafe{
    String Nama;
    String Alamat;
}

//kelas main adalah untuk menampilkan program yang akan kita buat
public class main {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe();
        Cafe cafe2 = new Cafe();
        cafe1.Nama = "Kopi Kenangan";
        cafe1.Alamat = "Indramayu";
        cafe2.Nama = "kopte";
        cafe2.Alamat = "IMKOT";

        System.out.println("============cafe1===============");
        System.out.println("nama cafenya adalah" + cafe1.Nama);
        System.out.println("alamatnya ada di kabupaten: " + cafe1.Alamat);
        System.out.println("============cafe2===============");
        System.out.println("nama cafenya adalah " + cafe2.Nama);
        System.out.println("alamatnya ada di daerah: " + cafe2.Alamat);
    }
}
