/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 1mohamedyou
 */
public final class CarDatabase {

    private static RandomAccessFile raf;

    public CarDatabase() {
        CarDatabase.open();
    }

    public static void open() {
        try {
            CarDatabase.raf = new RandomAccessFile("car_info.txt", "rw");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CarDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void close() {
        try {
            CarDatabase.raf.close();
        } catch (IOException ex) {
            Logger.getLogger(CarDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Car save(Car car) {
        if (car.isValid()) {

            try {
                if (car.getID() == -1) {
                    CarDatabase.raf.seek(CarDatabase.raf.length());
                    car.setID(CarDatabase.raf.length() / Car.RECORD_SIZE);
                } else {
                    CarDatabase.raf.seek(car.getID());
                }
                CarDatabase.raf.writeChars(car.getCompany());
                CarDatabase.raf.writeChars(car.getModel());
                CarDatabase.raf.writeInt(car.getYear());
                CarDatabase.raf.writeInt(car.getHorsepower());
                CarDatabase.raf.writeDouble(car.getPrice());
                CarDatabase.raf.writeChar(car.getType());
                CarDatabase.raf.writeBoolean(car.isHybrid());
                return car;
            } catch (IOException ex) {
                Logger.getLogger(CarDatabase.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            System.out.println("Car has empty fields.");
        }
        return null;
    }

    public static long size() {
        try {
            return CarDatabase.raf.length() / Car.RECORD_SIZE;
        } catch (IOException ex) {
            Logger.getLogger(CarDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return -1;
    }

    public static Car get(long id) {
        Car car = new Car();
        try {
            if (id > 0 && id < CarDatabase.raf.length() / Car.RECORD_SIZE) {

                String s = "";

                CarDatabase.raf.seek(Car.RECORD_SIZE * (id - 1));

                for (int i = 0; i < Car.CAR_COMPANY_LENGTH; i++) {
                    s += CarDatabase.raf.readChar();
                }

                car.setCompany(s);
                s = "";

                for (int i = 0; i < Car.CAR_MODEL_LENGTH; i++) {
                    s += CarDatabase.raf.readChar();
                }

                car.setModel(s);
                car.setYear(CarDatabase.raf.readInt());
                car.setHorsepower(CarDatabase.raf.readInt());
                car.setPrice(CarDatabase.raf.readDouble());
                car.setType(CarDatabase.raf.readChar());
                car.setHybrid(CarDatabase.raf.readBoolean());
            }
        } catch (IOException ex) {
            Logger.getLogger(CarDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        return car;

    }

    public static void clear() {
        try {
            CarDatabase.raf.setLength(0);
        } catch (IOException ex) {
            Logger.getLogger(CarDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
