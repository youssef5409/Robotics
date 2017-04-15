/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youssef;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class MasterMind {

    public static void main(String[] args) {

        ArrayList coloursPinsHave = new ArrayList();

        HashMap<String, Integer> colours = new HashMap();

        colours.put("blue", 1);
        colours.put("yellow", 2);
        colours.put("red", 3);
        colours.put("green", 4);

        int guesses;
        int guess = 0;

        int firstColour = (int) (Math.random() * 4 + 1);
        int secondColour = (int) (Math.random() * 4 + 1);
        int thirdColour = (int) (Math.random() * 4 + 1);
        int fourthColour = (int) (Math.random() * 4 + 1);

        coloursPinsHave.add(firstColour);
        coloursPinsHave.add(secondColour);
        coloursPinsHave.add(thirdColour);
        coloursPinsHave.add(fourthColour);

        Pin pin = new Pin();
        Pin secondPin = new Pin();
        Pin thirdPin = new Pin();
        Pin fourthPin = new Pin();

        pin.place(1);
        secondPin.place(2);
        thirdPin.place(3);
        fourthPin.place(4);

        pin.colour(firstColour);
        secondPin.colour(secondColour);
        thirdPin.colour(thirdColour);
        fourthPin.colour(fourthColour);

        Scanner read = new Scanner(System.in);
        System.out.print("Enter 4 guesses separated by spaces: ");
        System.out.println(colours.get(read.next()));

    }

    private static class Pin {

        public int place(int place) {
            return place;
        }

        public int colour(int colour) {
            return colour;
        }

        public boolean colourMatch(int colour, int guess) {
            boolean match;
            match = colour == guess;
            return match;
        }
    }
}
