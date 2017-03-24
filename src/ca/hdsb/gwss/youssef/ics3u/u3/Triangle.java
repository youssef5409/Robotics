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

    String triangleCheck() {
        //Initiliazing Variables
        boolean check = false;
        double sideOne;
        double sideTwo;
        double sideThree;
        double swap;
        String triangle;
        Scanner read = new Scanner(System.in);

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

        //Program asks for input from user
        System.out.print("What is the length of the first side: ");
        while (!check) {
            try {

                sideOne = read.nextDouble();
                if (sideOne <= 0) {
                    System.out.println("Sorry, the value is too low. Please try"
                            + " again: ");
                } else {
                    check = true;
                }

            } catch (InputMismatchException e) {
                System.out.println("Sorry, you entered an invalid value");
                System.err.println(e);
                read.next();
                System.out.print("What is the length of the second side: ");
                sideTwo = read.nextDouble();

                System.out.print("What is the length of the third side: ");
                sideThree = read.nextDouble();

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
                    triangle = "A triangle cannot be made";
                } else {
                    if (pow(sideThree, 2) + pow(sideTwo, 2) == pow(sideOne, 2)) {
                        triangle = "Not only can a Triangle be made, but it can also"
                                + " be a Right-Angled one.";
                    } else {
                        triangle = "A triangle can be made, however it cannot"
                                + " be Right-Angled.";
                    }
                }
                return triangle;
            }

        }
