/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youssef;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class QuadraticEquations {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // TODO code application logic here
        System.out.println("Enter the A value ");
        Scanner askA = new Scanner(System.in);
        
        while (!askA.hasNextDouble()) {
            
            System.out.println("Sorry, this A value is invalid");
            askA.next();
        }
        
        double a = askA.nextDouble();
        
        System.out.println("Enter the B value ");
        Scanner askB = new Scanner(System.in);
        
        while (!askB.hasNextDouble()) {
            
            System.out.println("Sorry, this B value is invalid");
            askB.next();
        }
        
        double b = askB.nextDouble();

        System.out.println("Enter the C value ");
        Scanner askC = new Scanner(System.in);

        while (!askC.hasNextDouble()) {
            System.out.println("Sorry, this C value is invalid");
            askC.next();
        }
        
        double c = askC.nextDouble();
        
        
        double root1 = ((b * -1) + sqrt((b * b) - 4 * (a) * (c)));
        double root2 = ((b * -1) - sqrt((b * b) - 4 * (a) * (c)));
        
        System.out.println("Root 1 is " + root1);
        System.out.println("Root 2 is " + root2);
        
    }
    
}
