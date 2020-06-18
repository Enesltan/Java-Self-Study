package com.company;

public class ConvertPrimitiveToStrings {
    public static void main(String[] args) {
        //You can directly convert primitive values with wrapper classes
        //Each of them has a toString method
        String howMany = 20 + " things";
        System.out.println(howMany);

        int intValue = 42;
        var fromInt = Integer.toString(intValue);
        System.out.println(fromInt);

        boolean boolValue = true;
        var fromBool = Boolean.toString(boolValue);
        System.out.println(fromBool);

        long longValue = 10_000_000;
        var fromLong = Long.toString(longValue);
        System.out.println(fromLong);




    }
}
