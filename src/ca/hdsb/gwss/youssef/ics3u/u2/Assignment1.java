/*
 * Name: Youssef Mohamed
 * Date: 1st Mar 2017
 * Version: 0.1
 * Description:
 *      This program maximizes your profit
 */
package ca.hdsb.gwss.youssef.ics3u.u2;
import static java.lang.Math.abs;
import java.util.Scanner;
/**
 *
 * @author Youss
 */
public class Assignment1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numberOfSales = 1;
        double originalCost = 0;
        double salesLost = 0;
        double deductionChunk = 1;
        double root1 = 0;
        double root2 = 0;
        double profit = 0;
        double vertex = 0;
        System.out.println(" __  __                          __  __       _             _ \n" +
"|  \\/  | ___  _ __   ___ _   _  |  \\/  | __ _| | _____ _ __| |\n" +
"| |\\/| |/ _ \\| '_ \\ / _ \\ | | | | |\\/| |/ _` | |/ / _ \\ '__| |\n" +
"| |  | | (_) | | | |  __/ |_| | | |  | | (_| |   <  __/ |  |_|\n" +
"|_|  |_|\\___/|_| |_|\\___|\\__, | |_|  |_|\\__,_|_|\\_\\___|_|  (_)\n" +
"                         |___/                                ");
        Scanner read = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("I can find out how to maximize your profit! \n");
        
        System.out.println("How much does your product cost? ");
        originalCost = read.nextDouble();
        
        System.out.println("How many sales do you get with that cost? ");
        numberOfSales = read.nextDouble();
        
        System.out.println("How much of your cost are wou willing to change at a time ");
        deductionChunk = abs(read.nextDouble());
        
        System.out.println("How many sales do you predict to lose for every increase of $" 
                + deductionChunk);
        salesLost = abs(read.nextDouble());
        
        root1 = (numberOfSales / salesLost);
        root2 = (originalCost / -deductionChunk);
        vertex = (root1 + root2) / 2;
        profit = (numberOfSales - salesLost * vertex) * (originalCost + deductionChunk * vertex);
        
        System.out.println("\nYou should sell your product for " + vertex);
        System.out.println("You will make " + profit);
    }
    
}