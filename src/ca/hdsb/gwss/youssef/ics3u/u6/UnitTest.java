/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Youss
 */
public class UnitTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        maxInt();
        maxDouble();

        minInt();
        minDouble();

        totalValueInt();
        totalValueDouble();

        averageInt();
        averageDouble();

        bubbleIntAsc();
        bubbleDoubleAsc();
        bubbleStringAsc();

        bubbleIntDsc();
        bubbleDoubleDsc();
        bubbleStringDsc();

        selectionIntAsc();
        selectionDoubleAsc();
        selectionStringAsc();

        selectionIntDsc();
        selectionDoubleDsc();
        selectionStringDsc();

        linearSearchInt();
        linearSearchDouble();
        linearSearchString();

        binarySearchInt();
        binarySearchDouble();
        binarySearchString();

    }

    private static void maxInt() {
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        try {
            x[0] = 101;
            assert (ArrayUtils.maxValue(x) == 101);
            System.out.println("Maximum Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Maximum Int Test Failed");
        }

    }

    private static void maxDouble() {
        try {
            double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
            y[0] = 101.0;
            assert (ArrayUtils.maxValue(y) == 101.0);
            System.out.println("Maximum Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Maximum Double Test Failed");
        }
    }

    private static void minInt() {
        try {
            int[] x = ArrayUtils.generateArray(10, -100, 100);
            x[0] = -101;
            assert (ArrayUtils.minValue(x) == -101);
            System.out.println("Minimum Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Minimum Int Test Failed");
        }
    }

    private static void minDouble() {
        try {
            double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
            y[0] = -101.0;
            assert (ArrayUtils.minValue(y) == -101.0);
            System.out.println("Minimum Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Minimum Double Test Failed");
        }
    }

    private static void totalValueInt() {
        try {
            int[] x = ArrayUtils.generateArray(10, -100, 100);
            int counter = 1;
            for (int i = 0; i < x.length; i++) {
                x[i] = counter++;
            }
            assert (ArrayUtils.totalValue(x) == (x.length / 2) * (2 * x[0] + (x.length - 1) * Math.abs(x[1] - x[0])));
            System.out.println("Total Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Total Int Test Failed");
        }
    }

    private static void totalValueDouble() {
        try {
            double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
            double counter = 1.5;
            for (int i = 0; i < y.length; i++) {
                y[i] = counter++;
            }
            assert (ArrayUtils.totalValue(y) == (y.length / 2) * (2 * y[0] + (y.length - 1) * Math.abs(y[1] - y[0])));
            System.out.println("Total Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Total Double Test Failed");
        }
    }

    private static void averageInt() {
        try {
            int[] x = ArrayUtils.generateArray(10, -100, 100);
            assert (ArrayUtils.averageValue(x) == (double) ArrayUtils.totalValue(x) / x.length);
            System.out.println("Average Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Average Int Test Failed");
        }
    }

    private static void averageDouble() {
        try {
            double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
            assert (ArrayUtils.averageValue(y) == (double) ArrayUtils.totalValue(y) / y.length);
            System.out.println("Average Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Average Double Test Failed");
        }
    }

    private static void bubbleIntAsc() {
        try {
            int[] x = ArrayUtils.generateArray(10, -100, 100);
            int[] y = new int[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.bubbleIntAsc(x);
            Arrays.sort(y);

            assert (Arrays.equals(x, y));
            System.out.println("Bubble Int Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble Int Asc Test Failed");
        }
    }

    private static void bubbleDoubleAsc() {
        try {
            double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
            double[] y = new double[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.bubbleDoubleAsc(x);
            Arrays.sort(y);

            assert (Arrays.equals(x, y));
            System.out.println("Bubble Double Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble Double Asc Test Failed");
        }
    }

    private static void bubbleStringAsc() {
        try {
            String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
            String[] y = new String[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.bubbleStringAsc(x);
            Arrays.sort(y);

            assert (Arrays.equals(x, y));
            System.out.println("Bubble String Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble String Asc Test Failed");
        }
    }

    private static void bubbleIntDsc() {
        try {
            boolean same = true;
            int[] x = ArrayUtils.generateArray(10, -100, 100);
            int[] y = new int[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.bubbleIntDsc(x);
            Arrays.sort(y);

            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[x.length - 1 - i]) {

                    same = false;
                }
            }
            assert (same);
            System.out.println("Bubble Int Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble Int Dsc Test Failed");
        }
    }

    private static void bubbleDoubleDsc() {
        try {
            boolean same = true;
            double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
            double[] y = new double[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.bubbleDoubleDsc(x);
            Arrays.sort(y);

            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[x.length - 1 - i]) {
                    same = false;
                }
            }
            assert (same);
            System.out.println("Bubble Double Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble Double Dsc Test Failed");
        }
    }

    private static void bubbleStringDsc() {
        try {
            boolean same = true;
            String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
            String[] y = new String[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.bubbleStringDsc(x);
            Arrays.sort(y);

            for (int i = 0; i < x.length; i++) {
                if (!y[i].equals(x[x.length - 1 - i])) {
                    same = false;
                }
            }
            assert (same);
            System.out.println("Bubble String Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble String Dsc Test Failed");
        }
    }

    private static void selectionIntAsc() {
        try {
            int[] x = ArrayUtils.generateArray(10, -100, 100);
            int[] y = new int[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.selectionIntAsc(x);
            Arrays.sort(y);

            assert (Arrays.equals(x, y));
            System.out.println("Selection Int Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection Int Asc Test Failed");
        }
    }

    private static void selectionDoubleAsc() {
        try {
            double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
            double[] y = new double[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.selectionDoubleAsc(x);
            Arrays.sort(y);

            assert (Arrays.equals(x, y));
            System.out.println("Selection Double Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection Double Asc Test Failed");
        }
    }

    private static void selectionStringAsc() {
        try {
            String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
            String[] y = new String[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.selectionStringAsc(x);
            Arrays.sort(y);

            assert (Arrays.equals(x, y));
            System.out.println("Selection String Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection String Asc Test Failed");
        }
    }

    private static void selectionIntDsc() {
        try {
            boolean same = true;
            int[] x = ArrayUtils.generateArray(10, -100, 100);
            int[] y = new int[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.selectionIntDsc(x);
            Arrays.sort(y);

            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[x.length - 1 - i]) {

                    same = false;
                }
            }
            assert (same);
            System.out.println("Selection Int Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection Int Dsc Test Failed");
        }
    }

    private static void selectionDoubleDsc() {
        try {
            boolean same = true;
            double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
            double[] y = new double[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.selectionDoubleDsc(x);
            Arrays.sort(y);

            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[x.length - 1 - i]) {
                    same = false;
                }
            }
            assert (same);
            System.out.println("Selection Double Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection Double Dsc Test Failed");
        }
    }

    private static void selectionStringDsc() {
        try {
            boolean same = true;
            String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
            String[] y = new String[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            ArrayUtils.selectionStringDsc(x);
            Arrays.sort(y);

            for (int i = 0; i < x.length; i++) {
                if (!y[i].equals(x[x.length - 1 - i])) {
                    same = false;
                }
            }
            assert (same);
            System.out.println("Selection String Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection String Dsc Test Failed");
        }
    }

    private static void linearSearchInt() {
        try {
            assert (1 == 2);
            System.out.println("Linear Search Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Linear Search Int Test Failed");
        }
    }

    private static void linearSearchDouble() {
        try {
            assert (1 == 2);
            System.out.println("Linear Search Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Linear Search Double Test Failed");
        }
    }

    private static void linearSearchString() {
        try {
            assert (1 == 2);
            System.out.println("Linear Search String Test Passed");
        } catch (AssertionError e) {
            System.err.println("Linear Search String Test Failed");
        }
    }

    private static void binarySearchInt() {
        try {
            int searchVal;
            int willBeFound = (int) (Math.random() * 2);
            int ascOrDsc = (int) (Math.random() * 2);
            int[] x = ArrayUtils.generateArray(10, -100, 100); //make odd
            Integer[] y = new Integer[x.length];
            
            for (int i = 0; i < x.length; i++) {
                y[i] = x[i];
            }
            Arrays.sort(y);
            
            if (ascOrDsc == 0) {
                ArrayUtils.selectionIntAsc(x);
            } else {
                int temp;
                ArrayUtils.selectionIntDsc(x);
                for (int i = 0; i < y.length / 2; i++) {
                     temp = y[i];
                     y[i] = y[y.length -1 - i];
                     y[y.length -1 - i] = temp;
                }
            }
            if (willBeFound == 0) {
                searchVal = ArrayUtils.maxValue(x) + 1;
            } else {
                searchVal = x[(int) (Math.random() * x.length)];
            }

            assert (ArrayUtils.binarySearch(x, searchVal) == Arrays.asList(y).indexOf(searchVal));
            System.out.println("Binary Search Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Binary Search Int Test Failed");
        }
    }

    private static void binarySearchDouble() {
        try {
            assert (1 == 2);
            System.out.println("Binary Search Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Binary Search Double Test Failed");
        }
    }

    private static void binarySearchString() {
        try {
            assert (1 == 2);
            System.out.println("Binary Search String Test Passed");
        } catch (AssertionError e) {
            System.err.println("Binary Search String Test Failed");
        }
    }

}

//        //        s + char int A + int math.random * 26
//        //Test - Bubble Sort Ascending, Integers.
//        //PRE-CONDITIONS: Unsorted Integer Array with random values between, 
//        //Integer.MAX_VALUE to Integer.MIN_VALUE.
//        //POST-CONDITIONS: Sorted, from smallest to largest.
//        System.out.println("---------------------------");
//        System.out.println("Test #1 - Bubble Sort, int, ascending");
//        int[] data = ArrayUtils.gRA(100, Integer.MIN_VALUE, Integer.MAX_VALUE);
//
//        System.out.println("BEFORE");
//        Array.display(data);
//        System.out.println("1");
//        Arrays.sort(data);
//        for (int i = 0; i < data.length; i++) {
//            assert (1 == 2);
//
//        }
