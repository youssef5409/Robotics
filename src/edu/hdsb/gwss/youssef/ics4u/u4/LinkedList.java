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
public class LinkedList implements LinkListInterface {

    public Node head;
    public Node tail;
    private Node next;
    private Node temp;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public int size() {
        if (this.isEmpty()) {
            return 0;
        }
        if (this.head.getNext() == null) {
            return 1;
        }

        int i = 1;
        next = this.head;

        while (next.getNext() != null) {
            next = next.getNext();
            i++;
        }
        return i;
    }

    @Override
    public void makeEmpty() {
        this.head = null;
        this.tail = null;
    }

    @Override
    public boolean isEmpty() {
        return this.head == null && this.tail == null;
    }

    @Override
    public void addAtFront(String str) {
        if (this.isEmpty()) {
            this.head = new Node(str);
            this.tail = this.head;
        } else if (this.size() == 1) {
            this.tail = this.head;
            this.head = new Node(str);
            this.head.setNext(tail);
        } else {
            temp = this.head;
            this.head = new Node(str);
            this.head.setNext(temp);
        }

    }

    @Override
    public void addAtEnd(String str) {
        if (this.isEmpty()) {
            this.head = new Node(str);
            this.tail = this.head;
        } else if (this.size() == 1) {
            this.head = this.tail;
            this.tail = new Node(str);
            this.head.setNext(tail);
        } else {
            Node temp = this.head;
            this.head = new Node(str);
            this.head.setNext(temp);
        }
    }

    //NOTE TO MUIR, THIS IS AHMAD'S CODE, USING IT FOR REFERENCE.
    @Override
    public void remove(String str) {
        if (this.isEmpty()) {
            System.out.println("Empty Linked List!");
        } else if (this.size() == 1 && this.head.getData().equals(str)) {
            this.makeEmpty();
        } else {

            boolean valueFound = false;
            if (this.head.getData().equals(str)) {
                removeHead();
                valueFound = true;
            } else if (this.tail.getData().equals(str)) {
                removeTail();
                valueFound = true;
            } else {
                this.temp = this.head;

                while (this.temp.getNext() != this.tail && !valueFound) {
                    if (this.temp.getNext().getData().equals(str)) {
                        next = this.temp.getNext();
                        this.temp.setNext(this.temp.getNext().getNext());
                        next.setNext(null);
                        valueFound = true;
                    } else {
                        this.temp = this.temp.getNext();
                    }
                }
            }
            if (!valueFound) {
                System.out.println("Value not Found, could Not remove");
            }
        }
    }

    @Override
    public String removeHead() {
        if (this.isEmpty()) {
            return "LinkList empty, no head found";
        }
        if (this.size() == 1) {
            String str = this.head.getData();
            this.makeEmpty();
            return str;
        }
        String str = this.head.getData();
        this.temp = this.head.getNext();
        this.head.setNext(null);
        this.head = this.temp;

        return str;
    }

    @Override
    public String removeTail() {
        if (this.isEmpty()) {
            return "LinkList empty, no tail found";
        }
        String str;
        if (this.size() == 1) {
            str = this.tail.getData();
            this.makeEmpty();
            return str;
        }
        this.temp = this.head;
        while (this.temp.getNext() != this.tail) {
            this.temp = this.temp.getNext();
        }
        str = this.tail.getData();
        this.temp.setNext(null);
        this.tail = this.temp;
        return str;
    }

    @Override
    public String head() {
                if (this.isEmpty()) {
            return "LinkList Empty, head does not exist";
        }
        return this.head.getData();
    }

    @Override
    public String tail() {
        if (this.isEmpty()) {
            return "LinkList Empty, tail does not exist";
        }
        return this.tail.getData();
    }

}
