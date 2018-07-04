/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u6;

import java.util.Calendar;
import java.util.Objects;

/**
 *
 * @author 1mohamedyou
 */
public final class Car {

    private String company; //Max Length 15
    private String model; //Max Length 15

    protected static final int CAR_COMPANY_LENGTH = 15;
    protected static final int CAR_MODEL_LENGTH = 15;

    protected long ID;

    private int year;
    private int horsepower;

    private double price;

    private char type;

    private boolean hybrid;

    protected static final int RECORD_SIZE = 79;

    public Car() {
    }

    public Car(String carCompany, String carModel, int carYear, int horsepower, double price, char carType, boolean hybrid) {
        this.setID(-1);
        this.setCompany(carCompany);
        this.setModel(carModel);
        this.setYear(carYear);
        this.setHorsepower(horsepower);
        this.setPrice(price);
        this.setType(carType);
        this.setHybrid(hybrid);
    }

    public long getID() {
        return ID;
    }

    protected void setID(long ID) {
        if (ID > -2) {
            this.ID = ID;
        } else {
            System.out.println("Invalid ID, set to -1");
            this.ID = -1;
        }
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {

        StringBuilder temp = new StringBuilder();

        if (company != null) {
            temp.append(company.trim());
        } else {
            temp.append("TBD");
        }

        // trucates or pads the string
        temp.setLength(CAR_COMPANY_LENGTH);
        this.company = temp.toString();

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {

        StringBuilder temp = new StringBuilder();

        if (model != null) {
            temp.append(model.trim());
        } else {
            temp.append("TBD");
        }

        // trucates or pads the string
        temp.setLength(CAR_MODEL_LENGTH);
        this.model = temp.toString();

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > 1890 && year <= Calendar.getInstance().get(Calendar.YEAR)) {
            this.year = year;
        } else {
            System.out.println("Invalid year, default of " + Calendar.getInstance().get(Calendar.YEAR) + " used.");
            this.year = 2018;
        }
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        if (horsepower > 0) {
            this.horsepower = horsepower;
        } else {
            System.out.println("Invalid horsepower, default of 150 used.");
            this.horsepower = 150;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        } else {
            System.out.println("Invalid price, default of $10,000 used.");
            this.price = 10000;
        }
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        //S = Sedan
        //C = Coupe
        //U = SUV
        //R = Crossover
        //P = Pickup
        //V = Van
        //O = Other

        if (type == 'S' || type == 'C' || type == 'U' || type == 'R' || type == 'P' || type == 'V' || type == 'O') {
            this.type = type;
        } else {
            System.out.println("Invalid car type, default of Sedan used.");
            this.type = 'S';
        }
    }

    public boolean isHybrid() {
        return hybrid;
    }

    public void setHybrid(boolean hybrid) {
        this.hybrid = hybrid;
    }

    public boolean isValid() {
        return this.company != null && this.model != null && this.year != 0
                && this.horsepower != 0 && this.price != 0.0 && this.type != '\u0000';
    }

    @Override
    public String toString() {
        return "Car Company:    " + this.getCompany()
                + "\nCar Model:      " + this.getModel()
                + "\nCar Year:       " + this.getYear()
                + "\nCar Horsepower: " + this.getHorsepower()
                + "\nCar Price:      " + this.getPrice()
                + "\nCar Type:       " + this.getType()
                + "\nCar Hybrid:     " + this.isHybrid();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Car other = (Car) obj;
        if (this.year != other.year) {
            return false;
        }
        if (this.horsepower != other.horsepower) {
            return false;
        }
        if (Double.doubleToLongBits(this.price) != Double.doubleToLongBits(other.price)) {
            return false;
        }
        if (this.type != other.type) {
            return false;
        }
        if (this.hybrid != other.hybrid) {
            return false;
        }
        if (!Objects.equals(this.company, other.company)) {
            return false;
        }
        return Objects.equals(this.model, other.model);
    }

}
