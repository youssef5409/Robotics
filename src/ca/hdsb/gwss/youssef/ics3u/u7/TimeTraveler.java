/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1mohamedyou
 */
public class TimeTraveler {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {

        StringTokenizer st;
        File csvFile = new File("timeTravel.txt");
        Scanner read = new Scanner(csvFile);

        int hour;
        int minute;
        int second;
        int travelTime;
        int timeZone;

        String newHour;
        String newMinute;
        String newSecond;

        while (read.hasNextLine()) {
            st = new StringTokenizer(read.nextLine(), " :");

            hour = Integer.parseInt(st.nextToken());
            minute = Integer.parseInt(st.nextToken());
            second = Integer.parseInt(st.nextToken());
            travelTime = Integer.parseInt(st.nextToken());
            timeZone = Integer.parseInt(st.nextToken());

            hour += travelTime;
            hour += timeZone;

            if (hour < 0) {
                hour += 24;
            }

            if (hour < 10) {
                newHour = "0" + minute + "";
            } else {
                newHour = Integer.toString(hour);
            }

            if (minute < 10) {
                newMinute = "0" + minute + "";
            } else {
                newMinute = Integer.toString(minute);
            }

            if (second < 10) {
                newSecond = "0" + minute + "";
            } else {
                newSecond = Integer.toString(second);
            }

            System.out.print(newHour);
            System.out.print(":");
            System.out.print(newMinute);
            System.out.print(":");
            System.out.print(newSecond);
            System.out.println();
        }

    }
}
