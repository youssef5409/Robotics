/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class EasterComes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int year, month, day, a, b, c, d, e, f, g, h, i, j, k, l, m;
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("Year?: ");
        year = read.nextInt();
        
        a = year % 19;
        b = year / 100;
        c = year % 100;
        d = b / 4;
        e = b % 4;
        f = (b + 8) / 25;
        g = (b - f + 1) / 3;
        h = (19 * a + b - d - g + 15) % 30;
        i = c / 4;
        k = c % 4;
        j = (32 + 2 * e + 2 * i - h - k) % 7;
        l = (a + 11 * h + 22 * j) / 451;
        month = (h + j - 7 * l + 114) / 31;
        m = (h + j - 7 * l + 114) % 31;
        day = m + 1;
        
        System.out.println("Easter comes on: " + month + "/" + day + "/" + year);
    }
    
}
