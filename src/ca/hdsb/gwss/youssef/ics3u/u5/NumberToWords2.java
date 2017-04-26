/*
 * Name: Youssef Mohamed
 * Date: 26th Apr 2017
 * Version: 0.9
 * Description:
 *      This program counts from 1 to 999.   
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
    static Scanner read = new Scanner(System.in);
    static ArrayList words = new ArrayList();
    static boolean teensNeeded = false;

    public static void numberWord() {
        //Adding all english numbers to an array list
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("twenty ");
        words.add("thirty ");
        words.add("forty ");
        words.add("fifty ");
        words.add("sixty "); //This and seventy are the only ones that follow the normal spelling
        words.add("seventy "); //So I just decided to add them in the array list. Instead of
        words.add("eighty ");  // doing an if statement, and then concatening "ty"
        words.add("ninety ");
        words.add("ten");
        words.add("eleven");
        words.add("twelve");
        words.add("thirteen");
        words.add("fourteen"); //Same deal with 14, 16, 17, 19. Added them here for
        words.add("fifteen");  //Less lines of code.
        words.add("sixteen");
        words.add("seventeen");
        words.add("eighteen");
        words.add("nineteen");

        //Allows user to choose whether they want to enter their own number, or loop through
        //1-999
        System.out.println("I can convert numbers to words. \n");
        System.out.println("How would you like for me to convert your number? ");
        System.out.println("1 - Enter Own Number (Between 1 - 999) \n"
                + "2 - Automatically Loop 1 - 999 \n");
        switch (getType("What would you like to do?: ")) {
            case 1:
                process(getType("Enter Number: "));
                break;
            case 2:
                for (int i = 1; i < 1000; i++) {
                    process(i);
                }
                break;
        }
    }

    //Method for assigning a 'ones' value
    private static String ones(int n) {
        String word;
        try {
            word = (String) words.get(n - 1);
        } catch (Exception e) {
            word = "";
        }
        return word;
    }

    //Method for assigning a 'tens' value
    private static String tens(int n) {
        String word;
        //Instead of checking if n == 1 then n == 0; I made it check if it was smaller
        //Than 2 and then if it equals 0. This improves on efficiency.
        if (n < 2) {
            word = "";
            teensNeeded = true;
            if (n == 0) {
                teensNeeded = false;
                word = "";
            }

        } else {
            word = (String) words.get(n + 7);
        }

        return word;
    }

    //Method for assigning a 'hundreds' value, feels forced, however criteria 
    //requires it
    private static String hundreds(int n) {
        return words.get(n - 1) + " hundred ";
    }

    //Method for assigning a 'teens' value
    private static String teens(int n) {
        String word;
        word = (String) words.get(n + 17);
        return word;
    }

    //Method for processing a number into a word
    private static void process(int n) {
        int ORIGINAL_NUMBER;
        String hundreds = "";
        String tens = "";
        String ones;

        Stack numbers = new Stack();

        numbers.empty();
        teensNeeded = false;

        ORIGINAL_NUMBER = n;

        while (n > 0) {
            numbers.push(n % 10);
            n = n / 10;
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

    //Getting user input, and verifying it
    private static int getType(String type) {
        //Initializing variables
        int app = 0;
        boolean valid = false;
        //Do while is not needed, as variable app must be declared in advance.
        //However this is to meet criteria.
        do {
            try {
                System.out.print(type);
                app = Integer.parseInt(read.nextLine());
                if (app < 1 || app > 999); //Stops user from entering a number smaller than one or greater than 999
                else if (type.equals("What would you like to do?: ")) {
                    if (app == 1 || app == 2) {
                        valid = true;
                    }
                } else {
                    valid = true;
                }
            } catch (NumberFormatException e) {
            }
            if (!valid) {
                System.out.println("Invalid Input.");
            }
        } while (!valid);
        return app;
    }
}
