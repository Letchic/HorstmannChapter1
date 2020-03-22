package com.letchic.variables;
    /*
    Exercise4
    Write a program that prints the smallest and largest positive double values.
    Hint: Look up Math.nextUp in the Java API.
    */
public class SmallestAndLargest {
        public static void print() {
        System.out.println("Smallest " + Math.nextUp(0.0));
        System.out.println("Largest " + Double.MAX_VALUE);
    }
}
