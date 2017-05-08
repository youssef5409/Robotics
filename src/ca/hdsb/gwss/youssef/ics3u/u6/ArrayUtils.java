/*
 * Name: Youssef Mohamed
 * Date: 28th Apr 2017
 * Version: 0.9
 * Description: 
 *      Library for utilities that take in an array and manipulate them in order to,
 *      find the max value, min value, total, and average.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

import java.util.ArrayList;

/**
 *
 * @author Youss
 */
public class ArrayUtils {

    public static void main(String[] args) {
    }

    public static void display(int[] array) {
        System.out.println("-------------------------------------------");
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");
    }

    public static void display(double[] array) {
        System.out.println("-------------------------------------------");
        for (double i : array) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");
    }

    public static void display(String[] array) {
        System.out.println("-------------------------------------------");
        for (String i : array) {
            System.out.println(i);
        }
        System.out.println("-------------------------------------------");
    }

    public static int[] generateArray(int size, int min, int max) {
        int[] data = new int[size];

        for (int i = 0; i < data.length; i++) {
            int nOfSpaces = Math.abs(max) + Math.abs(min);
            data[i] = (int) (Math.random() * nOfSpaces + min);
        }
        return data;
    }

    public static double[] generateArray(int size, double min, double max) {
        double[] data = new double[size];
        double nOfSpaces = Math.abs(max) + Math.abs(min);

        for (int i = 0; i < data.length; i++) {

            data[i] = Math.random() * nOfSpaces + min;
        }
        return data;
    }

    public static String[] generateArray(int size, int lengthOfString, char min, char max) {
        String[] data = new String[size];
        String str;
        for (int i = 0; i < data.length; i++) {
            str = "";
            for (int j = 0; j < lengthOfString; j++) {
                str += Character.toString((char) (int) (Math.random() * max + min));
                System.out.println((int) (Math.random() * max) + min);
            }
            data[i] = str;
        }
        return data;
    }

    //Checks if a value is greater than another; it carries and returns the greatest value.
    public static int maxValue(int myArray[]) {
        int maximum = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] > maximum) {
                maximum = myArray[i];
            }
        }
        return maximum;
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

    //Checks if a value is smaller than another; it carries and returns the smallest value.
    public static int minValue(int myArray[]) {
        int minimum = myArray[0];
        for (int i = 0; i < myArray.length - 1; i++) {
            if (myArray[i] > myArray[i + 1]) {
                minimum = myArray[i];
            }
        }
        return minimum;
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

    //Finds the average of the numbers in an array, by adding them all up and dividing by length.
    public static double averageValue(int myArray[]) {
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total / myArray.length;
    }

    public static double averageValue(double myArray[]) {
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total / myArray.length;
    }

    //Finds the total of the numbers by adding them up.
    public static int totalValue(int myArray[]) {
        int total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total;
    }

    public static double totalValue(double myArray[]) {
        double total = 0;
        for (int i = 0; i < myArray.length; i++) {
            total += myArray[i];
        }
        return total;
    }
    //Repeating all methods, for doubles.

    public static int[] bubbleIntAsc(int[] x) {
        int swap;
        int j; //This is so that j is only initialized once
        for (int i = 0; i < x.length; i++) {
            for (j = 1; j < x.length - i; j++) {
                if (x[j - 1] > x[j]) {
                    swap = x[j - 1];
                    x[j - 1] = x[j];
                    x[j] = swap;
                }
            }
        }
        return x;
    }

    public static double[] bubbleDoubleAsc(double[] x) {
        double temp;
        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < x.length - i; j++) {
                if (x[j - 1] > x[j]) {
                    temp = x[j - 1];
                    x[j - 1] = x[j];
                    x[j] = temp;
                }
            }
        }
        return x;
    }

    public static void bubbleStringAsc(String[] x) {
        String temp;
        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < x.length - i; j++) {
                if (x[j - 1].compareTo(x[j]) > 0) {
                    temp = x[j - 1];
                    x[j - 1] = x[j];
                    x[j] = temp;
                }
            }
        }
    }

    public static int[] bubbleIntDsc(int[] array) {
        int swap;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] < array[j]) {
                    swap = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = swap;
                }
            }

        }
        return array;
    }

    public static void bubbleDoubleDsc(double[] x) {
        double temp;
        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < x.length - i; j++) {
                if (x[j - 1] < x[j]) {
                    temp = x[j - 1];
                    x[j - 1] = x[j];
                    x[j] = temp;
                }
            }
        }
    }

    public static void bubbleStringDsc(String[] x) {
        String temp;
        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < x.length - i; j++) {
                if (x[j - 1].compareTo(x[j]) < 0) {
                    temp = x[j - 1];
                    x[j - 1] = x[j];
                    x[j] = temp;
                }
            }
        }
    }

    public static void selectionIntAsc(int[] x) {
    }
    public static void selectionSort(int[] x) {  
        int j;
        int temp;
        
        for (int i = 0; i < x.length - 1; i++)  {
            int index = i;  
            for (j = i + 1; j < x.length; j++){  
                if (x[j] < x[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            temp = x[index];   
            x[index] = x[i];  
            x[i] = temp;  
        }  
    }  
    

}
