/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u2;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class QuadraticEquations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ask = new Scanner(System.in);
        System.out.println("Enter the A value");
        double a = ask.nextDouble();
        System.out.println("Enter the B value");
        double b = ask.nextDouble();
        System.out.println("Enter the C value");
        double c = ask.nextDouble();
        
        double root1 = ((b*-1) + sqrt((b*b)- 4 * (a) * (c)));
        double root2 = ((b*-1) - sqrt((b*b)- 4 * (a) * (c)));
        
        System.out.println("Root 1 is " + root1);
        System.out.println("Root 2 is " + root2);
        
    }
    
}
