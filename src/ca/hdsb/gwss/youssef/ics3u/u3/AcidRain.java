/*
 * Name: Youssef Mohamed
 * Version: 0.3
 * Date: 23rd March 2017
 * Description: Determines if a fish can live in the water based on acidity
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class AcidRain {

    public static void main(String[] args) {
        //Initializing Variables
        double pH;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Acid rain is an environmental problem ");
        System.out.print("Input pH: ");
        //Program expects double
        pH = read.nextDouble();
        
        //Simple if/elif/else statement to find which group the pH value falls into.
        if (pH > 14 || pH < 0) {
            System.out.println("Invalid Data");
        }
        else if (pH > 7.4) {
            System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
        } else if (pH < 6.4) {
            System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");

        } else {
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        }
    }
}
