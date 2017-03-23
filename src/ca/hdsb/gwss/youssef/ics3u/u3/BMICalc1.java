/*
 * Name: Youssef Mohamed
 * Version: 0.3
 * Date: 23rd March 2017
 * Description: Determines a person's BMI
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import java.util.Scanner;
import java.util.InputMismatchException;

/**
 *
 * @author 1mohamedyou
 */
public class BMICalc1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialzing Variables
        double weight = 0;
        double height = 0;
        double bmi;
        int type;
        String units;
        boolean check = false;
        Scanner read = new Scanner(System.in);

        //Introductory Statement
        System.out.println("Hi, I can figure out your BMI \n");
        System.out.println("Body mass index (BMI) is a measure of the weight of \n"
                + "a person scaled according to their height. BMI is defined as \n"
                + "the individual's body weight divided by the square of their \n"
                + "height. It is almost always expressed in the unit kg/m2.\n");

        //while loop that waits until check = true.
        while (!check) {
            try {
                //Starts off by asking the question.
                System.out.print("Press 1 for metric, press 2 for imperial: ");
                //program expects double.
                type = read.nextInt();
                switch (type) {
                    case 1:
                        units = "Metric (m/kg)";
                        break;
                    case 2:
                        units = "Imperial (in/lb)";
                        break;
                    default:
                        System.out.println("Sorry, invalid type.");
                        continue;
                }
                //Verification of proper weight/height info, that allows the program to
                //keep running. Even after an error.
                System.out.print("What is your weight? Keep it within realistic"
                        + " parameters (Remember: " + units + "): ");
                while (!check) {
                    weight = read.nextDouble();
                    if (type == 2 && weight >= 5.5 && weight <= 900) {
                        check = true;
                        weight = weight * 703;
                    } else if (type == 1 && weight >= 5.5 && weight <= 408.233) {
                        check = true;
                    } else {
                        System.out.print("Sorry, what your weight is invalid,"
                                + " please try again: ");
                    }
                }
                check = false;
                System.out.print("What is your height? Keep it within realistic"
                        + " parameters (Remember: " + units + "): ");
                while (!check) {
                    height = read.nextDouble();
                    if (type == 2 && height >= 12 && height <= 96) {
                        check = true;
                    } else if (type == 1 && height >= 0.3048 && height <= 2.4384) {
                        check = true;
                    } else {
                        System.out.print("Sorry, what your weight is invalid,"
                                + " please try again: ");
                    }
                }
                //if the user does not enter a number, the program will catch that error.
            } catch (InputMismatchException e) {
                System.out.println("Sorry, you entered an invalid value");
                System.err.println(e);
                read.next();
            }
        }
        bmi = weight / (height * height);
        //if/elif/else for fidning what group the user falls into.
        if (bmi > 40) {
            System.out.println("You are morbidly obese.");
        } else if (bmi > 30) {
            System.out.println("You are obese");
        } else if (bmi > 25) {
            System.out.println("You are overweight");
        } else if (bmi >= 18.5) {
            System.out.println("You are ideal");
        } else if (bmi >= 16) {
            System.out.println("You are underweight");
        } else {
            System.out.println("You are starving");
        }
    }

}
