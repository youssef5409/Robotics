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
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IsPalindrome palindrome = new IsPalindrome();
        Scanner read = new Scanner(System.in);

        System.out.print("Enter Sentence: ");

        if (palindrome.isPalindrome(read.nextLine().replaceAll(" " , ""))) {
            System.out.println("This sentence is a palindrome.");
        } else {
            System.out.println("This sentence is not a palindrome.");
        }
    }
}