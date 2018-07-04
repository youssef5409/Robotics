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
public class MixedFraction extends Fraction {

    private int numerator;
    private int denominator;
    private int whole;

    public MixedFraction() {
    }

    public MixedFraction(int whole, int numerator, int denominator) {
        this.whole = whole;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    protected int getTrueNumerator() {
        return this.numerator + this.denominator * this.whole;
    }

    public ImproperFraction toImproper() {
        ImproperFraction f = new ImproperFraction(getTrueNumerator(), this.denominator);
        return f;
    }
    
    public Fraction toProper() {
        return toImproper();
    }

    @Override
    public double size() {
        return this.toImproper().size();
    }

    @Override
    public String toString() {
        return this.whole + " + " + this.numerator + "/" + this.denominator;
    }

    public MixedFraction reduceMixed() {
        Fraction f = this.toImproper();
        f.reduce();
        return f.toMixed();

    }

    public MixedFraction invertMixed() {
        Fraction f = this.toImproper();
        f.invert();
        return f.toMixed();
    }

}
