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
public class MaximizingProfit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double numberOfSales;
        double originalCost;
        double salesLost;
        double deductionChunk;
        double root1;
        double root2;
        double profit;
        double vertex;
        
        System.out.println(" __  __                          __  __       _             _ \n" +
"|  \\/  | ___  _ __   ___ _   _  |  \\/  | __ _| | _____ _ __| |\n" +
"| |\\/| |/ _ \\| '_ \\ / _ \\ | | | | |\\/| |/ _` | |/ / _ \\ '__| |\n" +
"| |  | | (_) | | | |  __/ |_| | | |  | | (_| |   <  __/ |  |_|\n" +
"|_|  |_|\\___/|_| |_|\\___|\\__, | |_|  |_|\\__,_|_|\\_\\___|_|  (_)\n" +
"                         |___/                                \n");
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("I can find out how to maximize your profit! \n");
        
        System.out.print("How much does your product cost? ");
        originalCost = read.nextDouble();
        
        System.out.print("How many sales do you get with that cost? ");
        numberOfSales = read.nextDouble();
        
        System.out.print("How much of your cost are wou willing to change at a time ");
        deductionChunk = read.nextDouble();
        
        System.out.print("How many sales do you predict to lose for every increase of $" 
                + String.format("%.2f", deductionChunk));
        salesLost = read.nextDouble();
        
        root1 = (numberOfSales / salesLost);
        root2 = (originalCost / -deductionChunk);
        vertex = (root1 + root2) / 2;

        profit = (numberOfSales - salesLost * vertex) * 
                (originalCost + deductionChunk * vertex);
        
        System.out.println("\nYou should sell your product for $" 
                + String.format("%.2f", vertex));
        
        System.out.println("You will make $" + String.format("%.2f", profit));
        
        System.out.println("This can be modeled with the quadratic equation f(x) = (" + 
                numberOfSales + "-" + salesLost + "n" + ")" + "(" + originalCost + "+" 
                + deductionChunk + "n" + ")");
        
        System.out.println("Keep in mind all the numbers longer than 2 decimal "
                + "places were rounded down to 2 decimals for easier reading.");
    }
    
}