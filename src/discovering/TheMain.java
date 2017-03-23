/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discovering;

/**
 *
 * @author 1mohamedyou
 */
public class TheMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nVal;

        MethodOne test1 = new MethodOne();

        nVal = test1.number();
        if (nVal == 1) {
            System.out.println("nVal is 1.");
        } else {
            System.out.println("nVal is not 1.");
        }
    }

}
