/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class SlotMachine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int coins = 50;

        int first;
        int second;
        int third;

        while (coins > 0) {

            System.out.println("Press Enter to Roll!");
            read.nextLine();

            first = (int) (Math.random() * 4) + 1;
            second = (int) (Math.random() * 4) + 1;
            third = (int) (Math.random() * 4) + 1;

            System.out.println(first);
            System.out.println(second);
            System.out.println(third);

            if (first == second && first == third) {
                if (first > 3) {
                    coins += 10;
                    System.out.println("You won 10 Tokens!");
                } else if (first > 2) {
                    coins += 8;
                    System.out.println("You won 8 Tokens!");
                } else if (first > 1) {
                    coins += 6;
                    System.out.println("You won 6 Tokens!");
                } else {
                    coins += 4;
                    System.out.println("You won 4 Tokens!");
                }
            }
            coins--;
            System.out.println("You have " + coins + " coins");
        }
        System.out.println("Game Over!");
    }
}