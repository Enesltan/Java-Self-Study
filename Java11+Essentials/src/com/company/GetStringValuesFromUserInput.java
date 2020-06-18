package com.company;

import java.util.Scanner;

public class GetStringValuesFromUserInput {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Enter a value:");
        var input = scanner.nextLine();
        System.out.println(input);

        System.out.print("Enter first number:");
        var number1 = scanner.nextInt();
        System.out.print("Enter second number:");
        var number2 = scanner.nextInt();
        var sum = number1+number2;
        System.out.println("Total :" + sum);


    }
}
