public class Main {

    public static void main(String[] args) {
        String mesaj = "       Bugün hava çok güzel.       ";
        System.out.println(mesaj);

        /*System.out.println("Karakter Sayısı:" + mesaj.length());

        System.out.println("5. Eleman:" + mesaj.charAt(4));

        System.out.println(mesaj.concat(" Tam futbol havası!"));

        System.out.println(mesaj.startsWith("B"));

        System.out.println(mesaj.endsWith("."));

        char [] karakterler = new char[5];
        mesaj.getChars(0,4,karakterler,0);
        System.out.println(karakterler);
*/
        System.out.println(mesaj.indexOf('a')); // karakterin mesajın içerisinde kaçıncı eleman olduğunu yazar.ilk bulduğu a yı verir.

        System.out.println(mesaj.indexOf("çok"));

        System.out.println(mesaj.replace(" ","-"));

        System.out.println(mesaj.substring(6,15));

        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }

        System.out.println(mesaj.toUpperCase());

        System.out.println(mesaj.trim());


    }
}
