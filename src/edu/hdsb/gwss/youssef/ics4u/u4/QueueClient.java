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
public class QueueClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Will print 1 dequeue error and 2 enqueue errors");
        Queue queueArrayOne = new Queue(10);

        //test with newly created queue
        assert queueArrayOne.isEmpty() == true;
        assert queueArrayOne.isFull() == false;
        assert queueArrayOne.capacity() == 10;
        assert queueArrayOne.size() == 0;
        queueArrayOne.makeEmpty();

        System.out.println("Back: " + queueArrayOne.back());
        System.out.println("Front: " + queueArrayOne.front());
        System.out.println("DeQueue: " + queueArrayOne.dequeue());

        // fills queue
        for (int i = 0; i < queueArrayOne.capacity(); i++) {
            queueArrayOne.enqueue(i);
            assert queueArrayOne.isEmpty() == false;
        }
        queueArrayOne.enqueue(Integer.MIN_VALUE);

        assert queueArrayOne.isEmpty() == false;
        assert queueArrayOne.isFull() == true;
        assert queueArrayOne.capacity() == 10;
        assert queueArrayOne.size() == 10;
        assert queueArrayOne.front() == 0;
        assert queueArrayOne.back() == 9;

        for (int i = queueArrayOne.capacity(); i > 0; i--) {
            assert queueArrayOne.isEmpty() == false;
            assert queueArrayOne.size() == i;
            queueArrayOne.dequeue();
        }
        assert queueArrayOne.isEmpty() == true;

        //sets back pointer behind front pointer and not full
        queueArrayOne.enqueue(1);
        queueArrayOne.enqueue(1);
        queueArrayOne.enqueue(1);
        queueArrayOne.enqueue(1);
        queueArrayOne.enqueue(1);
        queueArrayOne.dequeue();
        queueArrayOne.dequeue();
        queueArrayOne.dequeue();
        queueArrayOne.enqueue(1);
        queueArrayOne.enqueue(1);
        queueArrayOne.enqueue(1);
        queueArrayOne.enqueue(1);
        queueArrayOne.enqueue(1);
        queueArrayOne.enqueue(1);
        assert queueArrayOne.size() == 8;
        assert queueArrayOne.isEmpty() == false;
        assert queueArrayOne.isFull() == false;

        //sets queue to full with back right behind front
        queueArrayOne.enqueue(1);
        queueArrayOne.enqueue(1);
        assert queueArrayOne.size() == 10;
        assert queueArrayOne.isEmpty() == false;
        assert queueArrayOne.isFull() == true;

        //return error
        queueArrayOne.enqueue(Integer.MIN_VALUE);

        //makes sure resests to empty
        queueArrayOne.makeEmpty();
        assert queueArrayOne.isEmpty() == true;

    }
}
