/*
 * Name: Youssef Mohamed
 * Version: 0.1
 * Date: 20th March 2017
 * Description: Determines if 3 lines can make a triangle
 */
package ca.hdsb.gwss.youssef.ics3u.u3;
import static java.lang.Math.pow;
import java.util.Scanner;
/**
 *
 * @author 1mohamedyou
 */
public class RightAngleTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double sideOne;
        final double sideTwo;
        final double sideThree;
        
        Scanner read = new Scanner(System.in);
       
        System.out.println("What is the lenth of the first side: ");
        sideOne = read.nextDouble();
        
        System.out.println("What is the length of the second side: ");
        sideTwo = read.nextDouble();
        
        System.out.println("What is the length of the third side: ");
        sideThree = read.nextDouble();
        
        if (pow(sideOne, 2) + pow(sideTwo, 2) == pow(sideThree, 2) ||
                pow(sideOne, 2) + pow(sideThree, 2) == pow(sideTwo, 2) ||
                pow(sideThree, 2) + pow(sideTwo, 2) == pow(sideOne, 2)) {
            System.out.println("A Right-Angle triangle can be made");
    }
        else {
            System.out.println("A Right-Angle triangle cannot be made");
        }
    }
    
}