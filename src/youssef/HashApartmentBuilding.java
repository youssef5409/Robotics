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
        int oldMen = 0;
        int youngMen = 0;
        
        int nOfFloors;
        int nOfRooms;

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
        char a;
        
        for (Map.Entry key : mMap.entrySet()) {
            a = getPerson(((int) key.getKey() + (int) key.getValue()));
            System.out.println(a);

        }
    }
    public static char getPerson(int floor) {
        char name;
        String quad = "abcdefghijklmnopqrstuvwxyz";
        char[] typeOfQuad;
        typeOfQuad = quad.toCharArray();
            
        name = quad.charAt(floor);
        
        return name;
    }

}
