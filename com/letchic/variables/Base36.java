package com.letchic.variables;
    /*
    Exercise10
    Write a program that produces a random string of letters and digits by generating
    a random long value and printing it in base 36.
     */
import java.math.BigInteger;
import java.util.Random;

public class Base36 {
    public static void print() {
        System.out.println("Random value in base 36: " + Long.toString(new BigInteger(100,new Random()).longValue(),36));
    }
}
