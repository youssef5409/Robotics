/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import static java.lang.Math.ceil;
import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class SINCheck {

    public static void sinChecker() {
        //Initializing Variables
        String sin;
        double total = 0;
        double digit;
        Scanner read = new Scanner(System.in);

        do {
            //Prompts user for input
            System.out.print("Enter Canadian SIN (Must be 8 numbers in length): ");
            sin = read.nextLine();
        } while (sin.length() != 9);

        for (int i = 1; i < sin.length() - 1; i += 2) {
            digit = ceil(2 * Character.getNumericValue(sin.charAt(i)) / 10)
                    + 2 * Character.getNumericValue(sin.charAt(i)) % 10;
            total += digit;
            digit = ceil(Character.getNumericValue(sin.charAt(i - 1)) / 10)
                    + Character.getNumericValue(sin.charAt(i - 1)) % 10;
            total += digit;
        }

        if (ceil(total / 10) * 10 - total == Character.getNumericValue(sin.charAt(8))) {
            System.out.println("Verified.");
        } else {
            System.out.println("Not Verified.");
        }
    }
}
