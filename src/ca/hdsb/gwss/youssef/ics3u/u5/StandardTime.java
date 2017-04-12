/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.Scanner;

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
        Scanner read = new Scanner(System.in);
        
        System.out.print("Enter Time: ");
        time = read.nextLine();
        
        time = time.replaceAll(" ", "");
        
        System.out.println(time);
        
        ^([0-1]?[0-9]|2[0-3]):[0-5][0-9]$;
    }
    
}
