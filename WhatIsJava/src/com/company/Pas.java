package com.company;
class Harf {
    char c;
}
public class Pas {
    static void f (Harf h){
        h.c = 'z';
    }
    public static void main(String[] args) {
        Harf x = new Harf(); //Harf nesnesi oluşturuldu.İsmi x
        x.c = 'E'; // İsmi x olan Harf nesnesinin c alanına değer atandı.
        System.out.println("Harf x.c(1) : " + x.c);
        f(x);
        System.out.println("Harf x.c(2) : " + x.c);

    }
}
