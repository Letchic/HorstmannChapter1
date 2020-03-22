package com.letchic.arrays;
 /*
    Exercise14
    Write a program that reads a two-dimensional array of integers and determines
    whether it is a magic square (that is, whether the sum of all rows, all columns, and
    the diagonals is the same). Accept lines of input that you break up into individual
    integers, and stop when the user enters a blank line. For example, with the input
    16 3 2 13
    5 10 11 8
    9 6 7 12
    4 15 14 1
    (Blank line)
    your program should respond affirmatively.
    */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MagicSquare {
    private List<ArrayList> rows = new ArrayList<>();

    public MagicSquare() {
        Scanner in = new Scanner(System.in);
        String str;
        while (!(str=in.nextLine()).equals("")) {
            ArrayList<Integer> numbers = new ArrayList<>();
            for (String part : str.split("\\s")) {
                numbers.add(Integer.parseInt(part));
            }
            rows.add(numbers);
        }
    }
    public void result(){
        int size=rows.size();
        int [] rowSum = new int [size];
        int [] columnSum = new int [size];
        int diagonal1 = 0;
        int diagonal2 = 0;


        for(int i=0;i<size;i++){
            ArrayList<Integer> temp = rows.get(i);
            for(int j=0;j<size;j++){
                rowSum[i]+=temp.get(j);
                columnSum[j]+=temp.get(j);
                if(i==j) diagonal1+=temp.get(j);
                if(i==(size-1-j)) diagonal2+=temp.get(j);
            }
        }
        boolean res=true;
        for(int i=0;i<size;i++){
            if(rowSum[i]!=rowSum[0]) res=false;
            if(columnSum[i]!=columnSum[0]) res=false;
            if(diagonal1!=diagonal2) res=false;
        }
        if(res) {
            System.out.println("This is magic square");
        }
        else {
            System.out.println("This is not magic square");
        }
    }
}
