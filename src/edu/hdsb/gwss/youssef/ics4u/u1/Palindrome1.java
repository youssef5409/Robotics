/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u1;

import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class Palindrome1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IsPalindrome palindrome = new IsPalindrome();
        Scanner read = new Scanner(System.in);
        
        System.out.println("Gib Word: ");
        
        String s = read.next();
        System.out.println( palindrome.isPalindrome(s) );
    }
}
