/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youssef;

import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class CheckingLettersQuadraticCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ask = new Scanner(System.in);
        
        System.out.println("Please enter your quadratic formula in any form you like");
        
        String quad = ask.nextLine();
        
        int kyleIsStraight = 0;
        
        for (int i = 0; i < quad.length(); i++) {
            if (quad.charAt(i) == ('x')) {
                kyleIsStraight++;
            }
        }
        
        if (kyleIsStraight == 1) {
            System.out.println("This is vertex form you ");
        }
        
        else if (kyleIsStraight == 2) {
                }
            System.out.println("This is factored form you ");
        }

        }
        
// char[] typeOfQuad = quad.toCharArray();
//   ArrayList typeOfQuad = new ArrayList(Arrays.asList(quad.split("")));
//  for (int i = 0; i < ) {
//for (char c : charArray) {
//  if (c == 'q') {
//   contains = true;
//break;

        
        
     
        
    