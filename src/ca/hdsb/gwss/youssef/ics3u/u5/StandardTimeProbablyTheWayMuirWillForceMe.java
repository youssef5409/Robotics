/*
 * Name: Youssef Mohamed
 * Date: 2nd Apr 2017
 * Version: 0.9
 * Description:
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import static java.lang.Math.abs;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author 1mohamedyou
 */
public class StandardTimeProbablyTheWayMuirWillForceMe {

    public void convertTime() {
        String time;
        boolean standardCheck;
        boolean traditionalCheck;
        Scanner read = new Scanner(System.in);

        final String STANDARD_REGEX = "^([0-1][0-9]|2[0-3]):([0-5][0-9])$";
        final String TRADITIONAL_REGEX = "^(1[0-2]|0?[1-9]):([0-5][0-9])(a|p)m$";

        do {
            System.out.print("Enter Time: ");
            time = read.nextLine();
            time = time.toLowerCase();
            time = time.replaceAll(" ", "");

            traditionalCheck = Pattern.matches(TRADITIONAL_REGEX, time);
            standardCheck = Pattern.matches(STANDARD_REGEX, time);

        } while (!standardCheck && !traditionalCheck);

        if (standardCheck) {
            standardToTraditional(time, STANDARD_REGEX);
        } else {
            traditionalToStandard(time, TRADITIONAL_REGEX);
        }
    }

    private static void standardToTraditional(String time, String regex) {
        String hh;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(time);
        matcher.find(); //It won't work without this.

        if (Integer.parseInt(matcher.group(1)) > 12) {
            hh = "" + abs(Integer.parseInt(matcher.group(1)) - 12);
            System.out.println(hh + ":" + matcher.group(2) + " PM");
        } else {
            hh = "" + abs(Integer.parseInt(matcher.group(1)));
            System.out.println(hh + ":" + matcher.group(2) + " AM");
        }
    }

    private static void traditionalToStandard(String time, String regex) {
        String hh;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(time);
        matcher.find(); //Why does it need this????
        if (matcher.group(3).equals("a")) {
            if (Integer.parseInt(matcher.group(1)) == 12) {
                hh = "00";
            } else {
                hh = "" + abs(Integer.parseInt(matcher.group(1)));
            }
        } else {
            if (Integer.parseInt(matcher.group(1)) == 12) {
                hh = "12";
            } else {
                hh = "" + abs(Integer.parseInt(matcher.group(1)) + 12);
            }

        }
        System.out.print(hh + ":" + matcher.group(2));
    }
}
