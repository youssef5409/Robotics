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
public class Stack implements StackInterface {

    //CLASS CONSTANTS
    //CLASS VARIABLES
    private static int size = 1;
    //OBJECT VARIABLES
    private final int[] stack;
    private int pointer = -1;

    public Stack() {
        this(size);
        System.out.println("Default stack size: 1");
    }

    public Stack(int size) {
        this.stack = new int[size];
    }

    @Override
    public int top() {
        if (!isEmpty()) {
            return this.stack[this.pointer];
        }
        System.out.println("Empty Stack!");
        return -1;
    }

    @Override
    public int pop() {
        if (!isEmpty()) {
            return this.stack[this.pointer--];
        } else {
            System.out.println("Empty Stack!");
            return -1;
        }
    }

    @Override
    public void push(int value) {
        if (value < 0) {
            System.out.println("Invalid Value");
        }
        if (!isFull()) {
            this.stack[++this.pointer] = value;
        } else {
            System.out.println("Stack is Full!");
        }
    }

    @Override
    public int size() {
        return this.pointer + 1;
    }

    @Override
    public int capacity() {
        return this.stack.length;
    }

    @Override
    public boolean isEmpty() {
        return this.pointer == -1;
    }

    @Override
    public boolean isFull() {
        return this.size() == this.capacity();
    }

    @Override
    public void makeEmpty() {
        this.pointer = -1;
    }
}
