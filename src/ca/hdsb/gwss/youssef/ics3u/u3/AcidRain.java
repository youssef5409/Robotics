/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
        System.out.println("Acid rain is an environmental problem. This program"
                + " determines if the pH level in the water is safe for fish.");
        return pHLevel();
    }
    
    public static String pHLevel() {
        double pH;
        pH = getpH();
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
        Scanner read = new Scanner(System.in);
        boolean validpH = false;
        double pH = 0;
        
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
