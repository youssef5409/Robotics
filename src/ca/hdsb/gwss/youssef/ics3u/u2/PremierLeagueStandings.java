/*
 * Name: Youssef Mohamed
 * Date: 17th Feb 2017
 * Version: 0.1
 * Description:
 *      This program displays the current BPL Standings
 */
package ca.hdsb.gwss.youssef.ics3u.u2;

import java.util.Scanner;
/**
 *
 * @author 1mohamedyou
 */
public class PremierLeagueStandings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
        Scanner death = new Scanner(System.in);
        // Program introduction
        //Table of standings version 1.0
        System.out.println("   ***********************************************");
        System.out.println("   ******* Hi, I project the NBA Standings *******");
        System.out.println("   ************ On February 17th 2017 ************");
        System.out.println("   ***********************************************");
        System.out.println("\n");
        System.out.println("       # Team        Wins    Losses      Win %");
        System.out.println("       ---------------------------------------");
        System.out.println("       1 Cavaliers   39      16          70.9%");
        System.out.println("       ---------------------------------------");
        System.out.println("       2 Celtics     37      20          64.9%");
        System.out.println("       ---------------------------------------");
        System.out.println("       3 Wizards     34      21          61.8%");
        System.out.println("       ---------------------------------------");
        System.out.println("       4 Raptors     33      24          57.9%");
        System.out.println("       ---------------------------------------");
        System.out.println("       5 Hawks       32      24          57.1%");
        System.out.println("       ---------------------------------------");
        
        //Table of standings version 2
        System.out.format("%-10s | %4s | %6s | %14s \n", "Team", "Wins", "Losses", "Win Percentage");
        System.out.format("%-10s | %4s | %6s | %14s \n", "Cavaliers", "39", "16", "70.9%");
        System.out.format("%-10s | %4s | %6s | %14s \n", "Celtics", "37", "20", "64.9%");
        System.out.format("%-10s | %4s | %6s | %14s \n", "Wizards", "34", "21", "61.8%");
        System.out.format("%-10s | %4s | %6s | %14s \n", "Raptors", "33", "24", "57.9%");
        System.out.format("%-10s | %4s | %6s | %14s \n", "Hawks", "32", "24", "57.1%");  
        
        
        
        int i = 0;
        while (i < 5) {
        for (i = 0; i < 1; i++) {
        String angomples = death.nextLine();
        float x = death.nextFloat();
        System.out.println(angomples);
        }
        }
                
    }
    
}


//datatype identifierName = value;
