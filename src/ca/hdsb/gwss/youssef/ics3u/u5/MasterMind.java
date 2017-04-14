/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class MasterMind {

    public static void main(String[] args) {
        int guesses;
        int firstBlock = (int) (Math.random() * 4);
        System.out.println(firstBlock);
        int secondBlock = (int) (Math.random() * 4);
        System.out.println(secondBlock);
        int thirdBlock = (int) (Math.random() * 4);
        System.out.println(thirdBlock);
        int fourthBlock = (int) (Math.random() * 4);
        System.out.println(fourthBlock);

        Scanner read = new Scanner(System.in);
        System.out.print("Enter 4 guesses separated by spaces: ");
        for (int i = 0; i < 4; i++) {
            guesses = read.nextInt();
            if (guesses == firstBlock ^ guesses == secondBlock) {
                System.out.println("A Match");
            }
        }

    }
}
