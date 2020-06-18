public class Main {

    public static void main(String[] args) {
        var sayi1 = 34;
        var sayi2 = 35;
        var sayi3 = 36;
        var enBuyuk = sayi1;

        if (enBuyuk < sayi2){
            enBuyuk = sayi2;
        }
        if(enBuyuk < sayi3){
            enBuyuk = sayi3;
        }
        System.out.println("En büyük sayı: "+ enBuyuk);
    }
}
