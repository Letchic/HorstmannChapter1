package com.letchic.variables;
/*
Exercise6
Write a program that computes the factorial n! = 1 × 2 × ... × n, using
BigInteger. Compute the factorial of 1000.
*/

import java.math.BigInteger;

public  class UsingBigInteger {
    public static void factorial()
    {
        BigInteger f = BigInteger.ONE;
        for (int i = 1; i <=1000; ++i) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of 1000 "+f);
    }
}
