package com.day3b;
import java.util.*;

public class LengthOfLineByCoordinates {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner coordinateScan = new Scanner(System.in);
        System.out.println("Please enter Coordinates for first point as X (Enter) Y (Enter)");
        int pointX1 = coordinateScan.nextInt();
        int pointY1 = coordinateScan.nextInt();
        System.out.println("Please enter Coordinates for second point as X (Enter) Y (Enter)");
        int pointX2 = coordinateScan.nextInt();
        int pointY2 = coordinateScan.nextInt();
        double lengthOfLine = Math.sqrt((Math.pow((pointX2-pointX1), 2) + Math.pow((pointY2-pointY1), 2) ));
        System.out.println("Length of Line as per provided points is: " + lengthOfLine + " units.");
    }
}
