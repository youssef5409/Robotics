/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u4;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author 1mohamedyou
 */
public class StudentClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//        Student a = new Student(1);
//        
//        Student b = new Student(1);
//        
//        System.out.println(a == b);
//        
//        System.out.println(a.equals(b));
        
        Queue<Integer> myNumbers = new LinkedList<>();
        myNumbers.add(2);
        System.out.println(myNumbers.size());
    }
    
}
