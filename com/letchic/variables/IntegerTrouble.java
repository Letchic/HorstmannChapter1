package com.letchic.variables;
    /*
    Exercise5
    What happens when you cast a double to an int that is larger than the largest
    possible int value? Try it out.
    */
public  class IntegerTrouble {
    static double bigValue = 2*Integer.MAX_VALUE;
    public static void print (){
        System.out.println("Big value to integer "+ (int) bigValue);
    }
}
