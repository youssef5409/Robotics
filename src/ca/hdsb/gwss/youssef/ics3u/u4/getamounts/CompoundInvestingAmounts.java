/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u4.getamounts;

import java.util.Scanner;

/**
 *
 * @author GWS-Student
 */
public class CompoundInvestingAmounts extends GetAmounts {

    /**
     *
     * @param type
     * @return
     */
    @Override
    public double CompoundInvestAmount(String type) {
        boolean valid = false;
        double amount = 0;
        Scanner read = new Scanner(System.in);
        while (!valid) {
            try {
                System.out.format("%71s ", "Enter the" + type);
                amount = Double.parseDouble(read.nextLine());
                //Stops user from entering an investmest of less than $1 or an 
                //interest rate of less than 0.01%
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

    @Override
    public double LabAnimalAmount(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}
