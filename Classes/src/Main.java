public class Main {

    public static void main(String[] args) {
        //Classlar referans tiptir.
        //Bir nesneyi new'lemek bellek açısından pahalıdır.
        CustomerManager customerManager = new CustomerManager(); //customerManager türünde bir nesne ürettim.
        CustomerManager customerManager2 = new CustomerManager();
        //customerManager=customerManager2;
        customerManager.ekle();
        customerManager.guncelle();
        customerManager.sil();

        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        System.out.println(sayi2);

        int[] sayilar1 = new int[]{1,2,3}; // int[] sayilar1 = {1,2,3} bu şekildede yazılabilir.
        int[] sayilar2= new  int[]{4,5,6};
        sayilar2 = sayilar1; //Bellekte bir nesne ancak iki değişken bu bir nesneyi tutuyor.
        sayilar1[0]=10; // Diziler referans tiptir.
        System.out.println(sayilar2[0]);
    }
}
