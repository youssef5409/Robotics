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
public class Lock {

    protected static int serial = 1;
    protected int id;
    protected int attempts;

    protected int[] combo;

    protected boolean open;
    protected boolean gotCombo;

    public int getSerial() {
        return this.id;
    }

    public int[] getCombo() {
        if (!this.gotCombo) {
            this.gotCombo = true;
            return this.combo;
        } else {
            System.out.println("Already got combo");
            return null;
        }
    }

    public boolean isOpen() {
        return this.open;
    }

    public void lock() {
        this.open = false;
    }

    public void unlock(int[] combo) {
        if (this.attempts < 3) {
            if (Arrays.equals(combo, this.combo)) {
                this.open = true;
                this.attempts = 0;
                System.out.println("Unlocked, invalid attempts set to 0.");
            } else {
                this.attempts++;
                System.out.println("Fail");
            }
        } else {
            System.out.println("Lock Disabled");
        }
    }

    protected static int[] genCombo(int range, int length) {

        int[] combo = new int[length];

        for (int i = 0; i < length; i++) {
            combo[i] = (int) (Math.random() * range);
        }
        return combo;
    }

}
