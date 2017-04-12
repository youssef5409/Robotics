/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author 1mohamedyou
 */
public class StandardTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String time;
        boolean standardCheck;
        boolean ampmCheck;
        Scanner read = new Scanner(System.in);

        System.out.print("Enter Time: ");
        time = read.nextLine();
        
        time = time.replaceAll(" ", "");
        
        
        //I actually made my own regex!
        //https://regex101.com/r/zF1yS5/9 That site helps alot, it's where I made mine
        //I made both the Standard time regex, and Traditional time regex.
        
        standardCheck = Pattern.matches("^([0-1][0-9]|2[0-3]):([0-5][0-9])$", time);
        ampmCheck = Pattern.matches("^(1[0-2]|0?[1-9]):([0-5][0-9])(A|P)M$", time);

        
        System.out.println(standardCheck);
        System.out.println(ampmCheck);
    }

}
