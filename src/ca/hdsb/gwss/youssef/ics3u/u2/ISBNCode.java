/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u2;
import java.util.Scanner;
/**
 *
 * @author 1mohamedyou
 */
public class ISBNCode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        // TODO code application logic here
        System.out.println("First Number?");
        int n1 = read.nextInt();
        System.out.println("Second Number?");
        int n2 = read.nextInt();
        n2 = n2 * 3;
        System.out.println("Third Number?");
        int n3 = read.nextInt();
        System.out.println(91+ n1+n2+n3);
        
    }
    
}
