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
//Ask muir most efficiency = IF statements vs extra array lists vs extra array list entries
public class NumberToWords2 {

    /**
     * @param args the command line arguments
     */
    static ArrayList words = new ArrayList();
    static boolean teensNeeded = false;

    public static void main(String[] args) {
        int ORIGINAL_NUMBER;
        int number;
        String hundreds = "";
        String tens = "";
        String ones;

        Scanner read = new Scanner(System.in);
        Stack numbers = new Stack();
        
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        
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
            if (!teensNeeded) {
                ones = ones((int) numbers.pop());
            } else {
                ones = teens((int) numbers.pop());
            }
        } else {
            ones = ones((int) numbers.pop());
        }
        System.out.println(hundreds + tens + ones);

    }

    private static String ones(int n) {
        String word;
        try {
            word = (String) words.get(n - 1);
        } catch (Exception e) {
            word = "";
        }
        return word;
    }

    private static String tens(int n) {
        String word;
        if (n == 8) {
            word = "eighty ";
        } else if (n == 5) {
            word = "fifty ";
        } else if (n < 5) {
            word = "forty ";
            if (n < 4) {
                word = "thirty ";
                if (n < 3) {
                    word = "twenty ";
                    if (n < 2) {
                        word = "";
                        teensNeeded = true;
                        if (n == 0) {
                            teensNeeded = false;
                            word = "";
                        }
                    }
                }

            }
        } else {
            word = words.get(n - 1) + "ty ";
        }

        return word;
    }

    private static String hundreds(int n) {
        return words.get(n - 1) + " hundred ";
    }

    private static String teens(int n) {
        String word;
        if (n == 8) {
            word = "eighteen";
        } else if (n == 5) {
            word = "fifteen ";
        } else if (n < 5) {
            word = "fourteen ";
            if (n < 4) {
                word = "thirteen ";
                if (n < 3) {
                    word = "twelve ";
                    if (n < 2) {
                        word = "eleven ";
                        if (n < 1) {
                            word = "ten";
                        }
                    }
                }
            }
        } else {

            word = words.get(n - 1) + "teen";
        }
        return word;
    }
}
