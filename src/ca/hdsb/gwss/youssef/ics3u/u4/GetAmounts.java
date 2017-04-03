/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author Youss
 */
abstract class GetAmounts {

    abstract double getAmount(String type);
    abstract String exceptionOfType();
}

class LabAnimalAmounts extends GetAmounts {
@Override
String exceptionOfType() {return "urmum";}
    @Override
    double getAmount(String type) {
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
    String exceptionOfType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class CompoundInvestingAmounts extends GetAmounts {

    @Override
    double getAmount(String type) {
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
    String exceptionOfType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Test {

    public static void main(String args[]) {
        GetAmounts b;
        b = new CompoundInvestingAmounts();
        System.out.println("Rate of Interest is: " + b.getAmount("ok") + " %");
        b = new LabAnimalAmounts();
        System.out.println("Rate of Interest is: " + b.getAmount("nah") + " %");
    }
}
