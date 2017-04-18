/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class MasterMind {

    public void play() {
        boolean allRight = false;
        int attempts = 0;
        String guess;
        int placeAndColour;
        int colour;

        Scanner read = new Scanner(System.in);
        ArrayList coloursPinsHave = new ArrayList();
        ArrayList coloursArray = new ArrayList();
        ArrayList pinsArray = new ArrayList();

        coloursArray.add("blue");
        coloursArray.add("yellow");
        coloursArray.add("red");
        coloursArray.add("green");

        pinsArray.add(coloursArray.get(randomWholeNumber()));
        pinsArray.add(coloursArray.get(randomWholeNumber()));
        pinsArray.add(coloursArray.get(randomWholeNumber()));
        pinsArray.add(coloursArray.get(randomWholeNumber()));

        System.out.println(pinsArray.get(0));
        System.out.println(pinsArray.get(1));
        System.out.println(pinsArray.get(2));
        System.out.println(pinsArray.get(3));

        while (!allRight) {
            placeAndColour = 0;
            colour = 0;
            attempts++;
            coloursPinsHave.clear();
            for (int i = 0; i < 4; i++) {
                coloursPinsHave.add(pinsArray.get(i));
            }
            System.out.println("Enter 4 guesses separated by spaces");
            System.out.println("Guesses can be \"green\", \"blue\", \"red\" "
                    + "or \"yellow\")");
            System.out.print("Any guesses after 4 guesses will be ignored: ");
            for (int i = 0; i < 4; i++) {
                guess = read.next().toLowerCase();
                if (checkGuessAndSpot(pinsArray, guess, i)) {
                    placeAndColour++;
                }
                if (checkGuess(coloursPinsHave, guess)) {
                    colour++;
                    coloursPinsHave.remove(guess);
                }
            }
            read.nextLine();
            System.out.println("You guessed " + placeAndColour + " spots and colours correctly");
            System.out.println("You guessed " + colour + " colours correctly");
            if (placeAndColour == 4) {
                allRight = true;
            }
        }
        System.out.println("Congratulations! It took you " + attempts + " attempt(s) to win!");
    }

    private static boolean checkGuess(ArrayList coloursPinsHave, String guess) {
        boolean goodGuess = false;
        if (coloursPinsHave.contains(guess)) {
            goodGuess = true;
        }
        return goodGuess;
    }

    private static boolean checkGuessAndSpot(ArrayList pinsArray, String guess, int i) {
        boolean goodGuess = false;
        if (pinsArray.get(i).equals(guess)) {
            goodGuess = true;
        }
        return goodGuess;
    }

    private static int randomWholeNumber() {
        int randNum = (int) (Math.random() * 4);
        return randNum;
    }
}