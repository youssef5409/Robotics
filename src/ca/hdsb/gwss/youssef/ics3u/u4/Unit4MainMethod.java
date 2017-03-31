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
        String closer;
        String compound;
        String ounce;
        String fibonacci;
        String lab;
        String soil;
        
        int app;
        boolean check = false;
        //Declaring Objects
        CloserToTwo two = new CloserToTwo();
        CompoundInvesting investing = new CompoundInvesting();
        OunceGrams grams = new OunceGrams();
        FibonacciSeries series = new FibonacciSeries();
        LabAnimals animals = new LabAnimals();
        Erosion erode = new Erosion();
        
        Scanner read = new Scanner(System.in);
        
        //Introductory Statement
        System.out.println("Welcome to my unit 4 culminative task! I can do a \n"
                + "multitude of things, which include,\n");
        
        while (!check) {
            try {
                //Starts off by asking the question.
                System.out.print("Press 1 - 6 respectively for any task. (Note: "
                        + "Triangle and Right-Angle Triangle both fall under the number 4): ");
                //program expects double.
                app = read.nextInt();
                switch (app) {
                    case 1:
       //                 closer = two.closeness();
              //          System.out.println(closer);
                        check = true;
                        break;
                    case 2:
                        investing.money();
                        check = true;
                        break;
                    case 3:
         //               ounce = grams.conversion();
            //            System.out.println(ounce);
                        check = true;
                        break;    
                    case 4:
                       series.seriesOfFibonacci();
          //              System.out.println(fibonacci);
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
                    default:
                        System.out.println("Sorry, invalid number.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Sorry, you entered an invalid value");
                System.err.println(e);
                read.next();
            }
        }
    }
}
