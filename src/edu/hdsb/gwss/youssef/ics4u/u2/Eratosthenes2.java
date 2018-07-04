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
public class Eratosthenes2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean[] primes = new boolean[1001];

        for (int i = 2; i < primes.length; i++) {
            if (i % 2 == 0) {

            } else {
                primes[i] = true;
            }
        }
        for (int i = 2; i < primes.length; i += 2) {
            for (int j = 0; j < primes.length; j++) {
                if (i * j >= 1000) {
                    break;
                } else {
                    primes[i * j] = false;
                }
            }
        }
        for (boolean g : primes) {
            System.out.println(g);
        }
    }

}
