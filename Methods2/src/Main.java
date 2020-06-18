public class Main {

    public static void main(String[] args) {
    String mesaj =sehirVer();
        System.out.println(mesaj);
    String yenimesaj = mesaj.substring(0,2);
        System.out.println(yenimesaj);

        System.out.println("Toplam: "+topla(2,45));
        System.out.println("Toplam: " + topla(1,12,3151,2155,135));
    }
    // void -> geriye bir şey döndürmeyen methodlar
    public static void ekle(){
        System.out.println("Eklendi!");
    }
    public static void sil(){
        System.out.println("Silindi!");
    }
    public static void guncelle(){
        System.out.println("Güncellendi!");
    }
    public static String sehirVer(){
        var a ="Ankara";
        return a;
    }
    public static int topla(int sayi1 , int sayi2){
        int toplam = sayi1+sayi2;
        return toplam;
    }
    public static int topla(int... sayilar) { // variables arguments istediğimiz kadar parametre göndermemizi söyler.
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam = toplam + sayi;
        }
        return toplam;
    }
}
