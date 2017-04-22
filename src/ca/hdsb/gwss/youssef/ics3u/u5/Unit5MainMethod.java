/*
 * Name: Youssef Mohamed
 * Date: 2nd Apr 2017
 * Version: 0.9
 * Description:
 *      
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class Unit5MainMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Introduces the program
        intro();

        //Shows the user their options
        options();

        //switch-case that checks for the integer that the user entered, and runs
        //a respective method
        switch (getApp()) {
            case 1:
                //Calls and uses the Mastermind method which is originally
                //located in MasterMind.java
                MasterMind.play();
                break;
            case 2:
                //Calls and uses the numberWord method which is originally
                //located in NumberToWords2.java
                NumberToWords2.numberWord();
                break;
            case 3:
                //Calls and uses the SIN Checker method which is originally
                //located in SINCheck.java
                SINCheck.sinChecker();
                break;
            case 4:
                //Calls and uses the Convert Time method which is originally
                //located in StandardTimeProbablyTheWayMuirWillForceMe.java
                //How's that for a descriptive name
                StandardTimeProbablyTheWayMuirWillForceMe.convertTime();
                break;
            case 5:
                //Calls and uses the PlayGUI method which is originally
                //located in MasterMindGUI.java
                MasterMindGUI.playGUI();
                break;
        }
    }

    private static int getApp() {
        //Initializing variables
        int app = 0;

        //Declaring Objects
        Scanner read = new Scanner(System.in);

        //Do while is not needed, as variable app must be declared in advance.
        //However this is to meet criteria.
        do {
            try {
                System.out.print("What would you like to do?: ");
                app = Integer.parseInt(read.nextLine());
            } catch (NumberFormatException e) {
            }
            if (!(app > 0 && app < 6)) {
                System.out.println("Sorry, you entered an invalid value.");
            }
        } while (!(app > 0 && app < 6));
        System.out.println("\n");
        return app;
    }

    private static void intro() {
        //Introductory Statement
        System.out.println("\n");
    }

    private static void options() {
        //Statement showing options
        System.out.println("1 - Mastermind \n"
                + "2 - Convert Numbers to Words \n"
                + "3 - SIN Check \n"
                + "4 - Convert Time Format \n"
                + "5 - Mastermind (GUI Version) \n");
    }
}
