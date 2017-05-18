/*
 * Name: Youssef Mohamed
 * Date: 11th May 2017
 * Version: 0.9
 * Description: 
 *      This is a unit tester for all the methods in ArrayUtils.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

import java.util.Arrays;

/**
 *
 * @author Youss
 */
public class UnitTest {

    final static String BUFFER = "******************************************************";

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

        binarySearchIntAsc();
        binarySearchDoubleAsc();
        binarySearchStringAsc();

        binarySearchIntDsc();
        binarySearchDoubleDsc();
        binarySearchStringDsc();

    }

    private static void maxInt() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #1A      : Maximum Integer");
        System.out.println("PRE CONDITION      : Array, + and - Integers");
        System.out.println("POST CONDITION     : Maximum Value of Array is printed");

        int[] x = ArrayUtils.generateArray(10, -100, 100);
        try {
            x[0] = 101;
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);
            System.out.println("DATA AFTER: " + ArrayUtils.maxValue(x));
            assert (ArrayUtils.maxValue(x) == x[0]);
            System.out.println("Maximum Int Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Maximum Int Test Failed");
            System.out.println(BUFFER);
        }

    }

    private static void maxDouble() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #1B      : Maximum Double");
        System.out.println("PRE CONDITION      : Array, + and - Doubles");
        System.out.println("POST CONDITION     : Maximum Value of Array is printed");

        double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
        try {
            y[0] = 101.0;
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(y);
            System.out.println("DATA AFTER: " + ArrayUtils.maxValue(y));
            assert (ArrayUtils.maxValue(y) == y[0]);
            System.out.println("Maximum Double Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Maximum Double Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void minInt() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #2A      : Minimum Integer");
        System.out.println("PRE CONDITION      : Array, + and - Integers");
        System.out.println("POST CONDITION     : Minimum Value of Array is printed");

        int[] x = ArrayUtils.generateArray(10, -100, 100);
        try {
            x[0] = -101;
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);
            System.out.println("DATA AFTER: " + ArrayUtils.minValue(x));
            assert (ArrayUtils.minValue(x) == x[0]);
            System.out.println("Minimum Int Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Minimum Int Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void minDouble() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #2B      : Minimum Double");
        System.out.println("PRE CONDITION      : Array, + and - Doubles");
        System.out.println("POST CONDITION     : Minimum Value of Array is printed");
        double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
        try {
            y[0] = -101.0;
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(y);
            System.out.println("DATA AFTER: " + ArrayUtils.minValue(y));
            assert (ArrayUtils.minValue(y) == y[0]);
            System.out.println("Minimum Double Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Minimum Double Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void totalValueInt() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #3A      : Total Value Of Integer");
        System.out.println("PRE CONDITION      : Constant Difference Array, + and - Integers");
        System.out.println("POST CONDITION     : Total Value of Array is printed");
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        try {
            //Making the array have a constant difference
            int counter = 1;
            for (int i = 0; i < x.length; i++) {
                x[i] = counter++;
            }
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);
            System.out.println("DATA AFTER: " + ArrayUtils.totalValue(x));
            assert (ArrayUtils.totalValue(x) == (x.length / 2) * (2 * x[0] + (x.length - 1) * Math.abs(x[1] - x[0])));
            System.out.println("Total Int Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Total Int Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void totalValueDouble() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #3B      : Total Value Of Double");
        System.out.println("PRE CONDITION      : Constant Difference Array, + and - Double");
        System.out.println("POST CONDITION     : Total Value of Array is printed");
        double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
        try {
            //Making the array have a constant difference
            double counter = 1.5;
            for (int i = 0; i < y.length; i++) {
                y[i] = counter++;
            }
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(y);
            System.out.println("DATA AFTER: " + ArrayUtils.totalValue(y));
            assert (ArrayUtils.totalValue(y) == (y.length / 2) * (2 * y[0] + (y.length - 1) * Math.abs(y[1] - y[0])));
            System.out.println("Total Double Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Total Double Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void averageInt() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #4A      : Average Value Of Integer");
        System.out.println("PRE CONDITION      : Array, + and - Integers");
        System.out.println("POST CONDITION     : Average Value of Array is printed");
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);
            System.out.println("DATA AFTER: " + ArrayUtils.averageValue(x));
            assert (ArrayUtils.averageValue(x) == (double) ArrayUtils.totalValue(x) / x.length);
            System.out.println("Average Int Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Average Int Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void averageDouble() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #4B      : Average Value Of Double");
        System.out.println("PRE CONDITION      : Array, + and - Double");
        System.out.println("POST CONDITION     : Average Value of Array is printed");
        double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(y);
            System.out.println("DATA AFTER: " + ArrayUtils.averageValue(y));
            assert (ArrayUtils.averageValue(y) == (double) ArrayUtils.totalValue(y) / y.length);
            System.out.println("Average Double Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Average Double Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void bubbleIntAsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #5A      : Bubble Sort Integer Array Asc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Integers");
        System.out.println("POST CONDITION     : Ascending Integer Array is printed");
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        int[] y = new int[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.bubbleIntAsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            assert (Arrays.equals(x, y));
            System.out.println("Bubble Int Asc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Bubble Int Asc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void bubbleDoubleAsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #5B      : Bubble Sort Double Array Asc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Doubles");
        System.out.println("POST CONDITION     : Ascending Double Array is printed");
        double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
        double[] y = new double[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.bubbleDoubleAsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            assert (Arrays.equals(x, y));
            System.out.println("Bubble Double Asc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Bubble Double Asc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void bubbleStringAsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #5C      : Bubble Sort String Array Asc");
        System.out.println("PRE CONDITION      : Unsorted Array, Random Strings");
        System.out.println("POST CONDITION     : Ascending String Array is printed");
        String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
        String[] y = new String[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.bubbleStringAsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            assert (Arrays.equals(x, y));
            System.out.println("Bubble String Asc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Bubble String Asc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void bubbleIntDsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #6A      : Bubble Sort Integer Array Dsc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Integers");
        System.out.println("POST CONDITION     : Descending Integer Array is printed");
        boolean same = true;
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        int[] y = new int[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.bubbleIntDsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            //Instead of using array.equals, I make a custom for loop in order to
            //compare an ascending loop to a descending one.
            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[x.length - 1 - i]) {

                    same = false;
                }
            }
            assert (same);
            System.out.println("Bubble Int Dsc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Bubble Int Dsc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void bubbleDoubleDsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #6B      : Bubble Sort Double Array Dsc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Doubles");
        System.out.println("POST CONDITION     : Descending Double Array is printed");
        boolean same = true;
        double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
        double[] y = new double[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.bubbleDoubleDsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            //Instead of using array.equals, I make a custom for loop in order to
            //compare an ascending loop to a descending one.
            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[x.length - 1 - i]) {
                    same = false;
                }
            }
            assert (same);
            System.out.println("Bubble Double Dsc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Bubble Double Dsc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void bubbleStringDsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #6C      : Bubble Sort String Array Dsc");
        System.out.println("PRE CONDITION      : Unsorted Array, Random Strings");
        System.out.println("POST CONDITION     : Descending String Array is printed");
        boolean same = true;
        String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
        String[] y = new String[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);

        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.bubbleStringDsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            //Instead of using array.equals, I make a custom for loop in order to
            //compare an ascending loop to a descending one.
            for (int i = 0; i < x.length; i++) {
                if (!y[i].equals(x[x.length - 1 - i])) {
                    same = false;
                }
            }
            assert (same);
            System.out.println("Bubble String Dsc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Bubble String Dsc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void selectionIntAsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #7A      : Selection Sort Integer Array Asc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Integers");
        System.out.println("POST CONDITION     : Ascending Integer Array is printed");
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        int[] y = new int[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.selectionIntAsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            assert (Arrays.equals(x, y));
            System.out.println("Selection Int Asc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Selection Int Asc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void selectionDoubleAsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #7B      : Selection Sort Double Array Asc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Doubles");
        System.out.println("POST CONDITION     : Ascending Double Array is printed");
        double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
        double[] y = new double[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.selectionDoubleAsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            assert (Arrays.equals(x, y));
            System.out.println("Selection Double Asc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Selection Double Asc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void selectionStringAsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #7C      : Selection Sort String Array Asc");
        System.out.println("PRE CONDITION      : Unsorted Array, Random Strings");
        System.out.println("POST CONDITION     : Ascending String Array is printed");
        String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
        String[] y = new String[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.selectionStringAsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            assert (Arrays.equals(x, y));
            System.out.println("Selection String Asc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Selection String Asc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void selectionIntDsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #8A      : Selection Sort Integer Array Dsc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Integers");
        System.out.println("POST CONDITION     : Descending Integer Array is printed");
        boolean same = true;
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        int[] y = new int[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.selectionIntDsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            //Instead of using array.equals, I make a custom for loop in order to
            //compare an ascending loop to a descending one.
            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[x.length - 1 - i]) {

                    same = false;
                }
            }
            assert (same);
            System.out.println("Selection Int Dsc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Selection Int Dsc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void selectionDoubleDsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #8B      : Selection Sort Double Array Dsc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Doubles");
        System.out.println("POST CONDITION     : Descending Double Array is printed");
        boolean same = true;
        double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
        double[] y = new double[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.selectionDoubleDsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            //Instead of using array.equals, I make a custom for loop in order to
            //compare an ascending loop to a descending one.
            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[x.length - 1 - i]) {
                    same = false;
                }
            }
            assert (same);
            System.out.println("Selection Double Dsc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Selection Double Dsc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void selectionStringDsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #8C      : Selection Sort String Array Dsc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Doubles");
        System.out.println("POST CONDITION     : Descending String Array is printed");
        boolean same = true;
        String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
        String[] y = new String[x.length];
        //Copying the array x[] into the array y[], this is so I can have different
        //pointers for each of the arrays.
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.selectionStringDsc(x);
            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            //Instead of using array.equals, I make a custom for loop in order to
            //compare an ascending loop to a descending one.
            for (int i = 0; i < x.length; i++) {
                if (!y[i].equals(x[x.length - 1 - i])) {
                    same = false;
                }
            }
            assert (same);
            System.out.println("Selection String Dsc Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Selection String Dsc Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void linearSearchInt() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #9A      : Linear Search Integer Array");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Integers, no duplicates");
        System.out.println("POST CONDITION     : Index of search value is printed");
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        //I make an Integer[] array in order to use .indexOf
        Integer[] y = new Integer[x.length];
        try {
            //arraycopy does not work when copying two different types of arrays,
            //So I make a custom for loop
            for (int i = 0; i < x.length; i++) {
                y[i] = x[i];
            }

            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            for (int i = 0; i < x.length; i++) {
                System.out.println("Search: " + i + " --> " + ArrayUtils.linearSearch(x, x[i]));
                assert (ArrayUtils.linearSearch(x, x[i]) == Arrays.asList(y).indexOf(x[i]));
            }

            System.out.println("Linear Search Int Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Linear Search Int Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void linearSearchDouble() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #9B      : Linear Search Double Array");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Doubles, no duplicates");
        System.out.println("POST CONDITION     : Index of search value is printed");
        double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
        //I make an Double[] array in order to use .indexOf
        Double[] y = new Double[x.length];
        try {
            for (int i = 0; i < x.length; i++) {
                y[i] = x[i];
            }

            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            for (int i = 0; i < x.length; i++) {
                System.out.println("Search: " + i + " --> " + ArrayUtils.linearSearch(x, x[i]));
                assert (ArrayUtils.linearSearch(x, x[i]) == Arrays.asList(y).indexOf(x[i]));
            }

            System.out.println("Linear Search Double Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Linear Search Double Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void linearSearchString() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #9C      : Linear Search String Array");
        System.out.println("PRE CONDITION      : Unsorted Array, Random Strings, no duplicates");
        System.out.println("POST CONDITION     : Index of search value is printed");
        String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
        String[] y = new String[x.length];
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            for (int i = 0; i < x.length; i++) {
                System.out.println("Search: " + i + " --> " + ArrayUtils.linearSearch(x, x[i]));
                assert (ArrayUtils.linearSearch(x, x[i]) == Arrays.asList(y).indexOf(x[i]));
            }

            System.out.println("Linear Search String Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Linear Search String Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void binarySearchIntAsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #10A     : Binary Search Integer Array");
        System.out.println("PRE CONDITION      : Ascending sorted Array, Random Integers, no duplicates");
        System.out.println("POST CONDITION     : Index of search value is printed");
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        Integer[] y = new Integer[x.length];
        try {
            for (int i = 0; i < x.length; i++) {
                y[i] = x[i];
            }

            Arrays.sort(y);
            ArrayUtils.selectionIntAsc(x);

            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            for (int i = 0; i < x.length; i++) {
                System.out.println("Search: " + i + " --> " + ArrayUtils.linearSearch(x, x[i]));
                assert (ArrayUtils.linearSearch(x, x[i]) == Arrays.asList(y).indexOf(x[i]));
            }
            System.out.println("Binary Search Int Ascending Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Binary Search Int Ascending Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void binarySearchDoubleAsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #10B     : Binary Search Double Array");
        System.out.println("PRE CONDITION      : Ascending sorted Array, Random Doubles, no duplicates");
        System.out.println("POST CONDITION     : Index of search value is printed");
        double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
        Double[] y = new Double[x.length];
        try {
            for (int i = 0; i < x.length; i++) {
                y[i] = x[i];
            }

            Arrays.sort(y);
            ArrayUtils.selectionDoubleAsc(x);

            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            for (int i = 0; i < x.length; i++) {
                System.out.println("Search: " + i + " --> " + ArrayUtils.linearSearch(x, x[i]));
                assert (ArrayUtils.linearSearch(x, x[i]) == Arrays.asList(y).indexOf(x[i]));
            }
            System.out.println("Binary Search Double Ascending Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Binary Search Double Ascending Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void binarySearchStringAsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #10C     : Binary Search String Array");
        System.out.println("PRE CONDITION      : Ascending Sorted Array, Random Strings, no duplicates");
        System.out.println("POST CONDITION     : Index of search value is printed");
        String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
        String[] y = new String[x.length];
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            Arrays.sort(y);
            ArrayUtils.selectionStringAsc(x);

            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            for (int i = 0; i < x.length; i++) {
                System.out.println("Search: " + i + " --> " + ArrayUtils.linearSearch(x, x[i]));
                assert (ArrayUtils.linearSearch(x, x[i]) == Arrays.asList(y).indexOf(x[i]));
            }
            System.out.println("Binary Search String Ascending Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Binary Search String Ascending Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void binarySearchIntDsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #11A     : Binary Search Integer Array");
        System.out.println("PRE CONDITION      : Descending sorted Array, Random Integers, no duplicates");
        System.out.println("POST CONDITION     : Index of search value is printed");
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        Integer[] y = new Integer[x.length];
        int temp;
        try {
            for (int i = 0; i < x.length; i++) {
                y[i] = x[i];
            }

            Arrays.sort(y);
            ArrayUtils.selectionIntDsc(x);

            for (int i = 0; i < y.length / 2; i++) {
                temp = y[i];
                y[i] = y[y.length - 1 - i];
                y[y.length - 1 - i] = temp;
            }

            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            for (int i = 0; i < x.length; i++) {
                System.out.println("Search: " + i + " --> " + ArrayUtils.linearSearch(x, x[i]));
                assert (ArrayUtils.linearSearch(x, x[i]) == Arrays.asList(y).indexOf(x[i]));
            }
            System.out.println("Binary Search Int Descending Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Binary Search Int Descending Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void binarySearchDoubleDsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #11B     : Binary Search Double Array");
        System.out.println("PRE CONDITION      : Descending sorted Array, Random Doubles, no duplicates");
        System.out.println("POST CONDITION     : Index of search value is printed");
        double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
        Double[] y = new Double[x.length];
        double temp;
        try {
            for (int i = 0; i < x.length; i++) {
                y[i] = x[i];
            }

            Arrays.sort(y);
            ArrayUtils.selectionDoubleDsc(x);

            for (int i = 0; i < y.length / 2; i++) {
                temp = y[i];
                y[i] = y[y.length - 1 - i];
                y[y.length - 1 - i] = temp;
            }

            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            for (int i = 0; i < x.length; i++) {
                System.out.println("Search: " + i + " --> " + ArrayUtils.linearSearch(x, x[i]));
                assert (ArrayUtils.linearSearch(x, x[i]) == Arrays.asList(y).indexOf(x[i]));
            }
            System.out.println("Binary Search Double Descending Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Binary Search Double Descending Test Failed");
            System.out.println(BUFFER);
        }
    }

    private static void binarySearchStringDsc() {
        //Printing Introductory Information
        System.out.println(BUFFER);
        System.out.println("TEST CASE #11C     : Binary Search String Array");
        System.out.println("PRE CONDITION      : Descending Sorted Array, Random Strings, no duplicates");
        System.out.println("POST CONDITION     : Index of search value is printed");
        String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
        String[] y = new String[x.length];
        String temp;
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            Arrays.sort(y);
            ArrayUtils.selectionStringDsc(x);

            for (int i = 0; i < y.length / 2; i++) {
                temp = y[i];
                y[i] = y[y.length - 1 - i];
                y[y.length - 1 - i] = temp;
            }

            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            for (int i = 0; i < x.length; i++) {
                System.out.println("Search: " + i + " --> " + ArrayUtils.linearSearch(x, x[i]));
                assert (ArrayUtils.linearSearch(x, x[i]) == Arrays.asList(y).indexOf(x[i]));
            }
            System.out.println("Binary Search String Descending Test Passed");
            System.out.println(BUFFER);
        } catch (AssertionError e) {
            System.out.println(BUFFER);
            System.err.println("Binary Search String Descending Test Failed");
            System.out.println(BUFFER);
        }
    }
}
