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

    /*
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sin;
        double total = 0;
        double digit;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter SIN: ");
        sin = read.nextLine();

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
//For next Program involving verification of number format.

//sin = sin.^(\d{3}-?\d{3}-?\d{3}|XXX-XXX-XXX)$);
//sin.replace
//Pattern rx = Pattern.compile( "^(\\d{3}-?\\d{3}-?\\d{3}|XXX-XXX-XXX)$");
//Matcher mx = rx.matcher(sin);
