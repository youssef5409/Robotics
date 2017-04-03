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
        //Initializing variables
        int app;
        boolean check = false;
        //Declaring Objects
        CompoundInvesting1 investing = new CompoundInvesting1();
        LabAnimals1 animals = new LabAnimals1();

        Scanner read = new Scanner(System.in);

        //Introductory Statement
        System.out.println("Welcome to my unit 4 culminative task! I can utilize \n"
                + " methods that can make a number get closer and\n"
                + " and closer to two without ever becoming two, show when the population of\n"
                + " animals will outgrow the amount of food in the lab, how long it will take\n"
                + " for canadian topsoil to erode to a point where crops cannot grow, convert\n"
                + " ounces to grams, calculate compound interest, and show the first 20 terms\n"
                + " of the fibonacci sequence.\n");
        //while loop that wait for valid input
        while (!check) {
            try {
                System.out.print("Press 1 - 6 respectively for any task: ");
                app = Integer.parseInt(read.nextLine());
                //switch-case that checks for the integer that the user entered.
                switch (app) {
                    case 1:
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
                            denominator = denominator * 2;
                            total += Math.pow(denominator, -1);
                            System.out.println(total);
                        }

                        check = true;
                        break;
                    case 2:
                        //Calls the compound investing method
                        investing.money();
                        check = true;
                        break;
                    case 3:
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
                        check = true;
                        break;
                    case 4:
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
                        check = true;
                        break;
                    case 5:
                        //Calls upon the lab animals method
                        animals.animalNumber();
                        check = true;
                        break;
                    case 6:
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
                        check = true;
                        break;

                }

            } catch (NumberFormatException e) {
            }
            if (!check) {
                System.out.println("Sorry, you entered an invalid value");
            }
        }
    }
}