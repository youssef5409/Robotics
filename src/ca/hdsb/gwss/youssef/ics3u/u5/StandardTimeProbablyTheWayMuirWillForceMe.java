/*
 * Name: Youssef Mohamed
 * Date: 2nd Apr 2017
 * Version: 0.9
 * Description:
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 1mohamedyou
 */
public class StandardTimeProbablyTheWayMuirWillForceMe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String time;
        boolean standardCheck;
        boolean traditionalCheck;
        Scanner read = new Scanner(System.in);

        final String STANDARD_REGEX = "^([0-1][0-9]|2[0-3]):([0-5][0-9])$";
        final String TRADITIONAL_REGEX = "^(1[0-2]|0[1-9]):([0-5][0-9])(A|P)M$";

        do {
            System.out.print("Enter Time: ");
            time = read.nextLine();
            time = time.replaceAll(" ", "");

            standardCheck = Pattern.matches(STANDARD_REGEX, time);
            traditionalCheck = Pattern.matches(TRADITIONAL_REGEX, time);

        } while (!standardCheck && !traditionalCheck);

        if (standardCheck) {
            standardToTraditional(time, STANDARD_REGEX);
        } else {
            traditionalToStandard(time, TRADITIONAL_REGEX);
        }

        System.out.println(standardCheck);
        System.out.println(traditionalCheck);
    }

    private static void standardToTraditional(String time, String regex) {
        String hh;
        String mm;
        String ampm;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(time);
        if (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
            //Take each capture and assign corresponding converted value.
        }
    }

    private static void traditionalToStandard(String time, String regex) {
        String hh;
        String mm;
        String ampm;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(time);
        if (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
            //Take each capture and assign corresponding converted value.
        }
    }
}
//I actually made my own regex!
//https://regex101.com/r/zF1yS5/9 That site helps alot, it's where I made mine
        //I made both the Standard time regex, and Traditional time regex.
