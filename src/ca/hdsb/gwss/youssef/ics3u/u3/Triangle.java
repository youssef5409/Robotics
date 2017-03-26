/*
 * Name: Youssef Mohamed
 * Version: 0.3
 * Date: 23rd March 2017
 * Description: Determines if 3 lines can make a triangle and if it can be right angled
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import static java.lang.Math.pow;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class Triangle {

    public static double sideOne;
    public static double sideTwo;
    public static double sideThree;

    String triangleCheck() {
        String str;
        //Long introductory statement, but criteria dictates this must be included
        System.out.println("Three numbers represent the sides of a triangle when\n"
                + "the sum of any two sides is greater than the third side.\n"
                + "This program has the user enter three lengths of sides and\n"
                + "determines whether the figure is a triangle or not. It will\n"
                + "also determine if said triangle can be Right-Angled.\n"
                + "A Right-Angled triangle has the property that when the values\n"
                + "of the lengths of the sides are squared, the sum of two\n"
                + "smaller values is equal to the larger value.  This program\n"
                + "asks the user to enter three values and then determines\n"
                + "whether a triangle is created or not, and if a triangle is\n"
                + "created, it will check if it is Right-Angled.\n");

        sideOne = getSideLength("first");
        sideTwo = getSideLength("second");
        sideThree = getSideLength("third");
        if (getTriangle() && getRightAngleTriangle()) {
            str =  "A right-angled triangle can be made.";
        }
        else if (getTriangle() && !getRightAngleTriangle()) {
            str = "A triangle can be made, however it cannot be Right-Angled.";
        }
        else {
            str = "A triangle cannot be made.";
        }
        return str;
    }
    public static boolean getRightAngleTriangle() {
        boolean trianglePossible = false;
        if (pow(sideThree, 2) + pow(sideTwo, 2) == pow(sideOne, 2)) {
            trianglePossible = true;
    } 
        return trianglePossible;
    }
    
    public static boolean getTriangle() {
        double swap;
        boolean trianglePossible = true;
        if (sideTwo > sideOne) {
            swap = sideOne;
            sideOne = sideTwo;
            sideTwo = swap;
        }
        if (sideThree > sideOne) {
            swap = sideOne;
            sideOne = sideThree;
            sideThree = swap;
        }
        if (sideOne >= (sideTwo + sideThree)) {
            trianglePossible = false;
        }
        return trianglePossible;
    }
    
    public static double getSideLength( String sideNumber ) {
        boolean validSideLength = false;
        double side = -1;
        Scanner read = new Scanner(System.in);
        while (!validSideLength) {
            try {
                System.out.print("What is your " + sideNumber + " side length?: ");
                side = read.nextDouble();
                if (side >= 0) {
                    validSideLength = true;
                } else {
                    System.out.println("Sorry, your side length is invalid,"
                            + " please try again");
                }
            } catch (InputMismatchException e) {
                System.out.println("Sorry, you entered an invalid value");
                System.err.println(e);
                read.next();
            }
        }
        return side;
    }
}