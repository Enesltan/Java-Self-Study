public class Main {

    public static void main(String[] args) {

        String [] ogrenciler = new String[3]; // 3 elemanlı bir dizi tanımladık.
        ogrenciler[0] = "Enes";
        ogrenciler[1] = "Esma";
        ogrenciler[2] = "Mira";

        for (int i = 0; i <ogrenciler.length ; i++) {
            System.out.println("-> "+ogrenciler[i]);
        }
        System.out.println("****************");
        //
        for (String ogrenci:ogrenciler){
            System.out.println("-->"+ ogrenci);
        }


    }
}
