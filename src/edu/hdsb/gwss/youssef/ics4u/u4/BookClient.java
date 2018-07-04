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
public class BookClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Book a = new Book(1, " hgfdh", "dgsd");
        a.setAuthor ("Muir");
        a.setTitle("Computer Science for Dummies");
        a.setnOfPages(100);
        System.out.println(a);
    }
}
