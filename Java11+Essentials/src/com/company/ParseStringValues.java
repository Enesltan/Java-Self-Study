package com.company;
/*
Java's string class includes many methods, you can use to parse data and find substring
*/
public class ParseStringValues {
    public static void main(String[] args) {
        var s1 = "Welcome to California!";
        System.out.println("Length of string : " + s1.length());//find out how long that string is

        int position = s1.indexOf("California"); // find out that California starts at
        System.out.println("The position is " + position);

        var sub = s1.substring(11);
        System.out.println(sub);

        String s2 = "Welcome!      ";
        var length = s2.length();
        System.out.println(length);
        String trimmed = s2.trim();
        System.out.println(trimmed.length());

    }
}
