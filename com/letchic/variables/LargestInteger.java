package com.letchic.variables;
    /*
    Exercise3
    Using only the conditional operator, write a program that reads three integers and
    prints the largest. Repeat with Math.max.
    */

import com.letchic.UtilScanner;

public class LargestInteger {
    static private int num1 = UtilScanner.scanner();
    static private int num2 = UtilScanner.scanner();
    static private int num3 = UtilScanner.scanner();
    static private int max;

    public static void maxIf (){
        if (num1>=num2&&num1>=num3){
            max=num1;
        }
        if (num2>=num1&&num2>=num3){
            max=num2;
        }
        if (num3>=num1&&num3>=num2){
            max=num3;
        }
        System.out.println("Largest integer " + max);
    }

    public static void maxMath (){
        max = Math.max(num1,Math.max(num2,num3));
        System.out.println("Largest integer maxMath " + max);
    }
}
