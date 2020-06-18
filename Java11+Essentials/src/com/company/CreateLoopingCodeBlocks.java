package com.company;

public class CreateLoopingCodeBlocks {
    public static void main(String[] args) {
        String [] months= { "January","February","March","April",
                            "May","June","July","August",
                            "September","October","November","December"
        };
        //iterative loop
        for (int i = 0; i < months.length; i++) {
            System.out.println(months[i]);
        }
        System.out.println("***********");

        // foreach loop
        for (var month : months) {
            System.out.println(month);
        }
        System.out.println("***********");

        //while loops
        var whileCounter = 0;
        while (whileCounter < months.length){
            System.out.println(months[whileCounter]);
            whileCounter ++;
        }

        System.out.println("**********");
        //Do-While loop
        // shift-F6 refactor
        var doCounter = 0;
        do {
            System.out.println(months[doCounter]);
            doCounter++;
        }while (doCounter < months.length);

    }
}
