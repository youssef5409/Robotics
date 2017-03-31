/*
 * Name: Erosion.java
 * Author: Mohamad Elsawi
 * Date: November 4th, 2015
 * Version: 1.0
 * Description: This program will determine how 
 many years will it take for the depth to be reduced 
 to 9 cm if Canada has 30cm of topsoil.
 */
package discovering;

/**
 *
 * @author Mohamad2
 */
public class TheMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //INTRODUCTION
        System.out.println("Topsoil Erosion");
        System.out.println("");
        System.out.println("Careless land management causes approximately 1% of "
                + "the topsoil to erode each year.");
        System.out.println("It is then lost forever, since it takes nature "
                + "approximately 500 years to produce 2.5cm of topsoil.");
        System.out.println("At 9cm, the topsoil is so shallow that crops cannot "
                + "grow on a large scale.");
        System.out.println("If Canada has 30cm of topsoil, how many years will it"
                + " take to erode to a depth such that crops will not grow.");
        System.out.println("");
        //CONSTANTS
        final double TOPSOIL_EROSION_YEARLY = 0.01;
        final double TOPSOIL_GROWTH_YEARLY = 0.005; //2.5/500
        final double TOPSOIL_MINIMUM = 9;
        //VARIABLES
        double topsoilDepth;
        int yearCount;
        //CREATE A FOR LOOP
        for (yearCount = 1, topsoilDepth = 30; topsoilDepth >= TOPSOIL_MINIMUM; yearCount++) {
            topsoilDepth = topsoilDepth - (topsoilDepth * TOPSOIL_EROSION_YEARLY) + TOPSOIL_GROWTH_YEARLY;
        }
        System.out.println("It will take " + yearCount + " years for the soil"
                + " to erode to a depth such that crops will not grow.");

    }

}
