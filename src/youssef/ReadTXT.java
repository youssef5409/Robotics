/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youssef;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1mohamedyou
 */
public class ReadTXT {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("C:\\Users\\1mohamedyou\\Desktop\\newtext.txt"));
        StringTokenizer st;
        double tripCost = 0;
        double dollar12 = 0;
        double dollar10 = 0;
        double dollar7 = 0;
        double dollar5 = 0;
        double total;
        double nOfPeople = 0;

        while (input.hasNextLine()) {
            st = new StringTokenizer(input.nextLine());
            while (st.hasMoreTokens()) {
                tripCost = Double.parseDouble(st.nextToken());
            }

            st = new StringTokenizer(input.nextLine());
            while (st.hasMoreTokens()) {
                dollar12 = Double.parseDouble(st.nextToken());
                dollar10 = Double.parseDouble(st.nextToken());
                dollar7 = Double.parseDouble(st.nextToken());
                dollar5 = Double.parseDouble(st.nextToken());
            }

            st = new StringTokenizer(input.nextLine());
            while (st.hasMoreTokens()) {
                nOfPeople = Double.parseDouble(st.nextToken());
            }

            dollar12 = (dollar12 * nOfPeople) * 12;
            dollar10 = (dollar10 * nOfPeople) * 10;
            dollar7 = (dollar7 * nOfPeople) * 7;
            dollar5 = (dollar5 * nOfPeople) * 5;
            total = dollar12 + dollar10 + dollar7 + dollar5;

            if (total * 0.5 > tripCost) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}
