/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

/**
 *
 * @author 1mohamedyou
 */
public class FibonacciSeries {

    public void seriesOfFibonacci() {
        int a = 0;
        int b = 1;
        for ( int i = 0; i < 20; i++) {
            System.out.println(b);
            b += a;
            a++;
        }
    }
}
