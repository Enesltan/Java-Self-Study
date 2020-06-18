package com.company;
/*
uyariYap methodu static değildir.Bu nedenle bu methodun çağırılabilmesi için nesne oluşturulması gerekir.*/
public class TestNormal {
public void uyariYap(){
    System.out.println("Dikkat! Dikkat!");
}

    public static void main(String[] args) {
        TestNormal testNormal = new TestNormal();
        testNormal.uyariYap();
    }
}


