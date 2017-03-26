/*
 * Name: Youssef Mohamed
 * Version: 0.9
 * Date: 27th March 2017
 * Description: Determines if fish can live in a certain pH
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class AcidRain {

    String level() {
        //Introductory statement
        System.out.println("               _     _   _____       _       \n"
                + "     /\\       (_)   | | |  __ \\     (_)      \n"
                + "    /  \\   ___ _  __| | | |__) |__ _ _ _ __  \n"
                + "   / /\\ \\ / __| |/ _` | |  _  // _` | | '_ \\ \n"
                + "  / ____ \\ (__| | (_| | | | \\ \\ (_| | | | | |\n"
                + " /_/    \\_\\___|_|\\__,_| |_|  \\_\\__,_|_|_| |_|\n");
        
        System.out.println("Acid rain is an environmental problem. This program"
                + " determines if the pH level in the water is safe for fish.");
        //returns the value that pHLevel returns.
        return pHLevel();
    }

    public static String pHLevel() {
        //Initializing Variables
        double pH;
        pH = getpH();
        //Checks the level of pH and assigns a string correlated to the given pH.
        String pHLevel;
        if (pH > 7.4) {
            pHLevel = "TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.";
        } else if (pH < 6.4) {
            pHLevel = "TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.";

        } else {
            pHLevel = "NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.";
        }
        return pHLevel;
    }

    public static double getpH() {
        //Initialzing Variables and Scanner
        Scanner read = new Scanner(System.in);
        boolean validpH = false;
        double pH = 0;
        //Keeps running until user enters valid input for pH.
        while (!validpH) {
            System.out.print("Input your pH: ");
            try {
                pH = read.nextDouble();
                if (pH < 0 || pH > 14) {
                    System.out.println("Sorry, your pH is either too high or too low."
                            + " Please try again.");
                } else {
                    validpH = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Sorry, you entered an invalid value");
                System.err.println(e);
                read.next();
            }
        }
        return pH;
    }
}
