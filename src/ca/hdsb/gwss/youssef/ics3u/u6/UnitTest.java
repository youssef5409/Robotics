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
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
        String[] z = ArrayUtils.generateArray(10, 4, 'A', '[');

        maxInt(x);
        maxDouble(y);

        minInt(x);
        minDouble(y);

        totalValueInt(x);
        totalValueDouble(y);

        averageInt(x);
        averageDouble(y);

        bubbleIntAsc(x);
        bubbleDoubleAsc(y);
        bubbleStringAsc(z);

        bubbleIntDsc(x);
        bubbleDoubleDsc(y);
        bubbleStringDsc(z);

        selectionIntAsc(x);
        selectionDoubleAsc(y);
        selectionStringAsc(z);

        selectionIntDsc(x);
        selectionDoubleDsc(y);
        selectionStringDsc(z);

        linearSearchInt(x);
        linearSearchDouble(y);
        linearSearchString(z);

        binarySearchInt(x);
        binarySearchDouble(y);
        binarySearchString(z);

    }

    private static void maxInt(int[] x) {
        try {
            x[0] = 101;
            assert (ArrayUtils.maxValue(x) == 101);
            System.out.println("Maximum Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Maximum Int Test Failed");
        }

    }

    private static void maxDouble(double[] y) {
        try {
            y[0] = 101.0;
            assert (ArrayUtils.maxValue(y) == 101.0);
            System.out.println("Maximum Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Maximum Double Test Failed");
        }
    }

    private static void minInt(int[] x) {
        try {
            x[0] = -101;
            assert (ArrayUtils.minValue(x) == -101);
            System.out.println("Minimum Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Minimum Int Test Failed");
        }
    }

    private static void minDouble(double[] y) {
        try {
            y[0] = -101.0;
            assert (ArrayUtils.minValue(y) == -101.0);
            System.out.println("Minimum Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Minimum Double Test Failed");
        }
    }

    private static void totalValueInt(int[] x) {
        try {
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

    private static void totalValueDouble(double[] y) {
        try {
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

    private static void averageInt(int[] x) {
        try {
            assert (ArrayUtils.averageValue(x) == (double) ArrayUtils.totalValue(x) / x.length);
            System.out.println("Average Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Average Int Test Failed");
        }
    }

    private static void averageDouble(double[] y) {
        try {
            assert (ArrayUtils.averageValue(y) == (double) ArrayUtils.totalValue(y) / y.length);
            System.out.println("Average Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Average Double Test Failed");
        }
    }

    private static void bubbleIntAsc(int[] x) {
        try {
            int[] y = x;
            ArrayUtils.bubbleIntAsc(x);
            for (int i = 0; i < y.length; i++) {
                System.out.println(y[i]);
            }
            Arrays.sort(y);
            

            
            assert (x == y);
            System.out.println("Bubble Int Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble Int Asc Test Failed");
        }
    }

    private static void bubbleDoubleAsc(double[] y) {
        try {
            double[] x = y;
            ArrayUtils.bubbleDoubleAsc(x);
            Arrays.sort(y);
            assert (x == y);
            System.out.println("Bubble Double Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble Double Asc Test Failed");
        }
    }

    private static void bubbleStringAsc(String[] z) {
        try {
            String[] x = z;
            ArrayUtils.bubbleStringAsc(z);
            Arrays.sort(x);
            
            assert (x == z);
            System.out.println("Bubble String Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble String Asc Test Failed");
        }
    }

    private static void bubbleIntDsc(int[] x) {
        try {
            boolean same = true;
            
            int[] y = x;
            
            ArrayUtils.bubbleIntDsc(y);
            
            Arrays.sort(x);
            
            for (int i = 0; i < x.length / 2; i++) {
                if (y[i] != x[i]) {

                    same = false;
                }
                
            }
            
            assert (same);
            System.out.println("Bubble Int Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble Int Dsc Test Failed");
        }
    }

    private static void bubbleDoubleDsc(double[] y) {
        try {
            assert (1 == 2);
            System.out.println("Bubble Double Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble Double Dsc Test Failed");
        }
    }

    private static void bubbleStringDsc(String[] z) {
        try {
            boolean same = true;
            String[] x = z;
            ArrayUtils.bubbleStringAsc(z);
            
            Arrays.sort(x);
            
            for (int i = 0; i < x.length; i++) {
                if (!x[i].equals(z[x.length - 1 - i])) {
                    same = false;
                }
                
            }
            
            assert (same);
            System.out.println("Bubble String Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Bubble String Dsc Test Failed");
        }
    }

    private static void selectionIntAsc(int[] x) {
        try {
            assert (1 == 2);
            System.out.println("Selection Int Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection Int Asc Test Failed");
        }
    }

    private static void selectionDoubleAsc(double[] y) {
        try {
            assert (1 == 2);
            System.out.println("Selection Double Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection Double Asc Test Failed");
        }
    }

    private static void selectionStringAsc(String[] z) {
        try {
            assert (1 == 2);
            System.out.println("Selection String Asc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection String Asc Test Failed");
        }
    }

    private static void selectionIntDsc(int[] x) {
        try {
            assert (1 == 2);
            System.out.println("Selection Int Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection Int Dsc Test Failed");
        }
    }

    private static void selectionDoubleDsc(double[] y) {
        try {
            assert (1 == 2);
            System.out.println("Selection Double Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection Double Dsc Test Failed");
        }
    }

    private static void selectionStringDsc(String[] z) {
        try {
            assert (1 == 2);
            System.out.println("Selection String Dsc Test Passed");
        } catch (AssertionError e) {
            System.err.println("Selection String Dsc Test Failed");
        }
    }

    private static void linearSearchInt(int[] x) {
        try {
            assert (1 == 2);
            System.out.println("Linear Search Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Linear Search Int Test Failed");
        }
    }

    private static void linearSearchDouble(double[] y) {
        try {
            assert (1 == 2);
            System.out.println("Linear Search Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Linear Search Double Test Failed");
        }
    }

    private static void linearSearchString(String[] z) {
        try {
            assert (1 == 2);
            System.out.println("Linear Search String Test Passed");
        } catch (AssertionError e) {
            System.err.println("Linear Search String Test Failed");
        }
    }

    private static void binarySearchInt(int[] x) {
        try {
            assert (1 == 2);
            System.out.println("Binary Search Int Test Passed");
        } catch (AssertionError e) {
            System.err.println("Binary Search Int Test Failed");
        }
    }

    private static void binarySearchDouble(double[] y) {
        try {
            assert (1 == 2);
            System.out.println("Binary Search Double Test Passed");
        } catch (AssertionError e) {
            System.err.println("Binary Search Double Test Failed");
        }
    }

    private static void binarySearchString(String[] z) {
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
