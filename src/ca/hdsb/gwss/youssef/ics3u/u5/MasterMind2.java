/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class MasterMind2 {

    public static void main(String[] args) {
        int guesses;
        String guess;
        int counter = 0;
        Scanner read = new Scanner(System.in);
        
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

        System.out.print("Enter 4 guesses separated by spaces: ");
        for (int i = 1; i <= 4; i++) {
            guess = read.next();
            if (pins.get(i).equals(guess)) {
                counter++;
            }
        }
        System.out.println(counter);
    }

}
//Check for place and colour, instead of colour then place then place and colour