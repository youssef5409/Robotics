/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u4;

/**
 *
 * @author 1mohamedyou
 */
public class StackClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Stack s = new Stack(10);

        // TEST #1 - TESTING EMPTY STACK
        assert (s.top() == -1);
        assert (s.pop() == -1);
        assert (s.size() == 0);
        assert (s.capacity() == 10);
        assert (s.isEmpty());
        assert (!s.isFull());

        // TEST #2 - FILL STACK TILL FULL
        for (int i = 1; i <= 10; i++) {
            s.push(i);
            assert (s.top() == i);
            assert (s.size() == i);
            assert (s.capacity() == 10);
            assert (!s.isEmpty());

            if (i < 10) {
                assert (!s.isFull());
            } else {
                assert (s.isFull());
            }
        }

        // TEST #3 - OVERFLOW
        s.push(999);
        assert (s.top() == 10);
        assert (s.size() == 10);
        assert (s.capacity() == 10);
        assert (!s.isEmpty());
        assert (s.isFull());
        
        // TEST #4 - POP

    }

}
