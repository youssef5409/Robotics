/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u1.u7;

import ca.hdsb.gwss.youssef.ics3u.u6.ArrayUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class NewMain {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        int[] x = new int[1000];
        int[] y = new int[1000];
        int n;
        
        File textFile = new File("data.txt");
        PrintWriter output = new PrintWriter(textFile);
        Scanner input = new Scanner(textFile);
        
        for (int i = 0; i < x.length; i++) {
            output.println((int) (Math.random() * 100 + 1));
        }
        output.close();
        
        for (int i = 0; i < y.length; i++) {
            n = Integer.parseInt(input.nextLine());
            x[i] = n;
            y[i] = n;
        }
        ArrayUtils.bubbleIntAsc(x);
        ArrayUtils.selectionIntAsc(y);
    }
    
}
