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
public class HashTableTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//         TEST #1 - EMPTY!
//          HashTable ht = new HashTable();
//
//        ht.size() = 0;
//        capacity = 53;
//        contains(123);
//        get(123);
//        contains(new Student());
//        containsKey(123);
//        loadFactor();
//
//        for (39  times) {
//            Student s = new Student(); //HashCode for less collisions
//            put(s.getPK(), s);
//            size() = i + 1;
//            capacity = 53;
//            contains(s.getPK());
//            get(s.getPK()).equals();
//            contains(s);
//            containsKey(s.getPK());
//            loadFactor() == (i / 53);
//        }
//        
//        s = new Student();
//        put(s.getPK(), s);
//        Should be rehashed
//        No deletes, so testing is ez

        HashTable h = new HashTable();
        System.out.println(h.contains(new Student(1)));
    }

}
