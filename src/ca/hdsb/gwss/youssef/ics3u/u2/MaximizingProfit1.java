/*
 * Name: Youssef Mohamed
 * Date: 3rd Mar 2017
 * Version: 1.0
 * Description:
 *      This program maximizes your profit
 */
package ca.hdsb.gwss.youssef.ics3u.u2;

//Organizing imports
import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class MaximizingProfit1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing Variables
        String allDecimals = "";
        double originalCost = 0;
        double numberOfSales = 0;
        double salesLost = 0;
        double deductionChunk = 0;
        double root1;
        double root2;
        double profit;
        double vertex;
        boolean check = false;

        //Formatting decimals that end with .0
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);

        //Initializing scanner for user input
        Scanner read = new Scanner(System.in);

        //Welcome text
        System.out.println(" __  __                          __  __       _             _ \n"
                + "|  \\/  | ___  _ __   ___ _   _  |  \\/  | __ _| | _____ _ __| |\n"
                + "| |\\/| |/ _ \\| '_ \\ / _ \\ | | | | |\\/| |/ _` | |/ / _ \\ '__| |\n"
                + "| |  | | (_) | | | |  __/ |_| | | |  | | (_| |   <  __/ |  |_|\n"
                + "|_|  |_|\\___/|_| |_|\\___|\\__, | |_|  |_|\\__,_|_|\\_\\___|_|  (_)\n"
                + "                         |___/                                \n");
        System.out.println("I can find out how to maximize your profit! \n");

        //while loop that verifies that the user has entered a double
        while (!check) {
            try {
                System.out.format("%86s ", "How much does your product cost?");
                originalCost = read.nextDouble();
                check = true;
            } catch (InputMismatchException e) {
                check = false;
                System.err.println(e);
                System.out.format("%86s ", "Sorry, you entered an invalid value \n");
                read.next();
            }
        }

        check = false;
        while (!check) {
            try {
                System.out.format("%86s ", "How many sales do you get with that cost?");
                numberOfSales = read.nextDouble();
                check = true;
            } catch (InputMismatchException e) {
                System.out.format("%86s ", "Sorry, you entered an invalid value \n");
                read.next();
            }
        }

        check = false;
        while (!check) {
            try {
                System.out.format("For your 'price increase to sales lost trend',"
                        + " how much are you changing your cost by? ");
                deductionChunk = read.nextDouble();
                if (deductionChunk == 0) {
                    System.out.println("I will not have a trend to follow.");
                    read.next();
                } else {
                    check = true;
                }
            } catch (InputMismatchException e) {
                System.out.format("%86s ", "Sorry, you entered an invalid value \n");
                read.next();
            }
        }

        check = false;
        while (!check) {
            try {
                System.out.format("%86s ", "How many sales do you predict to lose for every "
                        + "increase of $" + String.format(format.format(deductionChunk))
                        + "?");
                salesLost = read.nextDouble();
                if (salesLost == 0) {
                    System.out.format("%86s ", "I will not have a trend to follow.");
                    read.next();
                } else {
                    check = true;
                }
            } catch (InputMismatchException e) {
                System.out.format("%86s ", "Sorry, you entered an invalid value ");
                read.next();
            }
        }

        root1 = (numberOfSales / salesLost);
        root2 = (originalCost / -deductionChunk);
        vertex = (root1 + root2) / 2;
        profit = (numberOfSales - salesLost * vertex)
                * (originalCost + deductionChunk * vertex);

        if (vertex <= 0) {
            System.err.println("The revenue if any value is changed is less than 0");
            System.out.println("You should sell your product for $" + originalCost);
            System.out.println("You will make $" + String.format("%.2f", originalCost * numberOfSales));
            System.out.println("This can be modeled with the quadratic equation f(x) = ("
                    + format.format(numberOfSales) + "-" + format.format(salesLost)
                    + "n" + ")" + "(" + format.format(originalCost) + "+"
                    + format.format(deductionChunk) + "n" + ")");

            System.out.println("Keep in mind all the numbers in the model "
                    + "equation that have more than 2 decimal places were rounded "
                    + "down to 2 decimal places for easier reading.");
        } else {
            System.out.println("You should sell your product for $"
                    + String.format("%.2f", vertex));

            System.out.println("You will make $" + String.format("%.2f", profit));

            System.out.println("This can be modeled with the quadratic equation f(x) = ("
                    + format.format(numberOfSales) + "-" + format.format(salesLost)
                    + "n" + ")" + "(" + format.format(originalCost) + "+"
                    + format.format(deductionChunk) + "n" + ")");

            System.out.println("Keep in mind all the numbers in the model "
                    + "equation that have more than 2 decimal places were rounded "
                    + "down to 2 decimal places for easier reading.");
            }
        }

    }
