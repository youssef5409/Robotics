/*
 * Name: Youssef Mohamed
 * Date: 28th Apr 2017
 * Version: 0.9
 * Description: 
 *      Library for utilities that take in an array and manipulate them in order to,
 *      find the max value, min value, total, and average.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

/**
 *
 * @author Youss
 */
public class ArrayUtils {

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
            data[i] = (int) (Math.random() * (max - min) + min);
        }
        return data;
    }

    public static double[] generateArray(int size, double min, double max) {
        double[] data = new double[size];

        for (int i = 0; i < data.length; i++) {

            data[i] = Math.random() * (max - min) + min;
        }
        return data;
    }

    public static String[] generateArray(int size, int lengthOfString, char min, char max) {
        String[] data = new String[size];
        String str;
        for (int i = 0; i < data.length; i++) {
            str = "";
            for (int j = 0; j < lengthOfString; j++) {
                str += Character.toString((char) (int) (Math.random() * (max - min) + min));
            }
            data[i] = str;
        }
        return data;
    }

    //Checks if a value is greater than another; it carries and returns the greatest value.
    public static int maxValue(int x[]) {
        int maximum = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > maximum) {
                maximum = x[i];
            }
        }
        return maximum;
    }

    public static double maxValue(double x[]) {
        double maximum = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > maximum) {
                maximum = x[i];
            }
        }
        return maximum;
    }

    //Checks if a value is smaller than another; it carries and returns the smallest value.
    public static int minValue(int x[]) {
        int minimum = x[0];
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] < minimum) {
                minimum = x[i];
            }
        }
        return minimum;
    }

    public static double minValue(double x[]) {
        double minimum = x[0];
        for (int i = 0; i < x.length - 1; i++) {
            if (x[i] < minimum) {
                minimum = x[i];
            }
        }
        return minimum;
    }

    //Finds the average of the numbers in an array, by adding them all up and dividing by length.
    public static double averageValue(int x[]) {
        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total / x.length;
    }

    public static double averageValue(double x[]) {
        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total / x.length;
    }

    //Finds the total of the numbers by adding them up.
    public static int totalValue(int x[]) {
        int total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total;
    }

    public static double totalValue(double x[]) {
        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        return total;
    }
    //Repeating all methods, for doubles.

    public static void bubbleIntAsc(int[] x) {
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
    }

    public static void bubbleDoubleAsc(double[] x) {
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

    public static void bubbleIntDsc(int[] array) {
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
        int j;
        int maxIndex;
        int temp;

        for (int i = 0; i < x.length - 1; i++) {
            maxIndex = x.length - 1 - i;
            for (j = 0; j < x.length - i; j++) {
                if (x[j] > x[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = x[x.length - i - 1];
            x[x.length - i - 1] = x[maxIndex];
            x[maxIndex] = temp;
        }
    }

    public static void selectionDoubleAsc(double[] x) {
        int j;
        int maxIndex;
        double temp;

        for (int i = 0; i < x.length - 1; i++) {
            maxIndex = x.length - 1 - i;
            for (j = 0; j < x.length - i; j++) {
                if (x[j] > x[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = x[x.length - i - 1];
            x[x.length - i - 1] = x[maxIndex];
            x[maxIndex] = temp;
        }
    }

    public static void selectionStringAsc(String[] x) {
        int j;
        int maxIndex;
        String temp;

        for (int i = 0; i < x.length - 1; i++) {
            maxIndex = x.length - 1 - i;
            for (j = 0; j < x.length - i; j++) {
                if (x[j].compareTo(x[maxIndex]) > 0) {
                    maxIndex = j;
                }
            }
            temp = x[x.length - i - 1];
            x[x.length - i - 1] = x[maxIndex];
            x[maxIndex] = temp;
        }
    }

    public static void selectionIntDsc(int[] x) {
        int j;
        int maxIndex;
        int temp;

        for (int i = 0; i < x.length - 1; i++) {
            maxIndex = x.length - 1 - i;
            for (j = 0; j < x.length - i; j++) {
                if (x[j] < x[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = x[x.length - i - 1];
            x[x.length - i - 1] = x[maxIndex];
            x[maxIndex] = temp;
        }
    }

    public static void selectionDoubleDsc(double[] x) {
        int j;
        int maxIndex;
        double temp;

        for (int i = 0; i < x.length - 1; i++) {
            maxIndex = x.length - 1 - i;
            for (j = 0; j < x.length - i; j++) {
                if (x[j] < x[maxIndex]) {
                    maxIndex = j;
                }
            }
            temp = x[x.length - i - 1];
            x[x.length - i - 1] = x[maxIndex];
            x[maxIndex] = temp;
        }
    }

    public static void selectionStringDsc(String[] x) {
        int j;
        int maxIndex;
        String temp;

        for (int i = 0; i < x.length - 1; i++) {
            maxIndex = x.length - 1 - i;
            for (j = 0; j < x.length - i; j++) {
                if (x[j].compareTo(x[maxIndex]) < 0) {
                    maxIndex = j;
                }
            }
            temp = x[x.length - i - 1];
            x[x.length - i - 1] = x[maxIndex];
            x[maxIndex] = temp;
        }
    }

    public static int linearSearch(int[] x, int val) {
        int index = -1;
        int i = 0;
        boolean indexFound = false;

        while (!indexFound) {
            if (x[i] == val) {
                index = i;
                indexFound = true;
            }
            i++;
        }
        return index;
    }

    public static int linearSearch(double[] x, double val) {
        int index = -1;
        int i = 0;
        boolean indexFound = false;

        while (!indexFound) {
            if (x[i] == val) {
                index = i;
                indexFound = true;
            }
            i++;
        }
        return index;
    }

    public static int linearSearch(String[] x, String val) {
        int index = -1;
        int i = 0;
        boolean indexFound = false;

        while (!indexFound) {
            if (x[i].equals(val)) {
                index = i;
                indexFound = true;
            }
            i++;
        }
        return index;
    }

    public static int binarySearch(int[] x, int val) {
        int l = 0;
        int r = x.length - 1;
        int mid;
        int index = -1;

        if (x[x.length - 1] < x[0]) {
            while (r >= l) {
                mid = (l + r) / 2;
                if (x[mid] == val) {
                    index = mid;
                    r = -1;
                } else if (val > x[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }

        while (r >= l) {
            mid = (l + r) / 2;
            if (x[mid] == val) {
                index = mid;
                r = -1;
            } else if (val < x[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }

    public static int binarySearch(double[] x, double val) {
        int l = 0;
        int r = x.length - 1;
        int mid;
        int index = -1;

        if (x[x.length - 1] < x[0]) {
            while (r >= l) {
                mid = (l + r) / 2;
                if (x[mid] == val) {
                    index = mid;
                    r = -1;
                } else if (val > x[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }

        while (r >= l) {
            mid = (l + r) / 2;
            if (x[mid] == val) {
                r = -1;
            } else if (val < x[mid]) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }

    public static int binarySearch(String[] x, String val) {
        int l = 0;
        int r = x.length - 1;
        int mid;
        int index = -1;

        if (x[x.length - 1].compareTo(x[0]) < 0) {
            while (r >= l) {
                mid = (l + r) / 2;
                if (x[mid].equals(val)) {
                    r = -1;
                } else if (val.compareTo(x[mid]) < 0) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }

        while (r >= l) {
            mid = (l + r) / 2;
            if (x[mid].equals(val)) {
                r = -1;
            } else if (val.compareTo(x[mid]) < 0) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return index;
    }
}

//    public static String averageValue(String[] x[]) {
//        
//    }
//    public static String minValue(String[] x) {
//        String maximum = x[0];
//        for (int i = 1; i > x.length; i++) {
//            if (x[i].compareTo(maximum) > 0) {
//                maximum = x[i];
//            }
//        }
//        return maximum;
//    }
//    public static String maxValue(String[] x) {
//        String maximum = x[0];
//        for (int i = 1; i < x.length; i++) {
//            if (x[i].compareTo(maximum) > 0) {
//                maximum = x[i];
//            }
//        }
//        return maximum;
//    }