
class Orang {
    String nama;

    String cetak(String kata){
        return kata; // rekursif
    }
    // void
    int hitung(int a, int b){
        return a + b;
    }
}
public class Main {

    public static void main(String[] args) throws Exception {
        Orang sirdi = new Orang(); /// inisialisasi objek ke 1
        Orang nando = new Orang(); /// inisialisasi objek ke 2

        String cetakString = sirdi.cetak("hallo saya sirdi");
        int punyaNando = nando.hitung(10, 5);
        
        sirdi.nama = "Lalu Sirdi";
        nando.nama = "nando";

        System.out.println("nama objek sirdi (objek 1) : " + sirdi.nama);
        System.out.println(cetakString);

        System.out.println("nama objek sirdi (objek 2) : " + nando.nama);
        System.out.println(punyaNando);
    }
}
