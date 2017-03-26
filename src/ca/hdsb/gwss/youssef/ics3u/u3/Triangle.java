/*
 * Name: Youssef Mohamed
 * Version: 0.9
 * Date: 27th March 2017
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
    //Declaring Object Variables
    public static double sideOne;
    public static double sideTwo;
    public static double sideThree;

    String triangleCheck() {
        String str;

        System.out.println("  _______   _                   _         _____ _               _             \n"
                + " |__   __| (_)                 | |       / ____| |             | |            \n"
                + "    | |_ __ _  __ _ _ __   __ _| | ___  | |    | |__   ___  ___| | _____ _ __ \n"
                + "    | | '__| |/ _` | '_ \\ / _` | |/ _ \\ | |    | '_ \\ / _ \\/ __| |/ / _ \\ '__|\n"
                + "    | | |  | | (_| | | | | (_| | |  __/ | |____| | | |  __/ (__|   <  __/ |   \n"
                + "    |_|_|  |_|\\__,_|_| |_|\\__, |_|\\___|  \\_____|_| |_|\\___|\\___|_|\\_\\___|_|   \n"
                + "                           __/ |                                              \n"
                + "                          |___/                                              \n");
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
        //Runs the method 'getSideLength' with an argument that allows for the prompt
        //to change to match each side length.
        sideOne = getSideLength("first");
        sideTwo = getSideLength("second");
        sideThree = getSideLength("third");
        //simple if/elif/else block that checks what the methods return and assign
        //a corresponding string
        if (getTriangle() && getRightAngleTriangle()) {
            str = "A right-angled triangle can be made.";
        } else if (getTriangle() && !getRightAngleTriangle()) {
            str = "A triangle can be made, however it cannot be Right-Angled.";
        } else {
            str = "A triangle cannot be made.";
        }
        return str;
    }
    //Method for finding if a triangle can be right angled
    public static boolean getRightAngleTriangle() {
        boolean trianglePossible = false;
        if (pow(sideThree, 2) + pow(sideTwo, 2) == pow(sideOne, 2)) {
            trianglePossible = true;
        }
        return trianglePossible;
    }
    //Method for finding if 3 sides can make a triangle
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
    //Method that prompts the user for side lengths
    public static double getSideLength(String sideNumber) {
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
