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
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] x = {1, 3, 9, 2, 3, 1, 5, 3, 4};
        bubbleSort(x);
    }

    public static void bubbleSort(int[] x) {
        int temp;
        for (int i = 0; i < x.length; i++) {
            for (int j = 1; j < x.length - i; j++) {
                if (x[j - 1] > x[j]) {
                    temp = x[j - 1];
                    x[j - 1] = x[j];
                    x[j] = temp;
                }
            }
            System.out.println("----------------------------");
            for (int g : x) {
                System.out.println(g);
            }
        }
    }
}

//        for (int i = 0; i < x.length - i; i++) {
//            int temp;
//            if (x[i] > x[i + 1]) {
//                temp = x[i + 1];
//                x[i + 1] = x[i];
//                x[i] = temp;
//            }
//            System.out.println("----------------------------");
//            for (int g : x) {
//
//                System.out.println(g);
//                
//            }
//            System.out.println("----------------------------");
//        }
