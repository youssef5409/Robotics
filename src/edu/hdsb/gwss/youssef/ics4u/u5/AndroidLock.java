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
public final class AndroidLock extends Lock {
    
    public AndroidLock() {
        this.id = Lock.serial++;
        this.combo = Lock.genCombo(9, 3);
        this.open = false;
        this.gotCombo = false;
        System.out.println("Combo: " + Arrays.toString(combo));
    }

    public AndroidLock(int[] combo) {
        this.setCombo(combo);
        this.id = Lock.serial++;
        this.combo = combo;
        this.open = true;
        this.gotCombo = false;
        System.out.println("Combo: " + Arrays.toString(combo));
    }

    public void setCombo(int[] combo) {
        boolean valid = true;
        if (!this.open) {
            System.out.println("Sorry, lock is locked.");
        } else {
            if (combo.length != 4) {
                System.out.println("Sorry, invalid combo length, random combo generated.");
                this.combo = Lock.genCombo(9, 3);

                for (int num : combo) {
                    System.out.println(num);
                }
            } else {
                for (int num : combo) {
                    if (!(num <= 9 && num >= 0)) {
                        valid = false;
                    }
                }
                if (valid) {
                    this.combo = combo;
                } else {
                    System.out.println("Sorry, invalid combo length, random combo generated.");
                    this.combo = Lock.genCombo(9, 3);
                    for (int num : combo) {
                        System.out.println(num);
                    }
                }

            }
        }
    }
    
}
