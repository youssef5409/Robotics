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
        int guess = 0;
        int firstBlock = (int) (Math.random() * 4);
        int secondBlock = (int) (Math.random() * 4);
        int thirdBlock = (int) (Math.random() * 4);
        int fourthBlock = (int) (Math.random() * 4);
        System.out.println(firstBlock);
        System.out.println(secondBlock);
        System.out.println(thirdBlock);
        System.out.println(fourthBlock);

        MyPin pin = new MyPin(1, firstBlock, guess);
        MyPin secondPin = new MyPin(2, secondBlock, guess);
        MyPin thirdPin = new MyPin(3, thirdBlock, guess);
        MyPin fourthPin = new MyPin(4, fourthBlock, guess);

        Scanner read = new Scanner(System.in);
        System.out.print("Enter 4 guesses separated by spaces: ");
        for (int i = 0; i < 4; i++) {
            guesses = read.nextInt();
            if (guesses == firstBlock ^ guesses == secondBlock) {
                System.out.println("A Match");
            }
        }
    }

    private static class MyPin {

        public MyPin(int place, int colour, int guess) {
            System.out.println("hi");
        }
    }
}
