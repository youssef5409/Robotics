/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class BMICalc {
public static int type;
public static String units;
    String levelBMI() {
        double weight = 0;
        String bmiLevel;
        double height = 0;
        double bmi;
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
                        check = true;
                        break;
                    case 2:
                        units = "Imperial (in/lb)";
                        check = true;
                        break;
                    default:
                        System.out.println("Sorry, invalid type.");
                }
                //if the user does not enter a number, the program will catch that error.
            } catch (InputMismatchException e) {
                System.out.println("Sorry, you entered an invalid value");
                System.err.println(e);
                read.next();
            }
        }
        
        height = getHeight();
        weight = getWeight();
        bmi = weight / (height * height);
        //if/elif/else for fidning what group the user falls into.
        if (bmi > 40) {
            bmiLevel = "You are morbidly obese.";
        } else if (bmi > 30) {
            bmiLevel = "You are obese";
        } else if (bmi > 25) {
            bmiLevel = "You are overweight";
        } else if (bmi >= 18.5) {
            bmiLevel = "You are ideal";
        } else if (bmi >= 16) {
            bmiLevel = "You are underweight";
        } else {
            bmiLevel = "You are starving";
        }
        return bmiLevel;
    }

    /*public static double getType() {
        int type;
        boolean validType = false;
        String units;
        Scanner read = new Scanner(System.in);
        while (!validType) {
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
            }
        }
    }
*/
    public static double getHeight() {
        double height = 0;
        boolean validHeight = false;
        Scanner read = new Scanner(System.in);
        while (!validHeight) {
            System.out.println("What is your height? Keep it within realitic parameters: ");
            height = read.nextDouble();
            if (type == 2 && height >= 12 && height <= 96) {
                validHeight = true;
            } else if (type == 1 && height >= 0.3048 && height <= 2.4384) {
                validHeight = true;
            } else {
                System.out.print("Sorry, your height is invalid,"
                        + " please try again: ");
            }
        } return height;
    }

    public static double getWeight() {
        double weight = 0;
        boolean validWeight = false;
        Scanner read = new Scanner(System.in);
        System.out.print("What is your weight? Keep it within realistic"
                + " parameters (Remember: " + units + "): ");
        while (!validWeight) {
            weight = read.nextDouble();
            if (type == 2 && weight >= 5.5 && weight <= 900) {
                validWeight = true;
                weight = weight * 703;
            } else if (type == 1 && weight >= 5.5 && weight <= 408.233) {
                validWeight = true;
            } else {
                System.out.print("Sorry, your weight is invalid,"
                        + " please try again: ");
            }
        }  return weight;
    }
}
