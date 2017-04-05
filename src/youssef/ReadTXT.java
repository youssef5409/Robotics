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
        while (input.hasNextLine()) {

            st = new StringTokenizer(input.nextLine());

            while (st.hasMoreTokens()) {
                System.out.print(st.nextToken() + " ");
            }
            System.out.println();
        }

    }

}
