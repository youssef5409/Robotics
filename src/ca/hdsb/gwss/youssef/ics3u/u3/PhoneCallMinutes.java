/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class PhoneCallMinutes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double minutesDuringDay = 0;
        double minutesDuringDayA = 0;
        double minutesDuringDayB = 0;
        double minutesDuringWeekend = 0;
        double minutesDuringEvening = 0;
        double priceA = 0;
        double priceB = 0;

        Scanner read = new Scanner(System.in);

        System.out.println("How many minutes do you use in the day?");
        minutesDuringDay = read.nextDouble();
        System.out.println("How many minutes do you use during the evening?");
        minutesDuringWeekend = read.nextDouble();
        System.out.println("How many minutes do you use during the weekend?");
        minutesDuringEvening = read.nextDouble();

        minutesDuringDayA = minutesDuringDay;
        minutesDuringDayB = minutesDuringDay;

        if (minutesDuringDay <= 100) {
            minutesDuringDayA = 100;
            minutesDuringDayB = 250;
        } else if (minutesDuringDay <= 250) {
            minutesDuringDayB = 250;
        }
        priceA = (minutesDuringDayA - 100) * 0.25 + minutesDuringEvening * 0.15 + minutesDuringWeekend * 0.2;
        priceB = (minutesDuringDayB - 250) * 0.45 + minutesDuringEvening * 0.35 + minutesDuringWeekend * 0.25;
        
        if (priceA == priceB || priceA - priceB < 0.01) {
            System.out.println("They cost the same");
        } else if (priceA > priceB) {
            System.out.println("Price B is better");
        } else {
            System.out.println("Price A is better");

        }

    }
}
