package com.letchic.variables;
    /*
    Exercise1
    Write a program that reads an integer and prints it in binary, octal, and
    hexadecimal. Print the reciprocal as a hexadecimal floating-point number.
    */

import com.letchic.UtilScanner;

public class BinOctHex {
    private static Integer number = UtilScanner.scanner();
    public static void print(){
        System.out.println("Binary " + Integer.toBinaryString(number));
        System.out.println("Octal " + Integer.toOctalString(number));
        System.out.println("Hexadecimal " + Integer.toHexString(number));
        Double rec = (double) 1 / number;
        System.out.println("Reciprocal hexadecimal " + Double.toHexString(rec));
    }
}
