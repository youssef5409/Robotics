/*
 * Name: Youssef Mohamed
 * Version: 0.1
 * Date: 20th March 2017
 * Description: Determines if a year is a leap year or not
 */
package ca.hdsb.gwss.youssef.ics3u.u3;
import java.util.Scanner;
/**
 *
 * @author 1mohamedyou
 */
public class LeapYear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int year;
        
        Scanner read = new Scanner(System.in);
        System.out.println("What year is it?");
        year = read.nextInt();
        
        if (year %4 != 0 || year %400 != 0) {
            System.out.println("It is not a leap year");
        }
        else{
            System.out.println("It is a leap year.");
        }
    }
    
}
//if (year %400 == 0 || year %4 == 0 && year % 100 != 0) {