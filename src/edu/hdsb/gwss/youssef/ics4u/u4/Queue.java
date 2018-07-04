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
public class Queue implements QueueInterface {

    //CLASS CONSTANTS
    //CLASS VARIABLES
    private static int CAPACITY = 10;
    //OBJECT VARIABLES
    private int[] queue;
    private int front = -1;
    private int back = -1;

    public Queue() {
        this(CAPACITY);
        System.out.println("Default queue size: 10");
    }

    public Queue(int size) {
        this.queue = new int[size];
    }

    @Override
    public Integer front() {
        if (!this.isEmpty()) {
            return this.queue[this.front];
        } else {
            System.out.println("Empty Queue!");
            return null;
        }
    }

    @Override
    public Integer back() {
        if (!this.isEmpty()) {
            return this.queue[this.back];
        } else {
            System.out.println("Empty Queue!");
            return null;
        }
    }

    @Override
    public void enqueue(Integer value) {
        if (value >= 0) {
            if (this.isEmpty()) {
                this.front = 0;
                this.back = 0;
                this.queue[this.front] = value;
            } else if (!this.isFull()) {
                if (size() == 1) {
                    this.queue[++this.back] = value;
                } else if (size() > 1 && this.back == 0) {
                    this.queue[++this.back] = value;
                } else {
                    this.back %= capacity() - 1;
                    if (this.back != 0) {
                        this.queue[++this.back] = value;
                    } else {
                        this.queue[this.back] = value;
                    }
                }
            } else {
                System.out.println("Full Queue!");
            }
        } else {
            System.out.println("Invalid Value");
        }
    }

    @Override
    public Integer dequeue() {
        if (!this.isEmpty()) {
            if (size() == 1) {
                Integer temp = this.queue[this.front];
                makeEmpty();
                return temp;
            }

            Integer temp = this.queue[this.front];
            this.front = (this.front + 1) % capacity();
            return temp;

        } else {
            System.out.println("Empty Queue!");
            return null;
        }
    }

    @Override
    public int size() {
        if (this.isEmpty()) {
            return 0;
        }
        if (this.front == this.back) {
            return 1;
        }
        if (back < front) {
            return back + capacity() - front + 1;
        }
        return this.back - this.front + 1;
    }

    @Override
    public int capacity() {
        return this.queue.length;
    }

    @Override
    public boolean isEmpty() {
        return this.back == -1;
    }

    @Override
    public boolean isFull() {
        return this.size() == this.capacity();
    }

    @Override
    public void makeEmpty() {
        this.front = -1;
        this.back = -1;
    }

    public void displayQueue() {
        if (!this.isEmpty()) {
            for (int i = 0; i < this.capacity(); i++) {
                if (i == this.back && i == this.front) {
                    System.out.format("%13s", "fb");
                } else if (i == this.front) {
                    System.out.format("%13s", "f");
                } else if (i == this.back) {
                    System.out.format("%13s", "b");
                } else {
                    System.out.format("%13s", " ");
                }

            }
        } else {
            System.out.println("queue empty");
        }

        System.out.println();
        for (int i = 0; i < this.capacity(); i++) {
            System.out.format("%13d", this.queue[i]);
        }
        System.out.println("");
    }

}
