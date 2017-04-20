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

    public static void play() {
        //Initialzing Variables
        boolean valid;
        boolean allRight = false;
        int attempts = 0;
        int placeAndColour;
        int colour;
        int i;
        String[] guessLine;
        
        //Initializing Objects
        Scanner read = new Scanner(System.in);
        ArrayList coloursPinsHave = new ArrayList();
        ArrayList coloursArray = new ArrayList();
        ArrayList pinsArray = new ArrayList();
        
        //Adding english colours to array
        coloursArray.add("blue");
        coloursArray.add("yellow");
        coloursArray.add("red");
        coloursArray.add("green");
        
        //Assinging each pin a colour
        pinsArray.add(coloursArray.get(randomWholeNumber()));
        pinsArray.add(coloursArray.get(randomWholeNumber()));
        pinsArray.add(coloursArray.get(randomWholeNumber()));
        pinsArray.add(coloursArray.get(randomWholeNumber()));
        
        //Printing out each pin's colour, in order.
        System.out.println(pinsArray.get(0));
        System.out.println(pinsArray.get(1));
        System.out.println(pinsArray.get(2));
        System.out.println(pinsArray.get(3));
        
        //While loop that waits for the user to guess all four colours correctly
        while (!allRight) {
            //Resetting variables for more guesses
            placeAndColour = 0;
            colour = 0;
            attempts++;
            coloursPinsHave.clear();
            valid = false;
            for (i = 0; i < 4; i++) {
                coloursPinsHave.add(pinsArray.get(i));
            }
            //Prompting user for input
            System.out.println("Enter 4 guesses separated by spaces");
            System.out.print("Guesses can be \"green\", \"blue\", \"red\" "
                    + "or \"yellow\": ");
            //Checking for valid guesses
            while (!valid) {
                guessLine = read.nextLine().split(" ");
                if (!verifyGuessLine(guessLine, coloursPinsHave)) {
                } else {
                    valid = true;
                    for (i = 0; i < 4; i++) {
                        //Checking if user users guess is a correct one
                        if (checkGuessAndSpot(pinsArray, guessLine[i], i)) {
                            placeAndColour++;
                            colour++;
                            coloursPinsHave.remove(guessLine[i]);
                        }
                        else if (checkGuess(coloursPinsHave, guessLine[i])) {
                            colour++;
                            coloursPinsHave.remove(guessLine[i]);
                        }
                    }
                }
            }
            //Shows the user how well he guessed
            System.out.println("\n");
            System.out.println("You guessed " + placeAndColour + " spot(s) and colour(s) correctly");
            System.out.println("You guessed " + colour + " colour(s) correctly");
            System.out.println("\n");
            if (placeAndColour == 4) {
                allRight = true;
            }
        }
        //Shows the user the number of attempts it took him to guess
        System.out.println("Congratulations! It took you " + attempts + " attempt(s) to win!");
    }
    //Method for verifying guess colour
    private static boolean checkGuess(ArrayList coloursPinsHave, String guess) {
        boolean goodGuess = false;
        if (coloursPinsHave.contains(guess)) {
            goodGuess = true;
        }
        return goodGuess;
    }
    //Method for verifying guess colour and its spot
    private static boolean checkGuessAndSpot(ArrayList pinsArray, String guess, int i) {
        boolean goodGuess = false;
        if (pinsArray.get(i).equals(guess)) {
            goodGuess = true;
        }
        return goodGuess;
    }
    //Method for getting a random int, this method feels forced
    private static int randomWholeNumber() {
        int randNum = (int) (Math.random() * 4);
        return randNum;
    }
    //Ascertains that the user has entered a guess, that is either green, red, yellow or blue
    //Also checks for the number of guesses in the line
    private static boolean verifyGuessLine(String[] guessLine, ArrayList coloursPinsHave) {
        boolean verified = true;
        if (guessLine.length != 4) {
            System.out.print("Please enter 4 guesses at once: ");
            verified = false;
        } else {
            for (int i = 0; i < 4; i++) {
                if (!coloursPinsHave.contains(guessLine[i])) {
                    verified = false;
                }

            }
            if (!verified) {
                System.out.print("Sorry, an invalid guess was entered: ");
            }
        }
        return verified;
    }
}
