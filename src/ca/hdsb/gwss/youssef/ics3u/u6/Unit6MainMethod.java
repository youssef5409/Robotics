/*
 * Name: Youssef Mohamed
 * Date: 28th Apr 2017
 * Version: 0.9
 * Description: 
 *      Comment
 *      
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class Unit6MainMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Introduces the program
        intro();

        //Shows the user their options
        options();

        //switch-case that checks for the integer that the user entered, and runs
        //a respective method
        switch (getApp()) {
            case 1:
                //Calls and uses the Golf method which is originally
                //located in Golf.java
                Golf.golf();
                break;
            case 2:
                //Calls and uses the TemperaturesOfTheWeek method which is originally
                //located in TemperaturesOfTheWeek.java
                TemperaturesOfTheWeek.temperaturesOfTheWeek();
                break;
        }
    }

    private static int getApp() {
        //Initializing variables
        int app = 0;

        //Declaring Objects
        Scanner read = new Scanner(System.in);

        //Do while is not needed, as variable app must be declared in advance.
        //However this is to meet criteria.
        do {
            try {
                System.out.print("What would you like to do?: ");
                app = Integer.parseInt(read.nextLine());
            } catch (NumberFormatException e) {
            }
            if (!(app > 0 && app < 3)) {
                System.out.println("Sorry, you entered an invalid value.");
            }
        } while (!(app > 0 && app < 3));
        System.out.println("\n");
        return app;
    }

    private static void intro() {
        //Introductory Statement
        System.out.println("Welcome to my unit 6 culminative task, I can do only\n"
                + "two things this time, manage golf scores, and manage the\n"
                + "temperatures of the week. However, they are both in GUI Form!\n");
    }

    private static void options() {
        //Statement showing options
        System.out.println("1 - Golf Scores (GUI Version)\n"
                + "2 - Temperatures Of The Week (GUI Version)\n");
    }
}
