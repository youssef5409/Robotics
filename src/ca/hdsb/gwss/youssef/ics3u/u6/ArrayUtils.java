/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

/**
 *
 * @author Youss
 */
public class ArrayUtils {

    public static int maxValue(int myArray[]) {
        int maximum = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maximum) {
                maximum = myArray[i];
            }
        }
        return maximum;
    }

    public static int minValue(int myArray[]) {
        int minimum = myArray[0];
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                minimum = myArray[i];
            }
        }
        return minimum;
    }

    public static double averageValue(int myArray[]) {
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total / myArray.length;
    }

    public static int totalValue(int myArray[]) {
        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total;
    }

    public static double maxValue(double myArray[]) {
        double maximum = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maximum) {
                maximum = myArray[i];
            }
        }
        return maximum;
    }

    public static double minValue(double myArray[]) {
        double minimum = myArray[0];
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                minimum = myArray[i];
            }
        }
        return minimum;
    }

    public static double averageValue(double myArray[]) {
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total / myArray.length;
    }

    public static double totalValue(double myArray[]) {
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total;
    }
}
