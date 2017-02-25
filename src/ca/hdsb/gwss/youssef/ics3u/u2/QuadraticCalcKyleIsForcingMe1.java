/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author Youss
 */
public class QuadraticCalcKyleIsForcingMe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] typeOfQuad;
        
        Scanner ask = new Scanner(System.in);
        
        System.out.println("Please enter your quadratic formula in any form you like");
        
        String quad = ask.nextLine();
        typeOfQuad = new char[quad.length()];
        
        for (int i = 0; i < quad.length(); i++) {
            
            typeOfQuad [i] += quad.charAt(i);
        
            if (Character.isDigit(typeOfQuad [i])) {
                System.out.println("dab");
            }
               
        
        }
    }
}
        
       // char[] typeOfQuad = quad.toCharArray();
        
      //   ArrayList typeOfQuad = new ArrayList(Arrays.asList(quad.split("")));
         
       //  for (int i = 0; i < ) {

         //for (char c : charArray) {

  //  if (c == 'q') {

     //   contains = true;

        //break;
    
        
        
        
     
        
    