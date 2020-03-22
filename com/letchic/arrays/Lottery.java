package com.letchic.arrays;
    /*
    Exercise13
    Write a program that prints a lottery combination, picking six distinct numbers
    between 1 and 49. To pick six distinct numbers, start with an array list filled with
    1...49. Pick a random index and remove the element. Repeat six times. Print the
    result in sorted order.
     */
import java.util.ArrayList;
import java.util.List;

public class Lottery {
    static List<Integer> allNumbers = new ArrayList<>();
    public static void getCombination() {
        for (int i = 1; i < 50; i++) {
            allNumbers.add(i);
        }
        for (int i = 0; i < 6; i++) {
            int index = (int) (1 + Math.random() * (49 - i));
            System.out.print(allNumbers.remove(index) + " ");
        }
    }
}
