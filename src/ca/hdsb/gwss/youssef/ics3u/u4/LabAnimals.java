/*
 * Name: Youssef Mohamed
 * Date: 2nd Apr 2017
 * Version: 0.9
 * Description:
 *      Contains methods that calculate how long an exponentially growing amount
 *      of animals, can live on a linear supply of food
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class LabAnimals {

    public void animalNumber() {
        int hours;
        int numberOfAnimals = getAmount(" number of animals: ");
        int food = getAmount(" amount of food: ");
        int additionOfFood = getAmount(" addition of food per hour: ");
        for (hours = 0; food >= numberOfAnimals; hours++) {
            food -= numberOfAnimals;
            numberOfAnimals *= 2;
            food += additionOfFood;
            
            System.out.format("");

        }
        System.out.println(hours);
    }

    private int getAmount(String type) {
        boolean valid = false;
        int amount = 0;
        Scanner read = new Scanner(System.in);
        while (!valid) {
            try {
                System.out.format("%37s ", "Enter the" + type);
                amount = Integer.parseInt(read.nextLine());
                if (amount < 1); 
                else {
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
