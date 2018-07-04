/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u1;

import static java.lang.Math.acos;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.Scanner;


/**
 *
 * @author Youss
 */
public class DistanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double lat1, lat2, lon1, lon2, greatDistance;
        
        System.out.print("Latitude 1: ");
        lat1 = Math.toRadians(read.nextDouble());
       
        System.out.print("Longitude 1: ");
        lon1 = Math.toRadians(read.nextDouble());
        
        System.out.print("Latitude 2: ");
        lat2 = Math.toRadians(read.nextDouble());
        
        System.out.print("Longitude 2: ");
        lon2 = Math.toRadians(read.nextDouble());
        
        greatDistance = 6378.8 * acos(sin(lat1) * sin(lat2) + cos(lat1) * 
                cos(lat2) * cos(lon2 - lon1));
        
        System.out.println(greatDistance);
    }
    
}
