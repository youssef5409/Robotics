/*
 * Name: Youssef Mohamed
 * Date: 26th Mar 2017
 * Version: 0.9
 * Description:
 *      This program articulates and manipulates methods that can, calculate the
 *      bmi of a person, calculate if fish can live in a certain pH, calculate if 3
 *      sides can make a triangle, and, figure out if a year is a leap year.
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

import java.util.InputMismatchException;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.Global.Infinity;

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
        CloserToTwo two = new CloserToTwo();
        CompoundInvesting investing = new CompoundInvesting();
        LabAnimals animals = new LabAnimals();
        Erosion erode = new Erosion();

        Scanner read = new Scanner(System.in);

        //Introductory Statement
        System.out.println("Welcome to my unit 4 culminative task! I can do a \n"
                + "multitude of things, which include,\n");

        while (!check) {
            try {
                System.out.print("Press 1 - 6 respectively for any task. (Note: "
                        + "Triangle and Right-Angle Triangle both fall under the number 4): ");
                app = Integer.parseInt(read.nextLine());
                switch (app) {
                    case 1:
                        int denominator = 1;
                        double total = 0;

                        while (total < 2) {
                            total = total + (Math.pow(denominator, -1));
                            if (total != Infinity) {
                                System.out.println(total);
                            }
                            denominator = denominator * 2;
                        }
                        check = true;
                        break;
                    case 2:
                        investing.money();
                        check = true;
                        break;
                    case 3:
                        final double OUNCE_TO_GRAM = 28.3495231;

                        System.out.println("Ounce To Grams Conversion Chart");

                        System.out.println("This program will print out a titled table that can "
                                + "be used to convert ounces to grams, for values from 1 to 15. "
                                + "(1 ounce = 28.35 grams)");

                        System.out.format("%-6s | %4s \n", "Ounces", "Grams");
                        for (int i = 1; i < 16; i++) {
                            System.out.format("%6s | %6.2f\n", i, i * OUNCE_TO_GRAM);
                        }
                        check = true;
                        break;
                    case 4:
                        int a = 0;
                        int b = 1;
                        int c;
                        for (int i = 0; i < 20; i++) {
                            System.out.println(b);
                            c = a + b;
                            a = b;
                            b = c;
                        }
                        check = true;
                        break;
                    case 5:
                        //           lab = animals.animalNumber();
                        //                System.out.println(lab);
                        check = true;
                        break;
                    case 6:
                        //         soil = erode.crops();
                        //                  System.out.println(soil);
                        check = true;
                        break;

                }
                if (!check) {
                    System.out.println("Sorry, you entered an invalid value");
                }
            } catch (InputMismatchException e) {
            }
        }
    }
}
