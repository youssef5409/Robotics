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
public class IsDigitQuadraticCalculator {
public static int digits = 0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] typeOfQuad;
        
        Scanner ask = new Scanner(System.in);
        
        System.out.println("Please enter your quadratic formula in any form you like");
        String quad = ask.nextLine();
        
        typeOfQuad = quad.toCharArray();
        
        
        
        
        for (char g : typeOfQuad) {
            digits++;
            if (Character.isDigit(g)) {
                break;
            }
        }
        
        
      //  boolean check = (quad.charAt(digits++) == 7);
        
      //  if (check == true) {
     //   System.out.println("Standard Form");
    //}
    }
}

        
// char[] typeOfQuad = quad.toCharArray();
//   ArrayList typeOfQuad = new ArrayList(Arrays.asList(quad.split("")));
//  for (int i = 0; i < ) {
//for (char c : charArray) {
//  if (c == 'q') {
//   contains = true;
//break;

        
        
        
     
        
    