/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u6;

/**
 *
 * @author 1mohamedyou
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x = ArrayUtils.generateArray(5, -1, 8 );
        
        ArrayUtils.display(x);
        ArrayUtils.selectionIntDsc(x);
        System.out.println(ArrayUtils.binarySearch(x, 1));
        ArrayUtils.display(x);
        
    }
    
}
