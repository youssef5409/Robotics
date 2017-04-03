/*
 * Name: Youssef Mohamed
 * Date: 2nd Apr 2017
 * Version: 0.9
 * Description:
 *      Contains methods for calculating compound interest
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

import ca.hdsb.gwss.youssef.ics3u.u4.getamounts.CompoundInvestingAmounts;

/**
 *
 * @author 1mohamedyou
 */
public class CompoundInvesting1 extends CompoundInvestingAmounts {

    public void money() {
        //Initializing variables
        double total;
        double interestAmount;
        double years;
        double cash;
        double interest;
        final double ORIGINAL_CASH;
        CompoundInvestingAmounts invest = new CompoundInvestingAmounts();

        //Introductory Statements
        System.out.println("Compound Investing");
        System.out.println("This program will print out a title table that will"
                + " display the amount of a yearly investment over a period of up"
                + " to 15 years.");

        //Assigning variables to previously declared variables
        years = invest.CompoundInvestAmount(" number of years up to 15 (any decimal will be rounded down): ");
        cash =  invest.CompoundInvestAmount(" cash invested per year: ");
        interest = invest.CompoundInvestAmount(" interest rate (%): ");

        //Assigning the initial investing to a final double, this will be useful
        //for future calculations
        ORIGINAL_CASH = cash;

        //format statement that begins the table
        System.out.format(" | %-6s | %-21s | %-12s | %-13s | \n", "Year", "Amount In Account",
                "Interest", "Total");

        //For loop that shows the user their compound invest cycle
        //for a previously specified amount of years.
        for (int i = 1; i <= years; i++) {
            interestAmount = (interest / 100) * cash;
            total = cash + interestAmount;
            System.out.format(" | %-6s | $%20.2f | $%10.2f | $%12.2f | \n", i, cash, interestAmount, total);
            cash = total + ORIGINAL_CASH;
        }
    
    }


    @Override
    public double LabAnimalAmount(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

}
}
