/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youssef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Youss
 */
public class ArrayListQuadraticCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ask = new Scanner(System.in);
        
        System.out.println("Please enter your quadratic formula in any form you like");
        
        String quad = ask.nextLine();
        
        ArrayList typeOfQuad = new ArrayList(Arrays.asList(quad.split("")));
        
        for (int i = 0; i < typeOfQuad.size(); i++ ) {
            System.out.println(typeOfQuad.get(i));
        }
        
        }
        
        
     }
        
    