public class Main {

    public static void main(String[] args) {
        //A-E,I-İ,U-Ü,O-Ö
        char harf = 'A';

        switch (harf) {
            case 'A':
            case 'I':
            case 'U':
            case 'O':
                System.out.println("Kalın sesli harf");
                break;
            default:
                System.out.println("İnce sesli Harf");
        }
    }
}