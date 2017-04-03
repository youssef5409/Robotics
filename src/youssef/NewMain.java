/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youssef;

import java.text.NumberFormat;

/**
 *
 * @author 1mohamedyou
 */


public class NewMain {
   public static void main(String[] args) {
       //getting current date and time using Date class
NumberFormat formatter = NumberFormat.getCurrencyInstance();
       System.out.println(formatter.format(999999.99));
    }
}
