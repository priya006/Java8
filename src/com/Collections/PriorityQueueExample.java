package com.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {

        PriorityQueue<Integer> pQueue
                = new PriorityQueue<Integer>();

        PriorityQueue<Character> pQueueCharater
                = new PriorityQueue<Character>();

        pQueue.add(1234);
        pQueue.add(123);
        pQueue.add(14);
        pQueue.add(4);
        pQueue.add(1);

        char ch = 'a';
        int castAscii = (int) ch;
        System.out.println("Ascii: "+castAscii);

        pQueueCharater.add(ch);
        pQueueCharater.add('a');
        pQueueCharater.add('A');
        pQueueCharater.add('c');
        pQueueCharater.add('D');


        Iterator iteratorInteger = pQueue.iterator();
        Iterator iteratorCharacter = pQueueCharater.iterator();

        while (iteratorInteger.hasNext())
            System.out.println(iteratorInteger.next());

        while (iteratorCharacter.hasNext()) {

            System.out.println(iteratorCharacter.next());
        }


    }
}
