/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import java.util.Scanner;
import static java.lang.Math.pow;

/**
 *
 * @author 1mohamedyou
 */
public class BMICalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double weight;
        final double height;
        final double bmi;
        final int type;

        Scanner read = new Scanner(System.in);
        System.out.println("Hi, I can figure out your BMI \n");
        System.out.println("Body mass index (BMI) is a measure of the weight of \n"
                + "a person scaled according to their height. BMI is defined as \n"
                + "the individual's body weight divided by the square of their \n"
                + "height. It is almost always expressed in the unit kg/m2.\n");

        System.out.print("Press 1 for metric, press 2 for imperial: ");
        type = read.nextInt();

        System.out.print("What is your weight? (kg/lb) : ");
        weight = read.nextDouble();

        System.out.print("What is you height? (cm/in) : ");
        height = read.nextDouble();

        if (type == 1) {
            bmi = weight / (pow(height, height));
        } else {
            bmi = weight * 703 / (pow(height, height));
        }

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
