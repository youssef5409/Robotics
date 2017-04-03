/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discovering;

import java.util.Scanner;

/**
 *
 * @author 1mohamedyou
 */
public class Frame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double q;
        double p;
        double n;
        double m;
        Scanner read = new Scanner(System.in);

        System.out.print("What is your Q Value?: ");
        q = read.nextDouble();
        System.out.print("What is your P value?: ");
        p = read.nextDouble();
        System.out.print("What is your N value?: ");
        n = read.nextDouble();
        System.out.print("What is your M value?: ");
        m = read.nextDouble();

        double counter2 = 0;
        double counter = q;
        
        while (counter > 0) {
            for (int i = 0; i < n + 2 * p + 2 * q; i++) {
                System.out.print("#");
            }
            System.out.println("");
            counter--;
        }

        counter = m + 2 * p;
        while (counter > 0) {
            for (int i = 0; i < q; i++) {
                System.out.print("#");
            }
            for (int i = 0; i < p; i++) {
                System.out.print("+");
            }
            if (counter2 >= p && counter2 < q + m) {
                for (int i = 0; i < n; i++) {
                    System.out.print(".");
                }
            } else {
                for (int i = 0; i < n; i++) {
                    System.out.print("+");
                }
            }
            for (int i = 0; i < p; i++) {
                System.out.print("+");
            }
            for (int i = 0; i < q; i++) {
                System.out.print("#");
            }
            System.out.println("");
            counter--;
            counter2++;
        }

        counter = q;
        while (counter > 0) {
            for (int i = 0; i < n + 2 * p + 2 * q; i++) {
                System.out.print("#");
            }
            System.out.println("");
            counter--;
        }
    }

}
