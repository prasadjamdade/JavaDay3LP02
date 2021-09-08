package com.day3b;
import java.util.*;
import java.lang.*;

public class CompareLinesEqualGreaterSmaller {
    public static void main(String[] args) {
        Scanner coordinateScan = new Scanner(System.in);    // Object for scanning the inputs

        System.out.println("===Please Enter Coordinates for First Line.===\n" +
                "Please Enter Coordinates for first point as X (Enter) Y (Enter)");
        int pointX1Line1 = coordinateScan.nextInt();
        int pointY1Line1 = coordinateScan.nextInt();
        System.out.println("Please enter Coordinates for second point as X (Enter) Y (Enter)");
        int pointX2Line1 = coordinateScan.nextInt();
        int pointY2Line1 = coordinateScan.nextInt();

        System.out.println("===Please Enter Coordinates for Second Line.===\n" +
                "Please Enter Coordinates for first point as X (Enter) Y (Enter)");
        int pointX1Line2 = coordinateScan.nextInt();
        int pointY1Line2 = coordinateScan.nextInt();
        System.out.println("Please Enter Coordinates for second point as X (Enter) Y (Enter)");
        int pointX2Line2 = coordinateScan.nextInt();
        int pointY2Line2 = coordinateScan.nextInt();

        double lengthOfLine1 = Math.sqrt((Math.pow((pointX2Line1 - pointX1Line1), 2) + Math.pow((pointY2Line1 - pointY1Line1), 2)));
        System.out.println("Length of First Line as per provided points is: " + lengthOfLine1 + " units.");
        String lengthOfLineOne = Double.toString(lengthOfLine1); //converting data type of variable from double to String

        double lengthOfLine2 = Math.sqrt((Math.pow((pointX2Line2 - pointX1Line2), 2) + Math.pow((pointY2Line2 - pointY1Line2), 2)));
        System.out.println("Length of Second Line as per provided points is: " + lengthOfLine2 + " units.");
        String lengthOfLineTwo = Double.toString(lengthOfLine2); //converting data type of variable from double to String

        //.equals method is applicable only on String data types
        if (lengthOfLineOne.compareTo(lengthOfLineTwo) == 0)
            System.out.println("Both lines are equal in length.");
        else if (lengthOfLineOne.compareTo(lengthOfLineTwo) > 0)
            //if lengthOfLineOne < lengthOfLineTwo, it returns negative number;
            // if lengthOfLineOne > lengthOfLineTwo, it returns positive number;
        System.out.println("First line is greater than Second Line.");
        else
            System.out.println("Second line is greater than First Line.");
    }
}
