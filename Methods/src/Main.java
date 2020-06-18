public class Main {

    public static void main(String[] args) {
        sayiBul();
    }

    public static void sayiBul() {
        int[] sayilar = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int aranacak = 15;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesaj1();
        } else {
            mesaj2();
        }
    }

    public static void mesaj1() {
        System.out.println("Sayı mevcuttur.");
    }

    public static void mesaj2() {
        System.out.println("Sayı mevcut değildir.");
    }
}
