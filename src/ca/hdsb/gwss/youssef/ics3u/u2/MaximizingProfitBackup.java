/*
 * Name: Youssef Mohamed
 * Date: 1st Mar 2017
 * Version: 0.1
 * Description:
 *      This program maximizes your profit
 */
package ca.hdsb.gwss.youssef.ics3u.u2;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Youss
 */
public class MaximizingProfitBackup {

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
        
        DecimalFormat format = new DecimalFormat();
        format.setDecimalSeparatorAlwaysShown(false);
        Scanner originalCostScan = new Scanner(System.in);
        Scanner numberOfSalesScan = new Scanner(System.in);
        Scanner salesLostScan = new Scanner(System.in);
        Scanner deductionChunkScan = new Scanner(System.in);
        
        System.out.println(" __  __                          __  __       _             _ \n" +
"|  \\/  | ___  _ __   ___ _   _  |  \\/  | __ _| | _____ _ __| |\n" +
"| |\\/| |/ _ \\| '_ \\ / _ \\ | | | | |\\/| |/ _` | |/ / _ \\ '__| |\n" +
"| |  | | (_) | | | |  __/ |_| | | |  | | (_| |   <  __/ |  |_|\n" +
"|_|  |_|\\___/|_| |_|\\___|\\__, | |_|  |_|\\__,_|_|\\_\\___|_|  (_)\n" +
"                         |___/                                \n");
        
        System.out.println("I can find out how to maximize your profit! \n");
        
        System.out.print("How much does your product cost? ");
        
        while (!originalCostScan.hasNextDouble()) {
            
            System.out.print("Sorry, this cost value is invalid. Please try again ");
            originalCostScan.next();
        }
        
        originalCost = originalCostScan.nextDouble();
        
        System.out.print("How many sales do you get with that cost? ");
        
        while (!numberOfSalesScan.hasNextDouble()) {
            
            System.out.println("Sorry, this number of sales value is invalid. "
                    + "Please try again ");
            numberOfSalesScan.next();
        }
        
        numberOfSales = numberOfSalesScan.nextDouble();
        
        System.out.print("How much of your cost are wou willing to change at a time ");
        
        while (!deductionChunkScan.hasNextDouble()) {
            
            System.out.println("Sorry, this change of money value is invalid. "
                    + "Please try again ");
            deductionChunkScan.next();
        }
        
        deductionChunk = deductionChunkScan.nextDouble();
        
        System.out.print("How many sales do you predict to lose for every increase of $" 
                + String.format(format.format(deductionChunk)));
        
        while (!salesLostScan.hasNextDouble()) {
            
            System.out.println("Sorry, this sales lost value is invalid. "
                    + "Please try again ");
            salesLostScan.next();
        }
        
        salesLost = salesLostScan.nextDouble();
        
        root1 = (numberOfSales / salesLost);
        root2 = (originalCost / -deductionChunk);
        vertex = (root1 + root2) / 2;

        profit = (numberOfSales - salesLost * vertex) * 
                (originalCost + deductionChunk * vertex);
        
        System.out.println("\n You should sell your product for $" 
                + String.format("%.2f", vertex));
        
        System.out.println("You will make $" + String.format("%.2f", profit));
        
        System.out.println("This can be modeled with the quadratic equation f(x) = (" + 
                format.format(numberOfSales) + "-" + format.format(salesLost)
                + "n" + ")" + "(" + format.format(originalCost) + "+" 
                + format.format(deductionChunk) + "n" + ")");
        
        System.out.println("Keep in mind all the numbers longer than 2 decimal "
                + "places were rounded down to 2 decimals for easier reading.");
    }
    
}