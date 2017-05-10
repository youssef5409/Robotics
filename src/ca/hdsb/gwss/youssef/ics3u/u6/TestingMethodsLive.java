/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

import java.util.Arrays;

/**
 *
 * @author 1mohamedyou
 */
public class TestingMethodsLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] x = ArrayUtils.generateArray(10, 4, 'A', '[');
        
        ArrayUtils.selectionStringDsc(x);
        
        ArrayUtils.display(x);
    }

}
