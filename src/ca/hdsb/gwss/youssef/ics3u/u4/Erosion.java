/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.hdsb.gwss.youssef.ics3u.u4;

/**
 *
 * @author 1mohamedyou
 */
public class Erosion {

    /**
     * @param args the command line arguments
     */
    private static int i;
    public static void main(String[] args) {
        double topsoil = 30;
        final int MINIMUM_TOP_SOIL = 9;
        final double YEARLY_TOPSOIL_GROWTH = 0.005;
        final double YEARLY_EROSION = 0.01;
        System.out.println("Topsoil Erosion");
        System.out.println("Careless land management causes approximately 1% of \n"
                + "the topsoil to erode each year. It is then lost forever, since \n"
                + "it takes nature approximately 500 years to produce 2.5cm of topsoil. \n"
                + "At 9cm, the topsoil is so shallow the crops cannot grow on \n"
                + "a large scale. If Canada has about 30cm of topsoil, how many \n"
                + "years will it take for the depths to be reduced to 9cm? \n");
        
        for (i = 0; topsoil > MINIMUM_TOP_SOIL; i++) {
            topsoil += YEARLY_TOPSOIL_GROWTH;
            topsoil -= YEARLY_EROSION * topsoil;
        }
        System.out.println("It will take " + i + " years.");
    }
    
}
