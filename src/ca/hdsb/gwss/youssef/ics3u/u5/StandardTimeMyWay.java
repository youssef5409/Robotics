/*
 * Name: Youssef Mohamed
 * Date: 2nd Apr 2017
 * Version: 0.9
 * Description:
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author 1mohamedyou
 */
public class StandardTimeMyWay {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
        String time;
        boolean standardCheck;
        boolean traditionalCheck;

        //I actually made my own regex!
        //https://regex101.com/r/zF1yS5/9 That site helps alot, it's where I made mine
        //I made both the Standard time regex, and Traditional time regex.
        
        //Can add '?' to allow '3:59' ^([0-1]?[0-9]|2[0-3]):([0-5][0-9])$
        final String STANDARD_REGEX = "^([0-1]?[0-9]|2[0-3]):([0-5][0-9])$"; 
        
        //Can add '?' to allow '03:59 PM' ^(1[0-2]|0?[1-9]):([0-5][0-9])(a|p)m$
        final String TRADITIONAL_REGEX = "^(1[0-2]|0?[1-9]):([0-5][0-9])(a|p)m$"; 
        
        Scanner read = new Scanner(System.in);

        do {
            System.out.print("Enter Time: ");
            time = read.nextLine();
            time = time.toLowerCase();
            time = time.replaceAll(" ", "");

            standardCheck = Pattern.matches(STANDARD_REGEX, time);
            traditionalCheck = Pattern.matches(TRADITIONAL_REGEX, time);

        } while (!standardCheck && !traditionalCheck);

        if (standardCheck) {
            standardToTraditional(time);
        } else {
            traditionalToStandard(time);
        }
    }

    private static void standardToTraditional(String time) throws ParseException {
        SimpleDateFormat traditionalTime = new SimpleDateFormat("hh:mma");
        SimpleDateFormat standardTime = new SimpleDateFormat("HH:mm");

        System.out.println("The traditional time is: "
                + traditionalTime.format(standardTime.parse(time)));

    }

    private static void traditionalToStandard(String time) throws ParseException {
        SimpleDateFormat traditionalTime = new SimpleDateFormat("hh:mma");
        SimpleDateFormat standardTime = new SimpleDateFormat("HH:mm");

        System.out.println("The standard time is: "
                + standardTime.format(traditionalTime.parse(time)));

    }

}
