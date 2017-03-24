/*
 * Name: Youssef Mohamed
 * Version: 0.3
 * Date: 23rd March 2017
 * Description: Determines if a fish can live in the water based on acidity
 */
package youssef;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class AcidRain {

    public static void main(String[] args) {
        //Initializing Variables
        double pH = 0;
        boolean check = false;
        Scanner read = new Scanner(System.in);

        System.out.println("Acid rain is an environmental problem. This program"
                + " determines if the pH level in the water is safe for fish.");
        //Program expects double
        //Simple if/elif/else statement to find which group the pH value falls into.
        while (!check) {
            System.out.print("Input your pH: ");
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
        if (pH > 7.4) {
            System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (pH < 6.4) {
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");

        } else {
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        }
    }
}
