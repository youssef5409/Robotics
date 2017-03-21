/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author Youss
 */
public class LeapYearYoussef {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int year;
        
        Scanner read = new Scanner(System.in);
        System.out.println("What is the year?");
        
        year = read.nextInt();
        
        GregorianCalendar date = (GregorianCalendar) GregorianCalendar.getInstance();
        
        System.out.println(date.isLeapYear(year));
    }

}
