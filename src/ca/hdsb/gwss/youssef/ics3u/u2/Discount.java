/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u2;
import java.util.Scanner;
/**
 *
 * @author 1mohamedyou
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final double discount = 0.2;
        double price = 0;
        Scanner read = new Scanner(System.in);
        System.out.println("How much does your product cost?");
        price = read.nextDouble();
        if (price >= 10) {
            price = price - price * discount;
        }
      System.out.println("Your product costs" + price);
    }
    
}
