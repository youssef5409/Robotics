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
public class LabAnimalAmounts extends GetAmounts {
    @Override
    public double LabAnimalAmount(String type) {
        boolean valid = false;
        int amount = 0;
        Scanner read = new Scanner(System.in);
        while (!valid) {
            try {
                System.out.format("%37s ", "Enter the" + type);
                amount = Integer.parseInt(read.nextLine());
                if (amount < 1); else {
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
    public double CompoundInvestAmount(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
