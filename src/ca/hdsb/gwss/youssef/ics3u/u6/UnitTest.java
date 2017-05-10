/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

import java.util.Arrays;

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

        System.out.println("******************************************************");
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Maximum Int Test Failed");
            System.out.println("******************************************************");
        }

    }

    private static void maxDouble() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #1B      : Maximum Double");
        System.out.println("PRE CONDITION      : Array, + and - Doubles");
        System.out.println("POST CONDITION     : Maximum Value of Array is printed");

        double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
        try {
            y[0] = 101.0;
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(y);
            System.out.println("DATA AFTER: " + ArrayUtils.maxValue(y));
            assert (ArrayUtils.maxValue(y) == 101.0);
            System.out.println("Maximum Double Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Maximum Double Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void minInt() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #2A      : Minimum Integer");
        System.out.println("PRE CONDITION      : Array, + and - Integers");
        System.out.println("POST CONDITION     : Minimum Value of Array is printed");

        int[] x = ArrayUtils.generateArray(10, -100, 100);
        try {
            x[0] = -101;
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);
            System.out.println("DATA AFTER: " + ArrayUtils.minValue(x));
            assert (ArrayUtils.minValue(x) == -101);
            System.out.println("Minimum Int Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Minimum Int Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void minDouble() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #2B      : Minimum Double");
        System.out.println("PRE CONDITION      : Array, + and - Doubles");
        System.out.println("POST CONDITION     : Minimum Value of Array is printed");
        double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
        try {
            y[0] = -101.0;
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(y);
            System.out.println("DATA AFTER: " + ArrayUtils.minValue(y));
            assert (ArrayUtils.minValue(y) == -101.0);
            System.out.println("Minimum Double Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Minimum Double Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void totalValueInt() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #3A      : Total Value Of Integer");
        System.out.println("PRE CONDITION      : Constant Difference Array, + and - Integers");
        System.out.println("POST CONDITION     : Total Value of Array is printed");
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        try {
            int counter = 1;
            for (int i = 0; i < x.length; i++) {
                x[i] = counter++;
            }
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);
            System.out.println("DATA AFTER: " + ArrayUtils.totalValue(x));
            assert (ArrayUtils.totalValue(x) == (x.length / 2) * (2 * x[0] + (x.length - 1) * Math.abs(x[1] - x[0])));
            System.out.println("Total Int Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Total Int Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void totalValueDouble() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #3B      : Total Value Of Double");
        System.out.println("PRE CONDITION      : Constant Difference Array, + and - Double");
        System.out.println("POST CONDITION     : Total Value of Array is printed");
        double[] y = ArrayUtils.generateArray(10, -100.0, 100.0);
        try {
            double counter = 1.5;
            for (int i = 0; i < y.length; i++) {
                y[i] = counter++;
            }
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(y);
            System.out.println("DATA AFTER: " + ArrayUtils.totalValue(y));
            assert (ArrayUtils.totalValue(y) == (y.length / 2) * (2 * y[0] + (y.length - 1) * Math.abs(y[1] - y[0])));
            System.out.println("Total Double Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Total Double Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void averageInt() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #4A      : Average Value Of Integer");
        System.out.println("PRE CONDITION      : Array, + and - Integer");
        System.out.println("POST CONDITION     : Average Value of Array is printed");
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);
            System.out.println("DATA AFTER: " + ArrayUtils.averageValue(x));
            assert (ArrayUtils.averageValue(x) == (double) ArrayUtils.totalValue(x) / x.length);
            System.out.println("Average Int Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Average Int Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void averageDouble() {
        System.out.println("******************************************************");
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Average Double Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void bubbleIntAsc() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #5A      : Bubble Sort Integer Array Asc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Integers");
        System.out.println("POST CONDITION     : Ascending Sorted Array is printed");
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        int[] y = new int[x.length];
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Bubble Int Asc Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void bubbleDoubleAsc() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #5B      : Bubble Sort Double Array Asc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Doubles");
        System.out.println("POST CONDITION     : Ascending Sorted Array is printed");
        double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
        double[] y = new double[x.length];
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Bubble Double Asc Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void bubbleStringAsc() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #5C      : Bubble Sort String Array Asc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Strings");
        System.out.println("POST CONDITION     : Ascending Sorted Array is printed");
        String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
        String[] y = new String[x.length];
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Bubble String Asc Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void bubbleIntDsc() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #6A      : Bubble Sort Integer Array Dsc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Integers");
        System.out.println("POST CONDITION     : Descending Sorted Array is printed");
        boolean same = true;
        int[] x = ArrayUtils.generateArray(10, -100, 100);
        int[] y = new int[x.length];
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.bubbleIntDsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[x.length - 1 - i]) {

                    same = false;
                }
            }
            assert (same);
            System.out.println("Bubble Int Dsc Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Bubble Int Dsc Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void bubbleDoubleDsc() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #6B      : Bubble Sort Double Array Dsc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Doubles");
        System.out.println("POST CONDITION     : Descending Sorted Array is printed");
        boolean same = true;
        double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
        double[] y = new double[x.length];
        System.arraycopy(x, 0, y, 0, x.length);
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);

            ArrayUtils.bubbleDoubleDsc(x);

            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);

            Arrays.sort(y);
            for (int i = 0; i < x.length; i++) {
                if (y[i] != x[x.length - 1 - i]) {
                    same = false;
                }
            }
            assert (same);
            System.out.println("Bubble Double Dsc Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Bubble Double Dsc Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void bubbleStringDsc() {
        System.out.println("******************************************************");
        System.out.println("TEST CASE #6C      : Bubble Sort String Array Dsc");
        System.out.println("PRE CONDITION      : Unsorted Array, + and - Strings");
        System.out.println("POST CONDITION     : Descending Sorted Array is printed");
        boolean same = true;
        String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
        String[] y = new String[x.length];
        System.arraycopy(x, 0, y, 0, x.length);
        
        try {
            System.out.println("DATA BEFORE        : (See Below)");
            ArrayUtils.display(x);
            
            ArrayUtils.bubbleStringDsc(x);
            
            System.out.println("DATA AFTER: (See Below)");
            ArrayUtils.display(x);
       
            Arrays.sort(y);
            for (int i = 0; i < x.length; i++) {
                if (!y[i].equals(x[x.length - 1 - i])) {
                    same = false;
                }
            }
            assert (same);
            System.out.println("Bubble String Dsc Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Bubble String Dsc Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void selectionIntAsc() {
                    int[] x = ArrayUtils.generateArray(10, -100, 100);
            int[] y = new int[x.length];
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Selection Int Asc Test Failed");
            System.out.println("******************************************************");
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Selection Double Asc Test Failed");
            System.out.println("******************************************************");
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Selection String Asc Test Failed");
            System.out.println("******************************************************");
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Selection Int Dsc Test Failed");
            System.out.println("******************************************************");
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Selection Double Dsc Test Failed");
            System.out.println("******************************************************");
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
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Selection String Dsc Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void linearSearchInt() {
        try {
            int searchVal;
            int willBeFound = (int) (Math.random() * 2);
            int[] x = ArrayUtils.generateArray(10, -100, 100);
            Integer[] y = new Integer[x.length];

            for (int i = 0; i < x.length; i++) {
                y[i] = x[i];
            }

            if (willBeFound == 0) {
                searchVal = ArrayUtils.maxValue(x) + 1;
            } else {
                searchVal = x[(int) (Math.random() * x.length)];
            }

            assert (ArrayUtils.linearSearch(x, searchVal) == Arrays.asList(y).indexOf(searchVal));
            System.out.println("Linear Search Int Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Linear Search Int Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void linearSearchDouble() {
        try {
            double searchVal;
            int willBeFound = (int) (Math.random() * 2);
            double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
            Double[] y = new Double[x.length];

            for (int i = 0; i < x.length; i++) {
                y[i] = x[i];
            }

            if (willBeFound == 0) {
                searchVal = ArrayUtils.maxValue(x) + 1;
            } else {
                searchVal = x[(int) (Math.random() * x.length)];
            }

            assert (ArrayUtils.linearSearch(x, searchVal) == Arrays.asList(y).indexOf(searchVal));
            System.out.println("Linear Search Double Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Linear Search Double Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void linearSearchString() {
        try {
            String searchVal;
            int willBeFound = (int) (Math.random() * 2);
            String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
            String[] y = new String[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            if (willBeFound == 0) {
                searchVal = "";
            } else {
                searchVal = x[(int) (Math.random() * x.length)];
            }

            assert (ArrayUtils.linearSearch(x, searchVal) == Arrays.asList(y).indexOf(searchVal));
            System.out.println("Linear Search String Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Linear Search String Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void binarySearchInt() {
        try {
            int searchVal;
            int willBeFound = (int) (Math.random() * 2);
            int ascOrDsc = (int) (Math.random() * 2);
            int[] x = ArrayUtils.generateArray(10, -100, 100);
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
                    y[i] = y[y.length - 1 - i];
                    y[y.length - 1 - i] = temp;
                }
            }
            if (willBeFound == 0) {
                searchVal = ArrayUtils.maxValue(x) + 1;
            } else {
                searchVal = x[(int) (Math.random() * x.length)];
            }

            assert (ArrayUtils.binarySearch(x, searchVal) == Arrays.asList(y).indexOf(searchVal));
            System.out.println("Binary Search Int Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Binary Search Int Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void binarySearchDouble() {
        try {
            double searchVal;
            int willBeFound = (int) (Math.random() * 2);
            int ascOrDsc = (int) (Math.random() * 2);
            double[] x = ArrayUtils.generateArray(10, -100.0, 100.0);
            Double[] y = new Double[x.length];

            for (int i = 0; i < x.length; i++) {
                y[i] = x[i];
            }
            Arrays.sort(y);

            if (ascOrDsc == 0) {
                ArrayUtils.selectionDoubleAsc(x);
            } else {
                double temp;
                ArrayUtils.selectionDoubleDsc(x);
                for (int i = 0; i < y.length / 2; i++) {
                    temp = y[i];
                    y[i] = y[y.length - 1 - i];
                    y[y.length - 1 - i] = temp;
                }
            }
            if (willBeFound == 0) {
                searchVal = ArrayUtils.maxValue(x) + 1;
            } else {
                searchVal = x[(int) (Math.random() * x.length)];
            }

            assert (ArrayUtils.binarySearch(x, searchVal) == Arrays.asList(y).indexOf(searchVal));
            System.out.println("Binary Search Double Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Binary Search Double Test Failed");
            System.out.println("******************************************************");
        }
    }

    private static void binarySearchString() {
        try {
            String searchVal;
            int willBeFound = (int) (Math.random() * 2);
            int ascOrDsc = (int) (Math.random() * 2);
            String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
            String[] y = new String[x.length];

            System.arraycopy(x, 0, y, 0, x.length);

            Arrays.sort(y);

            if (ascOrDsc == 0) {
                ArrayUtils.selectionStringAsc(x);
            } else {
                String temp;
                ArrayUtils.selectionStringDsc(x);
                for (int i = 0; i < y.length / 2; i++) {
                    temp = y[i];
                    y[i] = y[y.length - 1 - i];
                    y[y.length - 1 - i] = temp;
                }
            }
            if (willBeFound == 0) {
                searchVal = "";
            } else {
                searchVal = x[(int) (Math.random() * x.length)];
            }

            assert (ArrayUtils.binarySearch(x, searchVal) == Arrays.asList(y).indexOf(searchVal));
            System.out.println("Binary Search String Test Passed");
            System.out.println("******************************************************");
        } catch (AssertionError e) {
            System.out.println("******************************************************");
            System.err.println("Binary Search String Test Failed");
            System.out.println("******************************************************");
        }
    }
}
