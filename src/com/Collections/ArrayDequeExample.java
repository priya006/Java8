package com.Collections;

import java.util.ArrayDeque;
import java.util.Iterator;

/*

    Elements could be added and removed from both front and rear

 */
public class ArrayDequeExample {


    public static void main(String[] args) {

        ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);

        // Initializing an deque
        de_que.add(1);
        de_que.add(2);
        de_que.add(3);
        de_que.add(4);
        de_que.add(5);
        de_que.add(6);

        Iterator iterator = de_que.iterator();
        while (iterator.hasNext()) {
            System.out.printf("Before removing or adding from Front and rear ends %d%n",iterator.next() );
        }


        de_que.addFirst(0);
        de_que.addLast(100);

        iterator = de_que.iterator();
        while (iterator.hasNext()) {
            System.out.printf("After  adding from Front and rear ends %d%n",iterator.next() );
        }

    }
}
