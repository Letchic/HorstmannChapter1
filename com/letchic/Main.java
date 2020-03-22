package com.letchic;

import com.letchic.arrays.Lottery;
import com.letchic.arrays.MagicSquare;
import com.letchic.string.AllSubstrings;
import com.letchic.string.StringEquality;
import com.letchic.variables.*;

public class Main {
    public static void main(String[] args) {

        //-------Exercise1---------------
        BinOctHex.print();
        //-------------------------------

        //-------Exercise2---------------
        AngleNormalization.normalizeAngle();
        AngleNormalization.normalizeAngleFM();
        //-------------------------------

        //-------Exercise3---------------
        LargestInteger.maxIf();
        LargestInteger.maxMath();
        //-------------------------------

        //-------Exercise4---------------
        SmallestAndLargest.print();
        //-------------------------------

        //-------Exercise5---------------
        IntegerTrouble.print();
        //-------------------------------

        //-------Exercise6---------------
        UsingBigInteger.factorial();
        //-------------------------------

        //-------Exercise7---------------
        DoNotConvertToLong.scanner();
        DoNotConvertToLong.solution();
        //-------------------------------

        //-------Exercise8---------------
        AllSubstrings.scanner();
        AllSubstrings.printSubstring();
        //-------------------------------

        //-------Exercise9---------------
        StringEquality.print();
        //-------------------------------

         //-------Exercise10--------------
        Base36.print();
        //-------------------------------

        //-------Exercise13--------------
        Lottery.getCombination();
        //-------------------------------

        //-------Exercise14--------------
        MagicSquare m = new MagicSquare();
        m.result();
        //-------------------------------
 }
}