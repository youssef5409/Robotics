/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeArray.reverse;

/**
 *
 * @author 1mohamedyou
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "";
        
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter string: ");
        
        str = read.nextLine();
        if (str.equals(str.reverse().toString())) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
    
}
