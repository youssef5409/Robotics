/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discovering;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Motaforian
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a new, empty stack
        Scanner read = new Scanner(System.in);
        Stack stack = new Stack();
        ArrayList<String> array = new ArrayList();
        ArrayList<String> array2 = new ArrayList();
        
        array2.add("no");
        array.add(array2.get(1));
        array.add(" is");
        array.add(" dumb");
        array.add(" jk");
        array.add(" kyle");
        array.add(" is");
        array.add(" very");
        array.add(" dumb");
        array.add(" kyle");
        array.add(" kyle");
        
        // Let's add some items to it
        for (int i = 10; i >= 1; i--) {
            stack.push(i + " -");
        }

        // Last in first out means reverse order
        int i = 0;
        while (!stack.empty()) {
            System.out.println(stack.pop() + array.get(i));
            i++;
        
        }
    }
}

    

