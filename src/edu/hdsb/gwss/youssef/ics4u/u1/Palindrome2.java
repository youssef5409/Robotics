/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1mohamedyou
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IsPalindrome palindrome = new IsPalindrome();
        Scanner read = new Scanner(System.in);
        String s;
        String palindromes = "";
        System.out.print("Enter Sentence: ");

        StringTokenizer st = new StringTokenizer(read.nextLine());
        int i = 0;
        
        while (st.hasMoreTokens()) {
            s = st.nextToken();
        if (palindrome.isPalindrome(s)) {
            i++;
            palindromes += (s + ", ");
        }
    }
        System.out.println("This sentence has " + i + " palindromes.");
        System.out.println("They are " + palindromes + "\b\b" + ".");
    }
}
