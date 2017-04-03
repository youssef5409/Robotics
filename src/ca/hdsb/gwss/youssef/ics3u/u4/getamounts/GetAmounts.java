/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u4.getamounts;


/**
 *
 * @author Youss
 */
public abstract class GetAmounts {

    public abstract double getAmount(String type);
}


/*
class Test {

    public static void main(String args[]) {
        GetAmounts b;
        b = new CompoundInvestingAmounts();
        System.out.println("Rate of Interest is: " + b.getAmount("ok") + " %");
        b = new LabAnimalAmounts();
        System.out.println("Rate of Interest is: " + b.getAmount("nah") + " %");
    }
}

SO THIS IS HOW I USE ABSTRACT METHODS!

 */
