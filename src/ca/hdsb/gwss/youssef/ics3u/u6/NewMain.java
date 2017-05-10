/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

import java.util.Arrays;

/**
 *
 * @author 1mohamedyou
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

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
        System.out.println(searchVal + " search");
        for (String i : x) {
            System.out.println(i);
        }
        System.out.println(ArrayUtils.binarySearch(x, searchVal) + " mine");
        System.out.println(Arrays.asList(y).indexOf(searchVal) + " it");
    }

}
