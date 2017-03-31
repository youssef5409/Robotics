/*
 * Name: Youssef Mohamed
 * Date: 26th Mar 2017
 * Version: 0.9
 * Description:
 *      This program articulates and manipulates methods that can, calculate the
 *      bmi of a person, calculate if fish can live in a certain pH, calculate if 3
 *      sides can make a triangle, and, figure out if a year is a leap year.
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class Unit3MainMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initializing variables
        String pH;
        String bmiLevel;
        String leapYear;
        String canTriangle;
        int app;
        boolean check = false;
        //Declaring Objects
        AcidRain acid = new AcidRain();
        BMICalc bmi = new BMICalc();
        LeapYear year = new LeapYear();
        Triangle triangle = new Triangle();
        Scanner read = new Scanner(System.in);
        
        //Introductory Statement
        System.out.println("Welcome to my unit 3 culminative task! I can do a \n"
                + "multitude of things, which include, telling you if your fish can live\n"
                + "in water with a stated pH, telling you your BMI, telling you whether\n"
                + "or not a year is a leap year, telling whether or not 3 sides\n"
                + "can make a triangle and, if said triangle is right angled.\n");
        while (!check) {
            try {
                //Starts off by asking the question.
                System.out.print("Press 1 - 4 respectively for any task. (Note: "
                        + "Triangle and Right-Angle Triangle both fall under the number 4): ");
                //program expects Integer.
                app = read.nextInt();
                switch (app) {
                    case 1:
                        pH = acid.level();
                        System.out.println(pH);
                        check = true;
                        break;
                    case 2:
                        bmiLevel = bmi.levelBMI();
                        System.out.println(bmiLevel);
                        check = true;
                        break;
                    case 3:
                        leapYear = year.yearCheck();
                        System.out.println(leapYear);
                        check = true;
                        break;
                    case 4:
                        canTriangle = triangle.triangleCheck();
                        System.out.println(canTriangle);
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
