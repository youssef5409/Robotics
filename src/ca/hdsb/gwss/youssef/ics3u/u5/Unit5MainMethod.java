/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class Unit5MainMethod extends AbstractMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }

    @Override
    public void intro() {
        System.out.println("This is the unit 5 main method");
    }

    @Override
    public void options() {
        System.out.println("1 - "
                + "2 - "
                + "3 -"
                + "4 -"
                + "5 -"
                + "6 -");
    }

    @Override
    public int getApp() {
        int app = 0;
        boolean valid = false;
        Scanner read = new Scanner(System.in);

        while (!valid) {
            System.out.println("What would you like to do?");
        }
        return app;
    }

}
