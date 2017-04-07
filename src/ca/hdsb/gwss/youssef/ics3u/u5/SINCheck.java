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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sin;
        double total = 0;
        int digit;

        Scanner read = new Scanner(System.in);
        do {
        System.out.println("Enter SIN: ");
        sin = read.nextLine();
        }while (sin.length() < 8);

        for (int i = 0; i < sin.length() - 1; i++) {
            if (i % 2 == 0) {
                digit = Character.getNumericValue(sin.charAt(i));
                total += digit;
            } else {
                digit = 2 * Character.getNumericValue(sin.charAt(i));
                if (digit > 10) {
                    digit = (digit - 10) + 1;
                }
                total += digit;
            }
        }
        if (ceil(total / 10) * 10 - total == Character.getNumericValue(sin.charAt(8))) {
            System.out.println("Verified.");
        } else {
            System.out.println("Not Verified.");
        }
    }
}
    

//130692544
