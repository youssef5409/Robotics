/*
 * Name: Youssef Mohamed
 * Version: 0.9
 * Date: 27th March 2017
 * Description: Determines if a year is a leap year or not
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class LeapYear {
    //This method returns if a year is a leap year or not
    String yearCheck() {
        //Initialzing variables
        double year;
        String leap = "";
        boolean check = false;
        Scanner read = new Scanner(System.in);
        //Introductory Statements
        System.out.println("  _                       __     __             \n"
                + " | |                      \\ \\   / /             \n"
                + " | |     ___  __ _ _ __    \\ \\_/ /__  __ _ _ __ \n"
                + " | |    / _ \\/ _` | '_ \\    \\   / _ \\/ _` | '__|\n"
                + " | |___|  __/ (_| | |_) |    | |  __/ (_| | |   \n"
                + " |______\\___|\\__,_| .__/     |_|\\___|\\__,_|_|   \n"
                + "                  | |                           \n"
                + "                  |_| \n");

        System.out.println("A leap year is a year that has an extra day in February"
                + " this program determines if the year you enter is a leap year.");
        //This is the same verification method that has been used in all the other classes.
        while (!check) {
            try {
                System.out.print("Please enter a year that is greater than 0 AD: ");
                year = read.nextDouble();
                if (year < 0) {
                    System.out.println("Sorry, you entered a year lower than 0");
                } else if (year % 4 != 0 || (year % 400 != 0 && year % 100 == 0)) {
                    leap = "It is not a leap year.";
                    check = true;
                } else {
                    leap = "It is a leap year";
                    check = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Sorry, you entered an invalid value");
                System.err.println(e);
                read.next();
            }
        }
        return leap;
    }
}
