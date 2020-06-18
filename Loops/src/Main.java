public class Main {

    public static void main(String[] args) {

	//For Loop

        for (int i = 0; i < 10 ; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        for (int i = 0; i < 10 ; i++) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

    // While Loop (Şart sağlanmaz ise hiç girmez.)
        var i = 1;
        while (i < 10 ){
            //infinite loop - sonsuz döngü
            System.out.println(i);
            i+=2;
        }
        System.out.println("While Döngüsü Bitti");

    //Do-While Loop (Şart sağlanmasa bile 1 kere çalışır.)
        var j = 0;
        do {
            System.out.println("Loglandı");
            j++;
            System.out.println(j);
        }while (j<10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}
