package com.letchic.string;
    /*
    Exercise8
    Write a program that reads a string and prints all of its nonempty substrings.
    */
import java.util.Scanner;

public class AllSubstrings {
    static private String s;
    public static void scanner() {
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
    }

    public static void printSubstring() {
        for(int i = 0;i<s.length();i++){
            for(int j = s.length();j>i;j--){
                System.out.println(s.substring(i,j));
            }
        }
    }

}
