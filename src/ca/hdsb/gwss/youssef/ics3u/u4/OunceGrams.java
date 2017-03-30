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
public class OunceGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double OUNCE_TO_GRAM = 28.3495231;
        
        System.out.println("Ounce To Grams Conversion Chart");
        
        System.out.println("This program will print out a titled table that can "
                + "be used to convert ounces to grams, for values from 1 to 15. "
                + "(1 ounce = 28.35 grams)");
        
        System.out.format("%-6s | %4s \n", "Ounces", "Grams");
        for (int i = 1; i < 16; i++) {
            System.out.format("%6s | %6.2f\n", i, i * OUNCE_TO_GRAM);
        }
    }

}
