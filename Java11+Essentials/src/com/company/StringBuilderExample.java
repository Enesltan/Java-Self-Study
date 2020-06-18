package com.company;

public class StringBuilderExample {
    public static void main(String[] args) {
        /*
        A string object in java is immutable, its value can't be changed.
        So, when you append or replace a string's value,
        you're really discarding the existing object, and creating a new one in memory.
        To create a complex string from scratch, without leaving a trail of temporary string objects in your wake,
        you can use the string builder class.
        */
        var sb = new StringBuilder("Welcome");
        sb.append(" to Hell!");
        var s = sb.toString();
        System.out.println(s);

        StringBuilder b = new StringBuilder();
        b.append("Shirt Size:")
                .append("M")
                .append(", Qty:")
                .append(4);
        var s2 = b.toString();
        System.out.println(s2);



    }
}
