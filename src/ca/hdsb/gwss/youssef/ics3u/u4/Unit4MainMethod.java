/*
 * Name: Youssef Mohamed
 * Date: 2nd Apr 2017
 * Version: 0.9
 * Description:
 *      This program manipulates methods that can, make a number get closer and
 *      and closer to two without ever becoming two, show when the population of
 *      animals will outgrow the amount of food in the lab, how long it will take
 *      for canadian topsoil to erode to a point where crops cannot grow, convert
 *      ounces to grams, calculate compound interest, and show the first 20 terms
 *      of the fibonacci sequence.
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class Unit4MainMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Instantiating Classes
        CompoundInvesting investing = new CompoundInvesting();
        LabAnimals animals = new LabAnimals();

        intro();
        options();
        
        System.out.println("\n");
        
        //switch-case that checks for the integer that the user entered, and runs
        //a respective method
        switch (getApp()) {
            case 1:
                //Calls and uses the closeToTwo method
                closerToTwo();
                break;
            case 2:
                //Calls and uses the compound investing method which is originally
                //located in CompoundInvesting.java
                investing.money();
                break;
            case 3:
                //Calls and uses the ounceGrams method
                ounceGrams();
                break;
            case 4:
                //Calls and uses the fibonacci method
                fibonacci();
                break;
            case 5:
                //Calls and uses the lab animals method which is originally
                //located in LabAnimals.java
                animals.animalNumber();
                break;
            case 6:
                //Calls and uses the erosion method
                erosion();
                break;
        }

    }

    private static int getApp() {
        //Initializing variables
        int app = 0;

        //Declaring Objects
        Scanner read = new Scanner(System.in);

        //Do while is not needed, as variable app must be declared in advance.
        //However this is to meet criteria.
        do {
            try {
                System.out.print("What would you like to do?: ");
                app = Integer.parseInt(read.nextLine());
            } catch (NumberFormatException e) {
            }
            if (!(app < 1 && app > 6)) {
                System.out.println("Sorry, you entered an invalid value.");
            }
        } while (!(app < 1 && app > 6));
        return app;
    }
    

    private static void intro() {
        //Introductory Statement
        System.out.println("Welcome to my unit 4 culminative task! I can utilize \n"
                + "methods that can make a number get closer and\n"
                + "and closer to two without ever becoming two, show when the population of\n"
                + "animals will outgrow the amount of food in the lab, how long it will take\n"
                + "for canadian topsoil to erode to a point where crops cannot grow, convert\n"
                + "ounces to grams, calculate compound interest, and show the first 20 terms\n"
                + "of the fibonacci sequence.\n");
    }

    private static void options() {
        System.out.println("1 - Closer To Two \n"
                + "2 - Compound Investments \n"
                + "3 - Ounce to Gram Conversion \n"
                + "4 - Fibonacci Sequence \n"
                + "5 - Lab Animals \n"
                + "6 - Erosion \n");
    }

    private static void closerToTwo() {
        //Initializing variables
        long denominator = 1;
        double total = 0;
        System.out.println("Closer to Two");
        System.out.println("This program demonstrates that the"
                + " result of adding the numbers 1, 1/2, 1/4,"
                + " 1/16, ... and so on gets closer to 2"
                + " without becoming 2.");
        //while loop that repeats itself, as long as the total is less than 2
        while (total < 2) {

            System.out.print(total + " + " + " 1/" + denominator + " = ");
            total += Math.pow(denominator, -1);
            System.out.println(total);
            denominator = denominator * 2;
        }
        System.out.println("This does not really equal two, java shows this because, \n"
                + "this is the extent of java's ability to parse double's for more \n"
                + "decimals.");
    }

    private static void ounceGrams() {
        //Initialzing final that is equal to the conversion rate
        //of ounces to grams
        final double OUNCE_TO_GRAM = 28.3495231;

        System.out.println("Ounce To Grams Conversion Chart");

        System.out.println("This program will print out a titled table that can "
                + "be used to convert ounces to grams, for values from 1 to 15. "
                + "(1 ounce = 28.35 grams)");
        //Series of format statements that create a table
        System.out.format("%-6s | %4s \n", "Ounces", "Grams");
        for (int i = 1; i < 16; i++) {
            System.out.format("%6s | %6.2f\n", i, i * OUNCE_TO_GRAM);
        }
    }

    private static void fibonacci() {
        //Initializing variables
        int a = 0;
        int b = 1;
        int c;
        System.out.println("Fibonacci Sequence");
        System.out.println("This program will print the first"
                + " twenty terms of the Fibonacci Series.");
        //For loop that prints and follows the fibonacci series
        for (int i = 0; i < 20; i++) {
            System.out.println(b);
            c = a + b;
            a = b;
            b = c;
        }
    }

    private static void erosion() {
        //Initializing variables and final variables
        int years;
        double projectedTopsoil = 30;
        final int MINIMUM_TOP_SOIL = 9;
        //This number was found by dividing 2.5 cm by 500 years to found out
        //the cm per year, this is for more accurate calculations
        final double YEARLY_TOPSOIL_GROWTH = 0.005;
        final double YEARLY_EROSION = 0.01;
        //Introductory statement
        System.out.println("Topsoil Erosion");
        System.out.println("Careless land management causes approximately 1% of \n"
                + "the topsoil to erode each year. It is then lost forever, since \n"
                + "it takes nature approximately 500 years to produce 2.5cm of topsoil. \n"
                + "At 9cm, the topsoil is so shallow the crops cannot grow on \n"
                + "a large scale. If Canada has about 30cm of topsoil, how many \n"
                + "years will it take for the depths to be reduced to 9cm? \n");
        //For loop that checks when the topsoil goes below a certain level before stopping
        for (years = 0; projectedTopsoil > MINIMUM_TOP_SOIL; years++) {
            projectedTopsoil += YEARLY_TOPSOIL_GROWTH;
            projectedTopsoil -= YEARLY_EROSION * projectedTopsoil;
        }
        System.out.println("It will take " + years + " years.");
    }
}
