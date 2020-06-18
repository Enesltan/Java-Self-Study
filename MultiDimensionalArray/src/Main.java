public class Main {

    public static void main(String[] args) {

        String [][] sehirler  =new String[3][3];
        sehirler[0][0] = "İstanbul";
        sehirler[0][1] = "Bursa";
        sehirler[0][2] = "Balıkesir";
        sehirler[1][0] = "Ankara";
        sehirler[1][1] = "Kırıkkale";
        sehirler[1][2] = "Yozgat";
        sehirler[2][0] = "Artvin";
        sehirler[2][1] = "Trabzon";
        sehirler[2][2] = "Ordu";
        // nested loop -> iç içe döngüler
        for (int i = 0; i <= 2 ; i++) {
            System.out.println("*************");
            for (int j = 0; j <=2 ; j++) {
                System.out.println(sehirler[i][j]);
            }
        }
    }
}
