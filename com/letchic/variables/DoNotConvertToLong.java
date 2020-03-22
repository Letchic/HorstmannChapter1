package com.letchic.variables;
 /*
    Exercise7
    Write a program that reads in two integers between 0 and 4294967295, stores
    them in int variables, and computes and displays their unsigned sum, difference,
    product, quotient, and remainder. Do not convert them to long values.
    */

import java.math.BigInteger;
import java.util.Scanner;

public class DoNotConvertToLong {

    static private int i1;
    static private int i2 ;

    public static void scanner() {
        Scanner in = new Scanner(System.in);
         i1 = (int) in.nextLong();
         i2 = (int) in.nextLong();
    }

    public static void solution() {
        System.out.println("Sum " + (Integer.toUnsignedLong(i1)+Integer.toUnsignedLong(i2)));
        System.out.println("Difference " + (Integer.toUnsignedLong(i1)-Integer.toUnsignedLong(i2)));
        System.out.println("Product " + (Integer.toUnsignedLong(i1)*Integer.toUnsignedLong(i2)));
        System.out.println("Quotient " + (Integer.toUnsignedLong(i1)/Integer.toUnsignedLong(i2)));
        System.out.println("Remainder " + (Integer.toUnsignedLong(i1)%Integer.toUnsignedLong(i2)));
    }
}
