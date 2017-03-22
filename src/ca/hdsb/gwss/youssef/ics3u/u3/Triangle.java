/*
 * Name: Youssef Mohamed
 * Version: 0.3
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
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double sideOne;
        double sideTwo;
        double sideThree;
        double swap;

        Scanner read = new Scanner(System.in);

        System.out.print("What is the length of the first side: ");
        sideOne = read.nextDouble();

        System.out.print("What is the length of the second side: ");
        sideTwo = read.nextDouble();

        System.out.print("What is the length of the third side: ");
        sideThree = read.nextDouble();

        if (sideTwo > sideOne) {
            swap = sideOne;
            sideOne = sideTwo;
            sideTwo = swap;
        }
        if (sideThree > sideOne) {
            swap = sideOne;
            sideOne = sideThree;
            sideThree = swap;
        }
        if (sideOne >= (sideTwo + sideThree)) {
            System.out.println("A triangle cannot be made");
        } else {
            if (pow(sideThree, 2) + pow(sideTwo, 2) == pow(sideOne, 2)) {
                System.out.println("Not only can a Triangle be made, but it can also"
                        + " be a Right-Angled one.");
            } else {
                System.out.println("A triangle can be made, however it cannot"
                        + " be Right-Angled.");
            }
        }
    }
}
