/*
 * Name: Youssef Mohamed
 * Version: 0.3
 * Date: 23rd March 2017
 * Description: Determines if a year is a leap year or not
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialzing variables
        final int year;
        boolean check = false;
        Scanner read = new Scanner(System.in);

        //Introductory Statements
        System.out.println("A leap year is a year that has an extra day in February"
                + " this program determines if the year you enter is a leap year.");

while (!check) {
            System.out.print("What year is it?: ");
            try {
                pH = read.nextDouble();
                if (pH < 0 || pH > 14) {
                    System.out.println("Sorry, your pH is either too high or too low."
                            + " Please try again.");
                } else {
                    check = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Sorry, you entered an invalid value");
                System.err.println(e);
                read.next();
            }
        }

        //Simple if/else for determining if year is a leap year or not
        if (year % 4 != 0 || (year % 400 != 0 && year % 100 == 0)) {
            System.out.println("It is not a leap year.");
        } else {
            System.out.println("It is a leap year");
        }
    }

}
