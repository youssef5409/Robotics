/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.Fractions;

/**
 *
 * @author 1mohamedyou
 */
public class FractionTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fraction f = new Fraction(0, 0); //Default denom error

        f = new Fraction(0, 2);
        System.out.println(f); //Should be just 0

        f = new Fraction(2, 4);

        System.out.println(f); //Should be 1/2

        System.out.println(f.toMixed()); //Should be 0 + 1/2

        ImproperFraction f1 = new ImproperFraction(2, 4);

        assert (f.equals(f1));

    }

}
