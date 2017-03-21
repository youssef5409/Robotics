/*
 * Name: Youssef Mohamed
 * Version: 0.1
 * Date: 20th March 2017
 * Description: Determines if 3 lines can make a triangle
 */
package ca.hdsb.gwss.youssef.ics3u.u3;
import java.util.Scanner;
/**
 *
 * @author 1mohamedyou
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double sideOne;
        final double sideTwo;
        final double sideThree;
        
        Scanner read = new Scanner(System.in);
        
        System.out.print("What is the length of the first side: ");
        sideOne = read.nextDouble();
        
        System.out.print("What is the length of the second side: ");
        sideTwo = read.nextDouble();
        
        System.out.print("What is the length of the third side: ");
        sideThree = read.nextDouble();
        
        if ((sideOne + sideTwo) > sideThree && (sideOne + sideThree) > sideTwo &&
                (sideTwo + sideThree) > sideOne) {
            System.out.println("A triangle can be made");
    }
        else {
            System.out.println("A triangle cannot be made");
        }
    }
    
}
