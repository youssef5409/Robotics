/*
 * Name: Youssef Mohamed
 * Version: 0.3
 * Date: 23rd March 2017
 * Description: Determines if a fish can live in the water based on acidity
 */
package ca.hdsb.gwss.youssef.ics3u.u3;
import java.util.Scanner;
/**
 *
 * @author 1mohamedyou
 */


public class AcidRain {
   public static void main(String[] args) {
       final double pH; 
       Scanner read = new Scanner(System.in);
       
       System.out.print("Input pH: ");
       pH = read.nextDouble();
       
       if (pH > 7.4) {
           System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
       }
       else if (pH < 6.4) {
           System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
           
       }
       else{
           System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
       }
    }
}
