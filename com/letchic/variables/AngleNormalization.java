package com.letchic.variables;
    /*
    Exercise2
    Write a program that reads an integer angle (which may be positive or negative)
    and normalizes it to a value between 0 and 359 degrees. Try it first with the %
    operator, then with floorMod.
    */

import com.letchic.UtilScanner;

public class AngleNormalization {
    private static int angle = UtilScanner.scanner();

    public static void normalizeAngle() {
        angle = angle % 360;
        if (angle < 0) angle += 360;
        System.out.println("Normalize Angle " + angle);
    }

    public static void normalizeAngleFM() {
        angle = Math.floorMod(angle, 360);
        if (angle < 0) angle += 360;
        System.out.println("Normalize Angle floorMod " + angle);
    }
}
