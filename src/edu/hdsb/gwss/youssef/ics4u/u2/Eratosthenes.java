/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u2;

/**
 *
 * @author 1mohamedyou
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[999];
        boolean[] notPrime = new boolean[999];

        for (int i = 2; i < numbers.length + 2; i++) {
            numbers[i - 2] = i;
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < notPrime.length; j++) {
                if (numbers[i] == numbers[j]) {
                } else if (numbers[i] % numbers[j] == 0) {
                    notPrime[i] = true;
                }
            }
        }

        for (int i = 0; i < notPrime.length; i++) {
            if (!notPrime[i]) {
                System.out.println(numbers[i]);
            }
        }
    }
}