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
public class CSVAnalysis {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        
        StringTokenizer st;
        File csvFile = new File("csv.txt");
        Scanner read = new Scanner(csvFile);
        
        while(read.hasNextLine()) {
            st = new StringTokenizer(read.nextLine());
            
        }
    }
    
}
