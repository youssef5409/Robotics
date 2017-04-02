/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discovering;

/**
 *
 * @author Motaforian
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               double sum = 0;
        double n = 1;
        double total;
        //explanation of program to user
        System.out.println("Closer to Two: \nThis program demonstrates that"
                + " the result of adding numbers 1, 1/2,1/4,1/16... "
                + "and so on gets closer to two without becoming two.\n");
        //loop
        while(sum < 2){
            total = sum + 1 / n;
            System.out.println(sum + " + " + "1/" + n + " = " + total);
            n *= 2;
            sum = total;
        }
    }
    
}
