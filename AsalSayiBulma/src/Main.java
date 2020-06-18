public class Main {

    public static void main(String[] args) {
        // Asal sayı ; kendinden ve 1'den başka pozitif tam böleni olmayan sayı
        int number = 13;
        int remainder = number % 2; // 25 in 2 ye bölümünden kalan
        //System.out.println(remainder);
        boolean isPrime = true;

        if (number < 1){
            System.out.println("Geçersiz sayı");
            return;
        } else if (number ==1){
            System.out.println("Sayı asal değildir!");
            return;// bağlı bulunduğumuz methodu bitirir.
        }

        for (int i = 2; i < number ; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }

        if (isPrime){ // if(isPrime == true) ile aynı
            System.out.println("Sayı Asaldır!");
        }else{
            System.out.println("Sayı Asal Değildir!");
        }



    }
}
