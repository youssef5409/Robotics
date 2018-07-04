/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.youssef.ics4u.u4;

/**
 *
 * @author Youss
 */
public class HashTable implements HashTableInterface {

    public Student[] studentList;
    private static final int CAPACITY = 53;

    public HashTable() {
        this(CAPACITY);
        System.out.println("Default queue size: 53");
    }

    public HashTable(int capacity) {
        if (capacity < 5) {
            this.studentList = new Student[this.newPrime(CAPACITY)];
            System.out.println("Sorry, capacity too small. Default 53");
        } else {
            this.studentList = new Student[this.newPrime(capacity)];
            System.out.println("Size set to: " + this.newPrime(capacity));
        }
    }

    @Override
    public int size() {
        int size = 0;
        for (Student student : this.studentList) {
            if (student != null) {
                size++;
            }
        }
        return size;
    }

    @Override
    public int capacity() {
        return this.studentList.length;
    }

    @Override
    public double loadFactor() {
        return (double) this.size() / this.capacity();
    }

    @Override
    public void makeEmpty() {
        this.studentList = new Student[this.capacity()];
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public void rehash() {
        Student[] studentList2 = this.studentList;

        this.studentList = new Student[this.newPrime(this.studentList.length * 4)];

        for (Student student : studentList2) {
            if (student != null) {
                this.put(student.getStudentID(), student);
            }
        }
    }

    @Override
    public Student get(int key) {
        int i = this.hash(key);

        while (this.studentList[i] != null) {
            if (this.studentList[i].getStudentID() == key) {
                return this.studentList[i];
            }
            i++;
            i %= this.capacity();

        }
        return null;
    }

    @Override
    public void put(int key, Student value) {

        int i = hash(key);

        if (value != null) {
            if (this.containsKey(key)) {
                System.out.println("Student already entered");
            } else if (studentList[hash(key)] == null) {
                studentList[hash(key)] = value;
            } else {

                while (this.studentList[i] != null) {
                    i = ++i % this.capacity();

                }
                this.studentList[i] = value;
            }
            if (loadFactor() >= 0.75) {
                this.rehash();
            }
        }

        System.out.println("Can't add null student");
    }

    @Override
    public boolean contains(Student value) {
        boolean found = false;

        for (int i = 0; !found && i < studentList.length; i++) {
            if (this.studentList[i] != null) {
                found = this.studentList[i].equals(value);
            }
        }
        return found;
    }

    @Override
    public boolean containsKey(int key) {
        return this.get(key) != null;
    }

    @Override
    public int hash(int key) {
        return key % capacity();
    }

    private int newPrime(int n) {
        for (int i = 2; 2 * i < n; i++) {
            if (n % i == 0) {
                return newPrime(++n);
            }
        }
        return n;
    }

}
