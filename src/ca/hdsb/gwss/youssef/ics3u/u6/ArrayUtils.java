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
        System.out.println("------------------------------------------------------");
        for (int i : array) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------------------");
    }

    public static void display(double[] array) {
        System.out.println("------------------------------------------------------");
        for (double i : array) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------------------");
    }

    public static void display(String[] array) {
        System.out.println("------------------------------------------------------");
        for (String i : array) {
            System.out.println(i);
        }
        System.out.println("------------------------------------------------------");
    }

    public static int[] generateArray(int size, int min, int max) {
        int[] data = new int[size];
        int n;
        for (int i = 0; i < data.length; i++) {
            n = (int) (Math.random() * (max - min) + min);
            data[i] = n;
            for (int j = 0; j < i; j++) {
                //If data is in array, take 1 away from i and try again.
                if (data[j] == n) {
                    i--;
                } else {
                    data[i] = n;
                    break;
                }
            }
        }
        return data;
    }

    public static double[] generateArray(int size, double min, double max) {
        double[] data = new double[size];
        double n;
        for (int i = 0; i < data.length; i++) {
            n = Math.random() * (max - min) + min;
            data[i] = n;
            for (int j = 0; j < i; j++) {
                //If data is in array, take 1 away from i and try again.
                if (data[j] == n) {
                    i--;
                } else {
                    data[i] = n;
                    break;
                }
            }

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
            for (int j = 0; j < i; j++) {
                //If data is in array, take 1 away from i and try again.
                if (data[j].equals(str)) {
                    i--;
                } else {
                    data[i] = str;
                    break;
                }
            }

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
                //If data before is greater than data after, swap.
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
        int j;
        for (int i = 0; i < x.length; i++) {
            for (j = 1; j < x.length - i; j++) {
                //If data before is greater than data after, swap.
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
        int j;
        for (int i = 0; i < x.length; i++) {
            for (j = 1; j < x.length - i; j++) {
                //If the difference between the data before and after, is greater than 1.
                //then swap
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
                //If data before is smaller than data after, swap.
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
                //If data before is smaller than data after, swap.
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
                //If data before is smaller than data after, swap.
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
                //If data at the maxIndex is smaller than data after, record the index
                //of the data after.
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
                //If data at the maxIndex is smaller than data after, record the index
                //of the data after.
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
                //If the difference of the data at the maxIndex
                //and the data after is greater than 0, record the index
                //of the data after.
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
                //If data at the maxIndex is greater than data after, record the index
                //of the data after.
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
                //If data at the maxIndex is greater than data after, record the index
                //of the data after.
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
                //If the difference of the data at the maxIndex
                //and the data after is smaller than 0, record the index
                //of the data after.
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
        //if the data is not unique, it will return the first index of said data.
        //this is why a while loop is made instead of a for loop.
        while ((!indexFound) && i < x.length) {
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
        //if the data is not unique, it will return the first index of said data.
        //this is why a while loop is made instead of a for loop.
        while ((!indexFound) && i < x.length) {
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
        //if the data is not unique, it will return the first index of said data.
        //this is why a while loop is made instead of a for loop.
        while (!indexFound && i < x.length) {
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
        //if last index is smaller than first, reverse thinking of binary search
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
        } else {
            //while the right post is at a greater index than the left,
            //change the mid, to the middle, check if that is the correct index, 
            //then continue moving the posts whether the value read is greater or smaller than
            //the search value
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

        }
        return index;
    }

    public static int binarySearch(double[] x, double val) {
        int l = 0;
        int r = x.length - 1;
        int mid;
        int index = -1;
        //if last index is smaller than first, reverse thinking of binary search
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
        } else {
            //while the right post is at a greater index than the left,
            //change the mid, to the middle, check if that is the correct index, 
            //then continue moving the posts whether the value read is greater or smaller than
            //the search value
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

        }
        return index;
    }

    public static int binarySearch(String[] x, String val) {
        int l = 0;
        int r = x.length - 1;
        int mid;
        int index = -1;
        //if last index is smaller than first, reverse thinking of binary search
        if (x[x.length - 1].compareTo(x[0]) < 0) {
            while (r >= l) {
                mid = (l + r) / 2;
                if (x[mid].equals(val)) {
                    index = mid;
                    r = -1;
                } else if (val.compareTo(x[mid]) > 0) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        } else {
            //while the right post is at a greater index than the left,
            //change the mid, to the middle, check if that is the correct index, 
            //then continue moving the posts whether the value read is greater or smaller than
            //the search value
            while (r >= l) {
                mid = (l + r) / 2;
                if (x[mid].equals(val)) {
                    index = mid;
                    r = -1;
                } else if (val.compareTo(x[mid]) < 0) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }

        }
        return index;
    }
}
