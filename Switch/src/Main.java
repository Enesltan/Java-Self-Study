public class Main {

    public static void main(String[] args) {
        char grade = 'A';

        switch (grade) {
            case 'A':
                System.out.println("A ile geçtiniz.");
                break;
            case 'B':
                System.out.println("B ile geçtiniz.");
                break;
            case 'C':
                System.out.println("C ile geçtiniz.");
                break;
            case 'D':
                System.out.println("Kaldınız.");
                break;
            case 'F':
                System.out.println("Kaldınız!");
                break;
            default:
                System.out.println("Geçersiz Not!");
        }
    }
}
