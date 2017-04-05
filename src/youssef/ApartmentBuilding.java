/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package youssef;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Youss
 */
public class ApartmentBuilding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nOfFloors;
        int nOfRooms;

        ArrayList<Integer> floors = new ArrayList();
        ArrayList<Integer> rooms = new ArrayList();
        ArrayList<String> person = new ArrayList();
        
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to your own apartment building");

        System.out.print("How many floors are there in this building?: ");
        nOfFloors = read.nextInt();

        for (int i = 0; i < nOfFloors; i++) {
            floors.add(i);
        }

        System.out.print("How many rooms are there per floor?: ");
        nOfRooms = read.nextInt();
        
        for (int i = 0; i < nOfRooms; i++) {
            
            rooms.add(i);
        }



    }

}
