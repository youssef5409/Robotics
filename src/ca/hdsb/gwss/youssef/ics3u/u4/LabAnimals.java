/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

import static jdk.nashorn.internal.objects.Global.Infinity;

/**
 *
 * @author 1mohamedyou
 */
public class LabAnimals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int denominator = 1;
        double total = 0;
        
        while (total < 2) {
            total = total + (Math.pow(denominator, -1));
            if (total != Infinity) {
            System.out.println(total);
            }
            denominator = denominator * 2;
        }
    }
    
}
