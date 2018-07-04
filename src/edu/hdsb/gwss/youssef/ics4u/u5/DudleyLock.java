/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u5;

import java.util.Arrays;

/**
 *
 * @author 1mohamedyou
 */
public class DudleyLock extends Lock {

    public DudleyLock() {

        this.id = Lock.serial++;
        this.combo = Lock.genCombo(60, 3);
        this.open = false;
        this.gotCombo = false;
        System.out.println("Combo: " + Arrays.toString(combo));
    }

}
