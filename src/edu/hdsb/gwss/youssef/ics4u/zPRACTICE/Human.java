/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.zPRACTICE;

/**
 *
 * @author Youss
 */
public class Human {
    
    Food fo = new Tuna();
    
    public void digest(Food x) {
        x.eat();
        
        x.cook();
    }
}
