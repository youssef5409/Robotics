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
public class MethodOne {

    public static int number(int n) {
        if (n == 0) return 0;
        System.out.println(n);
        return n + number(n - 1);

    }
}
