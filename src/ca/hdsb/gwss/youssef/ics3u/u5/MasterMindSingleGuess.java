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
public class MasterMindSingleGuess {

    public static void main(String[] args) {
        boolean allRight = false;
        int attempts = 0;
        String guess;
        int placeAndColour;
        int colour;

        ArrayList coloursPinsHave = new ArrayList();
        ArrayList coloursArray = new ArrayList();
        ArrayList pinsArray = new ArrayList();
        ArrayList<String> numbers = new ArrayList();
        
        numbers.add("first");
        numbers.add("second");
        numbers.add("third");
        numbers.add("fourth");

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
            System.out.println("Guesses can be \"green\", \"blue\", \"red\" "
                    + "or \"yellow\"");
            for (int i = 0; i < 4; i++) {
                guess = getGuess(coloursArray, numbers.get(i));
                if (checkGuessAndSpot(pinsArray, guess, i)) {
                    placeAndColour++;
                }
                if (checkGuess(coloursPinsHave, guess)) {
                    colour++;
                    coloursPinsHave.remove(guess);
                }
            }
            System.out.println("You guessed " + placeAndColour + " spots and colours correctly");
            System.out.println("You guessed " + colour + " colours correctly");
            if (placeAndColour == 4) {
                allRight = true;
            }
        }
        System.out.println("Congratulations! It took you " + attempts + " attempt(s) to win!");
    }

    private static String getGuess(ArrayList coloursArray, String number) {
        String guess;
        boolean verified = false;
        Scanner read = new Scanner(System.in);
        do {
            System.out.print("Enter the " + number + " guess (Anything after the guess will"
                    + " be ignored): ");
            guess = read.next().toLowerCase();
            read.nextLine();
            if (!(coloursArray.contains(guess))) {
                System.out.println("Sorry, invalid guess");
            } else {
                verified = true;
            }
        } while (!verified);
        return guess;
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
