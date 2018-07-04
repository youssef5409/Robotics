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
public class ImproperFraction extends Fraction {

    private int numerator;
    private int denominator;

    public ImproperFraction() {
    }

    public ImproperFraction(int numerator, int denominator) {

        this.numerator = numerator;
        this.denominator = denominator;

    }

    @Override
    public int getNumerator() {
        return this.numerator;
    }

    @Override
    public int getDenominator() {
        return this.denominator;
    }
    
    @Override
    public double size() {
        return (double) this.numerator / this.denominator;
    }

}
