/*
 * Name: Youssef Mohamed
 * Date: 17th Feb 2017
 * Version: 0.1
 * Description:
 *      This program displays the current BPL Standings
 */
package ca.hdsb.gwss.youssef.ics3u.u2;

/**
 *
 * @author 1mohamedyou
 */
public class PremierLeagueStandings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
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
        System.out.format("%-10s | %4s | %4s | %4s \n", "Cavaliers", "Wins", "Losses", "Win Percentage");
        System.out.format("%-10s | %4s | %4s | %4s", "Celtics", "Wins", "Losses", "Win Percentage");
        System.out.format("%-10s | %4s | %4s | %4s", "Wizards", "Wins", "Losses", "Win Percentage");
        System.out.format("%-10s | %4s | %4s | %4s", "Raptors", "Wins", "Losses", "Win Percentage");
        System.out.format("%-10s | %4s | %4s | %4s", "Hawks", "Wins", "Losses", "Win Percentage");
    }
    
}
