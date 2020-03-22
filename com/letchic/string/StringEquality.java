package com.letchic.string;
    /*
    Exercise9
    Section 1.5.3, “String Comparison” (page 25) has an example of two strings s and
    t so that s.equals(t) but s != t. Come up with a different example that
    doesn't use substring).
    */

public class StringEquality {
    static String s1 = "God, bless Java";
    static String s2 = new String("God, bless Java");
    public static void print (){
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);
        System.out.println("s1!=s2 " + (s1!=s2));
        System.out.println("s1.equals(s2) " + (s1.equals(s2)));
    }
}
