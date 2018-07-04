/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.zPRACTICE;

import edu.hdsb.gwss.youssef.ics4u.u6.Car;
import java.io.*;

/**
 *
 * @author 1mohamedyou
 */
public class CarClientWriter {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        System.out.println("Creating 4 Car Records");
        
        Car c1 = new Car("Mercedes", "C63s", 2018, 503, 86299.99, 'C', false);

        Car c2 = new Car("Audi", "RS5", 2018, 444, 83390, 'C', false);

        Car c3 = new Car("BMW", "M4", 2018, 425, 86750, 'C', false);

        Car c4 = new Car("Porsche", "Carrera", 2018, 370, 104000, 'C', false);
        
        System.out.println("*********************");

        RandomAccessFile recordFile = new RandomAccessFile("car_info.txt", "rw");

        recordFile.seek(0);

        recordFile.writeChars(c1.getCompany());
        recordFile.writeChars(c1.getModel());
        recordFile.writeInt(c1.getYear());
        recordFile.writeInt(c1.getHorsepower());
        recordFile.writeDouble(c1.getPrice());
        recordFile.writeChar(c1.getType());
        recordFile.writeBoolean(c1.isHybrid());
        
        recordFile.writeChars(c2.getCompany());
        recordFile.writeChars(c2.getModel());
        recordFile.writeInt(c2.getYear());
        recordFile.writeInt(c2.getHorsepower());
        recordFile.writeDouble(c2.getPrice());
        recordFile.writeChar(c2.getType());
        recordFile.writeBoolean(c2.isHybrid());
        
        recordFile.writeChars(c3.getCompany());
        recordFile.writeChars(c3.getModel());
        recordFile.writeInt(c3.getYear());
        recordFile.writeInt(c3.getHorsepower());
        recordFile.writeDouble(c3.getPrice());
        recordFile.writeChar(c3.getType());
        recordFile.writeBoolean(c3.isHybrid());
        
        recordFile.writeChars(c4.getCompany());
        recordFile.writeChars(c4.getModel());
        recordFile.writeInt(c4.getYear());
        recordFile.writeInt(c4.getHorsepower());
        recordFile.writeDouble(c4.getPrice());
        recordFile.writeChar(c4.getType());
        recordFile.writeBoolean(c4.isHybrid());

        System.out.println(recordFile.length());

    }

}
