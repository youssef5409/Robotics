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
        //Initialzing variables
        int hours;
        int numberOfAnimals;
        int food;
        int additionOfFood;
        
        //Introductory statement
        System.out.println("Lab Animals");
        System.out.println("At present there are X animals in the lab and enough"
                + " food for Y animals.  At the end of every hour the population"
                + " doubles, and enough food is added to support Z more animals."
                + " During any hour the animals will eat enough food for only"
                + " themselves. The program will determine when the population"
                + " will outgrow the food supply.");
        
        //Getting user info
        numberOfAnimals = getAmount(" number of animals: ");
        food = getAmount(" amount of food: ");
        additionOfFood = getAmount(" addition of food per hour: ");
        
        //Initial table header print statement
        System.out.format("| %-4s | %-16s | %-13s | %-11s | %-14s | \n", "Hour", "Animals At Start",
                "Food At Start", "Food At End", "Animals At End");
        //for loop that only stops printing once the number of animals outgrow the food supply
        for (hours = 1; food >= numberOfAnimals; hours++) {
            System.out.format("| %4s | %16s | %13s | %11s | %14s | \n", hours, numberOfAnimals, food, food += additionOfFood - numberOfAnimals, numberOfAnimals * 2);
            numberOfAnimals *= 2;
        }
        System.out.println("\n");
        System.out.println("In this setup, the animals will live for " + (hours - 1) +
                " hours before there is not enough food for all of them.");
    }

    private int getAmount(String type) {
        boolean valid = false;
        int amount = 0;
        Scanner read = new Scanner(System.in);
        //while is needed instead of do while in order to use the if statement
        //that uses a boolean to verify input
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
}
