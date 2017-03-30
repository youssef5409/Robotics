/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class CompoundInvesting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double CASH = 150.00;
        boolean valid = false;
        double years;
        Scanner read = new Scanner(System.in);
        System.out.println("Compound Investing");
        System.out.println("This program will print out a title table that will"
                + " display the amount of a yearly investment over a period of up"
                + " to 15 years.");
        while (!valid) {
            try {
                System.out.print("Please enter, a year between 1-15 ");
                years = Double.parseDouble(read.nextLine());
                if (years >= 1 && years <= 15) {
                    valid = true;
                }
            } catch (Exception e) {
            }

            if (!valid) {
                System.out.println("Invalid Input; Year Must be 1-15");
            }
        }
//////////////////////////////////////////////////
        do {
            try {
                System.out.print("Please enter a year that is greater than 0 AD: ");
                years = read.nextDouble();
                if (years < 0 || years > 15) {
                    System.out.println("Sorry, you entered a year lower than 0 "
                            + "or greater than 15");
                    validYear = false;
                } else {
                    validYear = true;
                    System.out.print("Enter the yearly investment: ");

                }
            } catch (InputMismatchException e) {
                validYear = false;
                System.out.println("Sorry, you entered an invalid value");
                System.err.println(e);
                read.next();
            }
        } while (!validYear);
    }
}
