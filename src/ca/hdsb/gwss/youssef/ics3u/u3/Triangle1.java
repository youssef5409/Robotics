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
public class Triangle1 {

    public static double sideOne;
    public static double sideTwo;
    public static double sideThree;

    String triangleCheck() {
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

        sideOne = getSideLength( "first" );
        return "hi";
        
    }
    public static String getRightAngleTriangle() {
        
        String trianglePossible = "";
        if (pow(sideThree, 2) + pow(sideTwo, 2) == pow(sideOne, 2)) {
            trianglePossible = "It can also"
                    + " be a Right-Angled one.";
        } else {
            trianglePossible = "However it cannot"
                    + " be Right-Angled.";
    } 
        return trianglePossible;
    }
    public static String getTriangle() {

        double swap;
        String trianglePossible = "";
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
            trianglePossible = "A triangle cannot be made";
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

    public static double getSideOne() {
        boolean validSideLength = false;
        Scanner read = new Scanner(System.in);
        while (!validSideLength) {
            try {
                System.out.print("What is your first side length?: ");
                sideOne = read.nextDouble();
                if (sideOne >= 0) {
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
        return sideOne;
    }

    public static double getSideTwo() {
        boolean validSideLength = false;
        Scanner read = new Scanner(System.in);
        while (!validSideLength) {
            try {
                System.out.print("What is your second side length?: ");
                sideTwo = read.nextDouble();
                if (sideTwo >= 0) {
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
        return sideTwo;
    }

    public static double getSideThree() {
        boolean validSideLength = false;
        Scanner read = new Scanner(System.in);
        while (!validSideLength) {
            try {
                System.out.print("What is your third side length?: ");
                sideThree = read.nextDouble();
                if (sideThree >= 0) {
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
        return sideThree;
    }
}
