/*
 * Name: Youssef Mohamed
 * Date: 2nd Apr 2017
 * Version: 0.9
 * Description:
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
            word = "eighteen ";
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
                            word = "ten ";
                        }
                    }
                }
            }
        } else {

            word = words.get(n - 1) + "teen";
        }
        return word;
    }

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
