package com.company;
class Sayi{
    int i;
}
public class NesnelerdeAtama {
    public static void main(String[] args) {
       Sayi sayi1 = new Sayi();
       Sayi sayi2 = new Sayi();
       sayi1.i = 10;
       sayi2.i = 20;
        System.out.println("Sayı 1: "+sayi1.i+"\nSayı 2: "+sayi2.i);
        sayi1.i = sayi2.i; // sayi1 referansının ilk işaret ettiği 10 değeri GC tarafından silinecektir.
        System.out.println("Sayı 1: "+sayi1.i+"\nSayı 2: "+sayi2.i);
    }
}
