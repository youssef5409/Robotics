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

        System.out.println("Compound Investing");
        System.out.println("This program will print out a title table that will"
                + " display the amount of a yearly investment over a period of up"
                + " to 15 years.");
        years = (int) getAmount(" number of years up to 15 (any decimal will be rounded down): ");
        cash = getAmount(" cash invested per year: ");
        interest = getAmount(" interest rate (%): ");

        ORIGINAL_CASH = cash;

        System.out.format(" | %-6s | %-18s | %-10s | %-10s | \n", "Year", "Amount In Account",
                "Interest", "Total");

        for (int i = 1; i <= years; i++) {
            interestAmount = (interest / 100) * cash;
            total = cash + interestAmount;
            System.out.format(" | %-6s | $%17.2f | $%9.2f | $%9.2f | \n", i, cash, interestAmount, total);
            cash = total + ORIGINAL_CASH;
        }
    }

    private double getAmount(String type) {
        boolean valid = false;
        double amount = 0;
        Scanner read = new Scanner(System.in);
        while (!valid) {
            try {
                System.out.format("%71s ", "Enter the" + type);
                amount = Double.parseDouble(read.nextLine());
                //Stops user from entering an investmest of less than $1 or an interest rate of less than 0.01%
                if (amount < 0.01);
                 //Stops user from entering years less than 1 or greater than 15
                if (type.equals(" number of years up to 15 (any decimal will be rounded down): ")) {
                    if (amount >= 1 && amount <= 15) {
                        valid = true;
                    }
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
            }
            if (!valid) {
                System.out.println("Invalid Input.");
            }
        }
        return amount;
    }
}
