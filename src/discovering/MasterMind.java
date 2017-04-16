/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discovering;

import java.util.ArrayList;
import java.util.HashMap;
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
        HashMap<Integer, String> colours = new HashMap();
        HashMap<Integer, String> pins = new HashMap();

        colours.put(1, "blue");
        colours.put(2, "yellow");
        colours.put(3, "red");
        colours.put(4, "green");

        pins.put(1, colours.get((int) (Math.random() * 4 + 1)));
        pins.put(2, colours.get((int) (Math.random() * 4 + 1)));
        pins.put(3, colours.get((int) (Math.random() * 4 + 1)));
        pins.put(4, colours.get((int) (Math.random() * 4 + 1)));

        System.out.println(pins.get(1));
        System.out.println(pins.get(2));
        System.out.println(pins.get(3));
        System.out.println(pins.get(4));

        while (!allRight) {
            placeAndColour = 0;
            colour = 0;
            attempts++;
            coloursPinsHave.clear();
            for (int i = 1; i <= 5; i++) {
                coloursPinsHave.add(pins.get(i));
            }
            System.out.print("Enter 4 guesses separated by spaces "
                    + "(Guesses can be \"green\", \"blue\", \"red\" or \"yellow\"): ");
            for (int i = 1; i <= 4; i++) {
                guess = read.next().toLowerCase();
                if (checkGuessAndSpot(pins, guess, i)) {
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

    private static boolean checkGuess(ArrayList coloursPinsHave, String guess) {
        boolean goodGuess = false;
        if (coloursPinsHave.contains(guess)) {
            goodGuess = true;
        }
        return goodGuess;
    }

    private static boolean checkGuessAndSpot(HashMap pins, String guess, int i) {
        boolean goodGuess = false;
        if (pins.get(i).equals(guess)) {
            goodGuess = true;
        }
        return goodGuess;
    }
}
