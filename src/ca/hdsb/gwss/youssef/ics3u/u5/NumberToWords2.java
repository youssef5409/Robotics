/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author 1mohamedyou
 */
public class NumberToWords2 {

    /**
     * @param args the command line arguments
     */
    static ArrayList words = new ArrayList();
    static boolean teensNeeded = false;

    public static void main(String[] args) {
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");
        words.add("eleven");
        words.add("twelve");
        words.add("thirteen");
        words.add("twenty");
        words.add("thirty");

        final int ORIGINAL_NUMBER;
        int number;
        String hundreds = "";
        String tens = "";
        String ones;

        Scanner read = new Scanner(System.in);
        Stack numbers = new Stack();

        System.out.print("Enter Number: ");
        number = Integer.parseInt(read.nextLine());
        ORIGINAL_NUMBER = number;
        while (number > 0) {
            numbers.push(number % 10);
            number = number / 10;
        }
        if (ORIGINAL_NUMBER > 99) {
            hundreds = hundreds((int) numbers.pop());
            tens = tens((int) numbers.pop());
            if (!teensNeeded) {
                ones = ones((int) numbers.pop());
            } else {
                ones = teens((int) numbers.pop());
            }
        } else if (ORIGINAL_NUMBER > 9) {
            tens = tens((int) numbers.pop());
            ones = ones((int) numbers.pop());
        } else {
            ones = ones((int) numbers.pop());
        }

        System.out.println(hundreds + tens + ones);

    }

    private static String ones(int n) {
        return (String) words.get(n - 1);
    }

    private static String tens(int n) {
        String word;
        if (n == 1) {
            teensNeeded = true;
            word = "";
        } else {
            if (n == 5) {
                word = "fifty";
            } else {
                word = words.get(n - 1) + "ty ";
            }
        }
        return word;
    }

    private static String hundreds(int n) {
        return words.get(n - 1) + " hundred ";
    }

    private static String teens(int n) {
        String word;
        if (n < 4) {
            word = "thirteen";
            if (n < 3) {
                word = "twelve";
                if (n < 2) {
                    word = "eleven";
                }
            }
        } else {
            word = words.get(n - 1) + "ty";
        }
        return word;
    }
}
