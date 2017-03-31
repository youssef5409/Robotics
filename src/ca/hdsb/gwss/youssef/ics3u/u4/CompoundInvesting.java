/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class CompoundInvesting {

    public void money() {
        int years;
        double cash;
        double interest;
        double total;
        double interestAmount;
        final double ORIGINAL_CASH;

        years = getYear();
        cash = getInvestAmount();
        interest = getInterest();
        ORIGINAL_CASH = cash;
        
        System.out.println("Compound Investing");
        System.out.println("This program will print out a title table that will"
                + " display the amount of a yearly investment over a period of up"
                + " to 15 years.");

        System.out.format("%-10s | %-18s | %-10s | %-7s \n", "Year", "Amount In Account",
                "Interest", "Total");

        for (int i = 1; i <= years; i++) {
            interestAmount = (interest / 100) * cash;
            total = cash + interestAmount;
            System.out.format("%10s | %18.2f | %10.2f | %7.2f \n", i, cash, interestAmount, total);
            cash = total + ORIGINAL_CASH;

        }
    }
    
    private double getInvestAmount() {
        boolean valid = false;
        double money = 0;
        Scanner read = new Scanner(System.in);
        while (!valid) {
            try {
                System.out.print("How much are you investing?: ");
                money = Double.parseDouble(read.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
            }

            if (!valid) {
                System.out.println("Invalid Input.");
            }
        }
        return money;
    }

    private double getInterest() {
        boolean valid = false;
        double interest = 0;
        Scanner read = new Scanner(System.in);
        while (!valid) {
            try {
                System.out.print("Enter the interest rate (%): ");
                interest = Double.parseDouble(read.nextLine());
                valid = true;
            } catch (NumberFormatException e) {
            }

            if (!valid) {
                System.out.println("Invalid Input.");
            }
        }
        return interest;
    }

    private int getYear() {
        boolean valid = false;
        int years = 0;
        Scanner read = new Scanner(System.in);
        while (!valid) {
            try {
                System.out.print("Please enter a year between 1-15: ");
                years = Integer.parseInt(read.nextLine());
                if (years >= 1 && years <= 15) {
                    valid = true;
                }
            } catch (NumberFormatException e) {
            }

            if (!valid) {
                System.out.println("Invalid Input; Year Must be 1-15");
            }
        }
        return years;
    }
}
