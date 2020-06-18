package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumericValAsString {
    public static void main(String[] args) {

        var doubleValue = 10_000_000.53;

        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue)); // 10.000.000,53 simple number format

        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intF.format(doubleValue));

        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleValue));

        // Control the locale of your formatting
        var locale = Locale.getDefault();
        var localeFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + localeFormatter.format(doubleValue));

        //Specific Locale

        var locale1 = new Locale("tur" ,"TUR");
        var localeFormatter2 = NumberFormat.getNumberInstance(locale1);
        System.out.println("Number:"+localeFormatter2.format(doubleValue));

        // currency values
        var currencyFormatter = NumberFormat.getCurrencyInstance(locale);
        System.out.println(currencyFormatter.format(doubleValue));

        //Decimal Format

        var df = new DecimalFormat("$00.00");
        System.out.println(df.format(1));

    }
}
