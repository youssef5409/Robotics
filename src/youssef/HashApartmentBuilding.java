/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youssef;

/**
 *
 * @author Youss
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashApartmentBuilding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nOfFloors;
        int nOfRooms;
        String a;

        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to your own apartment building");

        System.out.print("How many floors are there in this building?: ");
        nOfFloors = read.nextInt();

        System.out.print("How many rooms are there in this building?: ");
        nOfRooms = read.nextInt();

        Map<Integer, Integer> mMap = new HashMap<>();
        for (int j = 1; j <= nOfFloors; j++) {
            for (int i = 1; i <= nOfRooms; i++) {
                mMap.put(j, i);
            }
        }

        for (Map.Entry key : mMap.entrySet()) {
            a = getPerson((int) key.getKey(), (int) key.getValue());
            System.out.println(a);

        }
    }

    public static String getPerson(int floor, int room) {
        String name;
        String floorLetter;
        String roomLetter;

        String quad = "abcdefghijklmnopqrstuvwxyz";

        floorLetter = Character.toString(quad.charAt(floor - 1));
        roomLetter = Character.toString(quad.charAt(room - 1));

        name = floorLetter + roomLetter;
        return name;
    }

}
