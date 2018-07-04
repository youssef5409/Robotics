/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.zPRACTICE;


import edu.hdsb.gwss.youssef.ics4u.u6.Car;
import edu.hdsb.gwss.youssef.ics4u.u6.CarDatabase;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Youss
 */
public class CarClientReader {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        long position, recordNumber;
        Scanner input = new Scanner(System.in);

        RandomAccessFile recordFile = new RandomAccessFile("car_info.txt", "r");

        long numRecords = recordFile.length() / 79;

        System.out.println("\nThere are " + numRecords + " records currently in the file.");

        System.out.println("Which record do you want [1 - " + numRecords + "] or 0 to exit?");
        
        recordFile.seek( 79 *(input.nextLong() - 1) );
        
        
//        try {
//            raf.seek(Car.RECORD_SIZE * (position - 1));
//
//            System.out.print("Car Company:    ");
//            for (int i = 0; i < Car.CAR_COMPANY_LENGTH; i++) {
//                System.out.print(raf.readChar());
//            }
//
//            System.out.println("");
//
//            System.out.print("Car Model:      ");
//            for (int i = 0; i < Car.CAR_MODEL_LENGTH; i++) {
//                System.out.print(raf.readChar());
//            }
//
//            System.out.println("");
//
//            System.out.println("Car Year:       " + raf.readInt());
//            System.out.println("Car Horsepower: " + raf.readInt());
//            System.out.println("Car Price:      " + raf.readDouble());
//            System.out.println("Car Type:       " + raf.readChar());
//            System.out.println("Car Hybrid:     " + raf.readBoolean());
//
//        } catch (IOException ex) {
//            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return null;
        
    }

}
