/*
 * Name: Youssef Mohamed
 * Date: 2nd Apr 2017
 * Version: 0.9
 * Description:
 *      Contains methods for calculating compound interest
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class CompoundInvesting1 extends GetAmounts{

    public void money() {
        //Initializing variables
        int years;
        double cash;
        double interest;
        double total;
        double interestAmount;
        final double ORIGINAL_CASH;
        
        //Introductory Statements
        System.out.println("Compound Investing");
        System.out.println("This program will print out a title table that will"
                + " display the amount of a yearly investment over a period of up"
                + " to 15 years.");
        //Assigning variables to previously declared variables
        years = (int) getAmount(" number of years up to 15 (any decimal will be rounded down): ");
        cash = getAmount(" cash invested per year: ");
        interest = getAmount(" interest rate (%): ");
        
        //Assigning the initial investing to a final double this will be useful
        //for future calculations
        ORIGINAL_CASH = cash;
        
        //format statement that begins the table
        System.out.format(" | %-6s | %-18s | %-10s | %-10s | \n", "Year", "Amount In Account",
                "Interest", "Total");
        
        //For loop that shows the user their compound invest cycle
        //for a previously specified amount of years.
        for (int i = 1; i <= years; i++) {
            interestAmount = (interest / 100) * cash;
            total = cash + interestAmount;
            System.out.format(" | %-6s | $%17.2f | $%9.2f | $%9.2f | \n", i, cash, interestAmount, total);
            cash = total + ORIGINAL_CASH;
        }
    }
    
    //Method that takes in 1 argument and can be used to verify all of the users input

    double getAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    double getAmount(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
