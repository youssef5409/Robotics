/*
 * Name: Youssef Mohamed
 * Version: 0.1
 * Date: 20th March 2017
 * Description: Determines cost of letter.
 */
package ca.hdsb.gwss.youssef.ics3u.u3;
import java.util.Scanner;
/**
 *
 * @author 1mohamedyou
 */
public class LetterCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int typeOfMail;
        final double weight;
        int counter = 0;
        double additionOfPrice = 0;
        Scanner read = new Scanner(System.in);
        
        System.out.println("Type 1 for first class, and 2 for second class");
        typeOfMail = read.nextInt();
        System.out.println("How much does your package weigh?");
        weight = read.nextDouble();
        
        if (typeOfMail == 1) {
            for (int i = 0; i < (int) weight; i++) {
                counter++;
                if (counter == 50) {
                    counter = 0;
                    additionOfPrice = additionOfPrice + 0.25;
                }
            }
        }
        
    }
    
}
