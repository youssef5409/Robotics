/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        while (true) {
        Scanner read = new Scanner(System.in);
        System.out.print("What number would you like to exclamate?: ");
        System.out.println(fact(Long.parseLong(read.nextLine())));
        }
    }

    public static BigInteger fact(long n) {
        
        if (n < 0) {
            return BigInteger.valueOf(-1);
        }
        if (n < 2) {
            return BigInteger.valueOf(1);
        }
        return fact(n - 1).multiply(BigInteger.valueOf(n));
    }

}
