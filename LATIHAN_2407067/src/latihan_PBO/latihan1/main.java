package latihan_PBO.latihan1;


class Cafe{
    String Nama;
    String Alamat;

    Cafe(String Nama, String Alamat){
        this.Nama = Nama;
        this.Alamat = Alamat;
        System.out.println("nama cafenya adalah " + this.Nama);
        System.out.println("alamatnya ada di daerah: " + this.Alamat);
    }
}

//kelas main adalah untuk menampilkan program yang akan kita buat
public class main {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("janjijiwa", "indramayu");
        Cafe cafe2 = new Cafe("kopte", "imkot");
        // cafe1.Nama = "Kopi Kenangan";
        // cafe1.Alamat = "Indramayu";
        // cafe2.Nama = "kopte";
        // cafe2.Alamat = "IMKOT";

        // System.out.println("============cafe1===============");
        // System.out.println("nama cafenya adalah" + cafe1.Nama);
        // System.out.println("alamatnya ada di kabupaten: " + cafe1.Alamat);
        // System.out.println("============cafe2===============");
        // System.out.println("nama cafenya adalah " + cafe2.Nama);
        // System.out.println("alamatnya ada di daerah: " + cafe2.Alamat);
    }
}
