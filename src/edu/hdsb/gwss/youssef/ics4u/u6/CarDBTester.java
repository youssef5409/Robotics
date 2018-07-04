/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u6;

/**
 *
 * @author 1mohamedyou
 */
public class CarDBTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CarDatabase.open();

        Car c1 = new Car("Mercedes", "C63s", 2018, 503, 86299.99, 'C', false);

        Car c2 = new Car("Audi", "RS5", 2018, 444, 83390, 'C', false);

        Car c3 = new Car("BMW", "M4", 2018, 425, 86750, 'C', false);

        Car c4 = new Car("Porsche", "Carrera", 2018, 370, 104000, 'C', false);

        CarDatabase.save(new Car());

        CarDatabase.clear();

        CarDatabase.save(c1);
        assert (c1.getID() == 0);
        CarDatabase.save(c2);
        assert (c2.getID() == 1);
        CarDatabase.save(c3);
        assert (c3.getID() == 2);
        CarDatabase.save(c4);
        assert (c4.getID() == 3);

        Car c = CarDatabase.get(3);
        assert (c.equals(CarDatabase.get(3)));
        assert (c.equals(c3));

        CarDatabase.get(-5);
        CarDatabase.get(CarDatabase.size() + 1);
        CarDatabase.close();
    }

}
