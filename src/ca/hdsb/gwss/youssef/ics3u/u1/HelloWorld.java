/*
 * Name: Youssef Mohamed
 * Date: Feb 15th, 2017
 * Version: 1.2
 * Description: The program will display 'HelloWorld'
 *                  to the console
 */
package ca.hdsb.gwss.youssef.ics3u.u1;
import java.util.Scanner;
/**
 * Hello World Program
 * 
 * @author 1mohamedyou
 */
public class HelloWorld {

    /**
     * Method to start your code
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.next();
        
        System.out.println(name);
    }
    
}
