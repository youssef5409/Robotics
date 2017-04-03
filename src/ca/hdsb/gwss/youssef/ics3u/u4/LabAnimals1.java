/*
 * Name: Youssef Mohamed
 * Date: 2nd Apr 2017
 * Version: 0.9
 * Description:
 *      Contains methods that calculate how long an exponentially growing amount
 *      of animals, can live on a linear supply of food
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

import ca.hdsb.gwss.youssef.ics3u.u4.getamounts.LabAnimalAmounts;

/**
 *
 * @author Youss
 */
public class LabAnimals1 extends LabAnimalAmounts {

    public void animalNumber() {
        //Initialzing variables
        int hours;
        int numberOfAnimals;
        int food;
        int additionOfFood;
        LabAnimalAmounts lab = new LabAnimalAmounts();
        //Introductory statement
        System.out.println("Lab Animals");
        System.out.println("At present there are X animals in the lab and enough"
                + " food for Y animals.  At the end of every hour the population"
                + " doubles, and enough food is added to support Z more animals."
                + " During any hour the animals will eat enough food for only"
                + " themselves. The program will determine when the population"
                + " will outgrow the food supply.");

        //Getting user info
        numberOfAnimals = (int) lab.getAmount(" number of animals: ");
        food = (int) lab.getAmount(" amount of food: ");
        additionOfFood = (int) lab.getAmount(" addition of food per hour: ");

        //Initial table header print statement
        System.out.format("| %-4s | %-16s | %-13s | %-11s | %-14s | \n", "Hour", "Animals At Start",
                "Food At Start", "Food At End", "Animals At End");
        //for loop that only stops printing once the number of animals outgrow the food supply
        for (hours = 1; food >= numberOfAnimals; hours++) {
            System.out.format("| %4s | %16s | %13s | %11s | %14s | \n", hours, numberOfAnimals, food, food += additionOfFood - numberOfAnimals, numberOfAnimals * 2);
            numberOfAnimals *= 2;
        }
        System.out.println("\n");
        System.out.println("In this setup, the animals will live for " + (hours - 1)
                + "hours before there is not even food for all of them.");
    }

    @Override
    public double getAmount(String type) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
