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
public class Fraction implements FractionInterface {

    private int numerator;
    private int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        if (this.denominator == 0) {
            System.out.println("Invalid denominator, default 1");
            this.denominator = 1;
        }

        if (this.denominator < 0) {
            numerator *= -1;
            denominator *= -1;

            System.out.println("Positive denominator rule applied.");
        }

        this.reduce();
    }

    @Override
    public int getNumerator() {
        return numerator;
    }

    private int getTrueNumerator() {
        return getNumerator();
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    @Override
    public double size() {
        return (double) numerator / denominator;
    }

    public Fraction larger(Fraction f) {

        if (this.equals(f)) {
            return this;
        }

        if ((double) this.numerator / this.denominator > (double) f.getTrueNumerator() / f.getDenominator()) {
            return this;
        }
        return f;

    }

    public Fraction larger(Fraction f, Fraction g) {
        if (f.equals(g)) {
            return f;
        }

        if ((double) f.numerator / f.denominator > (double) g.getTrueNumerator() / g.getDenominator()) {
            return f;
        }
        return g;
    }

    public Fraction times(Fraction f) {
        Fraction product = new Fraction(this.numerator * f.getTrueNumerator(), this.denominator * f.getDenominator());

        return product;
    }

    public Fraction times(Fraction f, Fraction g) {
        Fraction product = new Fraction(f.numerator * g.getTrueNumerator(), f.denominator * g.getDenominator());

        return product;
    }

    public void reduce() {
        int gcd = gcd(this.numerator, this.denominator);

        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    public void invert() {
        if (this.numerator == 0) {
            System.out.println("Cannot invert denominator of 0.");
        } else {
            int temp = this.numerator;

            this.numerator = this.denominator;
            this.denominator = temp;
        }
    }

    public MixedFraction toMixed() {
        MixedFraction f = new MixedFraction(this.numerator / this.denominator, this.numerator % this.denominator, this.denominator);
        
        return f;
    }

    @Override
    public String toString() {
        if (this.numerator == this.denominator) {
            return "1";
        } else if (this.numerator == 0) {
            return "0";
        } else {
            return this.numerator + "/" + this.denominator;
        }
    }

    public boolean equals(MixedFraction obj) {
        return this.size() == obj.size();
    }

    public boolean equals(ImproperFraction obj) {
        return this.size() == obj.size();
    }

    public boolean equals(Fraction obj) {
        return this.size() == obj.size();
    }

    private static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        } else {
            return gcd(q, p % q);
        }
    }

}
